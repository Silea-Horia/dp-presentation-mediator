import bad.BadInventory;
import bad.BadPlayer;
import bad.BadQuestLog;
import good.*;
import shared.AchievementSystem;
import shared.Player;

public class PlayerFactory {
    public static Player createBadPlayer() {
        var achievementSystem = new AchievementSystem();
        var badInventory = new BadInventory(achievementSystem);
        var badQuestLog = new BadQuestLog();
        return new BadPlayer(badInventory, badQuestLog);
    }

    public static Player createGoodPlayer() {
        var mediator = new ConcreteMediator();
        var goodInventory = new GoodInventory(mediator);
        var goodQuestLog = new GoodQuestLog(mediator);
        var goodPlayer = new GoodPlayer(mediator);
        
        mediator.setAchievementSystem(new AchievementSystem())
                .setInventory(goodInventory)
                .setQuestLog(goodQuestLog)
                .setPlayer(goodPlayer);
        
        return goodPlayer;
    }
}


import bad.BadAchievementSystem;
import bad.BadInventory;
import bad.BadPlayer;
import bad.BadQuestLog;
import good.*;
import good.GoodAchievementSystem;
import shared.Player;

public class PlayerFactory {
    public static Player createBadPlayer() {
        var achievementSystem = new BadAchievementSystem();
        var badInventory = new BadInventory(achievementSystem);
        var badQuestLog = new BadQuestLog();
        return new BadPlayer(badInventory, badQuestLog);
    }

    public static Player createGoodPlayer() {
        var mediator = new ConcreteMediator();
        var goodAchievementSystem = new GoodAchievementSystem(mediator);
        var goodInventory = new GoodInventory(mediator);
        var goodQuestLog = new GoodQuestLog(mediator);
        var goodPlayer = new GoodPlayer(mediator);
        
        mediator.setAchievementSystem(goodAchievementSystem)
                .setInventory(goodInventory)
                .setQuestLog(goodQuestLog)
                .setPlayer(goodPlayer);
        
        return goodPlayer;
    }
}


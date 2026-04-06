package good;

import shared.*;

public class ConcreteMediator implements Mediator {
    private Player player;
    private Inventory inventory;
    private QuestLog questLog;
    private AchievementSystem achievementSystem;

    public ConcreteMediator setPlayer(Player player) {
        this.player = player;
        return this;
    }

    public ConcreteMediator setInventory(Inventory inventory) {
        this.inventory = inventory;
        return this;
    }

    public ConcreteMediator setQuestLog(QuestLog questLog) {
        this.questLog = questLog;
        return this;
    }

    public ConcreteMediator setAchievementSystem(AchievementSystem achievementSystem) {
        this.achievementSystem = achievementSystem;
        return this;
    }

    @Override
    public void questItemCollected() {
        this.player.levelUp();
    }

    @Override
    public void inventorySizeUpdated() {
        this.achievementSystem.checkInventoryAchievement(this.inventory);
    }

    @Override
    public void itemPickedUp(Item item) {
        this.inventory.addItem(item);
        this.questLog.checkQuestItem(this.player, item);
    }
}

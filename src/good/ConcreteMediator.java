package good;

import shared.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConcreteMediator implements Mediator {
    private Player player;
    private Inventory inventory;
    private QuestLog questLog;
    private AchievementSystem achievementSystem;

    private final Map<EventType, Consumer<Event>> handlers = new HashMap<>();

    public ConcreteMediator() {
        handlers.put(EventType.QUEST_ITEM_COLLECTED, this::questItemCollected);
        handlers.put(EventType.INVENTORY_SIZE_UPDATED, this::inventorySizeUpdated);
        handlers.put(EventType.ITEM_PICKED_UP, this::itemPickedUp);
    }

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
    public void notify(Colleague sender, Event event) {
        handlers.getOrDefault(event.type(), _ -> {}).accept(event);
    }

    private void questItemCollected(Event event) {
        this.player.levelUp();
    }

    private void inventorySizeUpdated(Event event) {
        this.achievementSystem.checkInventoryAchievement(this.inventory);
    }

    private void itemPickedUp(Event event) {
        if (event.payload() instanceof Item item) {
            this.inventory.addItem(item);
            this.questLog.checkQuestItem(this.player, item);
        }
    }
}

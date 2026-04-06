package bad;

import shared.Inventory;
import shared.Item;
import shared.Player;
import shared.QuestLog;

public class BadPlayer implements Player {
    private final Inventory inventory;
    private final QuestLog questLog;

    private int level = 1;

    public BadPlayer(Inventory inventory, QuestLog questLog) {
        this.inventory = inventory;
        this.questLog = questLog;
    }

    public void pickUpItem(Item item) {
        System.out.println("Picking up item...");
        this.inventory.addItem(item);
        this.questLog.checkQuestItem(this, item);
    }

    public void levelUp() {
        this.level++;
        System.out.println("Level up! Lvl: " + this.level);

    }
}

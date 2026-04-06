package bad;

import shared.AchievementSystem;
import shared.Inventory;
import shared.Item;

import java.util.HashSet;
import java.util.Set;

public class BadInventory implements Inventory {
    private final Set<Item> items = new HashSet<>();
    private final AchievementSystem achievementSystem;

    public BadInventory(AchievementSystem achievementSystem) {
        this.achievementSystem = achievementSystem;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.achievementSystem.checkInventoryAchievement(this);
    }

    public int itemCount() {
        return this.items.size();
    }
}

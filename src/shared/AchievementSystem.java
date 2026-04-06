package shared;

public interface AchievementSystem {
    int ACHIEVEMENT_ITEM_COUNT = 1;

    default void checkInventoryAchievement(Inventory inventory) {
        if (inventory.itemCount() == ACHIEVEMENT_ITEM_COUNT) {
            System.out.println("Inventory achievement has been completed!");
        }
    }
}

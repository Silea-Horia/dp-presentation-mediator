package shared;

public class AchievementSystem  {
    private static final int ACHIEVEMENT_ITEM_COUNT = 1;

    public void checkInventoryAchievement(Inventory inventory) {
        if (inventory.itemCount() == ACHIEVEMENT_ITEM_COUNT) {
            System.out.println("Inventory achievement has been completed!");
        }
    }
}
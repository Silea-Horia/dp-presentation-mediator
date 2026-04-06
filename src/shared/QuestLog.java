package shared;

public interface QuestLog {
    Item questItem = new Item("quest_item");

    void checkQuestItem(Player player, Item item);
}

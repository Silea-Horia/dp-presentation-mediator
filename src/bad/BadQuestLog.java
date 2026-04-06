package bad;

import shared.Item;
import shared.Player;
import shared.QuestLog;

public class BadQuestLog implements QuestLog {
    public void checkQuestItem(Player player, Item item) {
        if (questItem.equals(item)) {
            System.out.println("Quest item collected!");
            player.levelUp();
        }
    }
}

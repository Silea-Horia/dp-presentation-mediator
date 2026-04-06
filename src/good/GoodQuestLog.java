package good;

import shared.Item;
import shared.Player;
import shared.QuestLog;

public class GoodQuestLog extends Colleague implements QuestLog  {
    public GoodQuestLog(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void checkQuestItem(Player player, Item item) {
        if (questItem.equals(item)) {
            System.out.println("Quest item collected!");
            mediator.questItemCollected();
        }
    }
}

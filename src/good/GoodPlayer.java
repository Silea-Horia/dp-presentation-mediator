package good;

import shared.Item;
import shared.Player;

public class GoodPlayer extends Colleague implements Player {
    private int level = 1;

    public GoodPlayer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void pickUpItem(Item item) {
        this.mediator.itemPickedUp(item);
    }

    public void levelUp() {
        this.level++;
        System.out.println("Level up! Lvl: " + this.level);

    }
}

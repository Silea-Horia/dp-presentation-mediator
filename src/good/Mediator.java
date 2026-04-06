package good;

import shared.Item;

public interface Mediator {
    void questItemCollected();
    void inventorySizeUpdated();
    void itemPickedUp(Item item);
}

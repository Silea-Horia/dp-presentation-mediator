package good;

import shared.Inventory;
import shared.Item;

import java.util.HashSet;
import java.util.Set;

public class GoodInventory extends Colleague implements Inventory {
    private final Set<Item> items = new HashSet<>();

    public GoodInventory(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void addItem(Item item) {
        this.items.add(item);
        this.mediator.inventorySizeUpdated();
    }

    @Override
    public int itemCount() {
        return this.items.size();
    }
}

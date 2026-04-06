import shared.Item;

public class Main {
    public static void main(String[] args) {
        var questItem = new Item("quest_item");

        System.out.println("Bad player:");
        var badPlayer = PlayerFactory.createBadPlayer();
        badPlayer.pickUpItem(questItem);
        System.out.println();

        System.out.println("Good player:");
        var goodPlayer = PlayerFactory.createGoodPlayer();
        goodPlayer.pickUpItem(questItem);
    }
}
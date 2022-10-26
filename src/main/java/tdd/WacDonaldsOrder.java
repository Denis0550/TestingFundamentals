package tdd;

public class WacDonaldsOrder {
    //Create a method that calculates the final price when ordering at WacDonald's restaurant chain.
    //The prices per item unit are:
    //| Item             | Type  | Price |
    //|------------------|-------|-------|
    //| Cheeseburger     | Main  | 1.55  |
    //| Big burger       | Main  | 6.50  |
    //| Chicken nuggets  | Side  | 4.20  |
    //| French fries     | Side  | 1.90  |
    //| Great-Cola       | Drink | 1.65  |
    //| Water            | Drink | 2.00  |
    //| Apple juice      | Drink | 1.85  |
    //A 30% discount should be applied when a customer chooses a combo: one Main + one Side + one Drink.

    public double calculateOrder(String[] items) {
        double price = 0;
        int countMain = 0;
        int countSide = 0;
        int countDrink = 0;


        for (String item : items) {
            if (item.equals("Cheeseburger")) {
                price = price + 1.55;
                countMain = countMain + 1;
            }
            if (item.equals("Big burger")) {
                price = price + 6.50;
                countMain = countMain + 1;
            }
            if (item.equals("Chicken nuggets")) {
                price = price + 4.20;
                countSide = countSide + 1;
            }
            if (item.equals("French fries")) {
                price = price + 1.90;
                countSide = countSide + 1;
            }
            if (item.equals("Great-Cola")) {
                price = price + 1.65;
                countDrink = countDrink + 1;
            }
            if (item.equals("Water")) {
                price = price + 2.00;
                countDrink = countDrink + 1;
            }
            if (item.equals("Apple juice")) {
                price = price + 1.85;
                countDrink = countDrink + 1;
            }
        }

        if (countMain == 1 && countSide == 1 && countDrink == 1) {
            price = price * 0.70;
        }

        return price;
    }
}

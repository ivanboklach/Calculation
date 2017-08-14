package Gift;


public class MerryCristmas {

    public static void main(String[] args) {
        Sweetness Candy = new Sweetness("M&M", 10, 5, "Hard");
        Sweetness Jellybean = new Sweetness("JellyBelly", 8, 3, "Medium");
        Sweetness Cookie = new Sweetness("Oreo", 25, 10, "Mellow");
        Sweetness Marshmallows = new Sweetness("Marshmallows", 35, 13, "Mellow");

        GiftBox giftBox = new GiftBox("AnnyaGift");


        System.out.println("Подарок для " + giftBox.getNameBox() + " собран!");
        System.out.println("Вес подарка: " + (Candy.getWeight() + Jellybean.getWeight() + Cookie.getWeight() + Marshmallows.getWeight()) + " граммю.");
        System.out.println("Стоимость подарка: " + (Candy.getWorth() + Jellybean.getWorth() + Cookie.getWorth() + Marshmallows.getWorth()) + " единиц.");
        System.out.println("Состав: " + Candy.getName() + ", " + Jellybean.getName() + ", " + Cookie.getName() + ", " + Marshmallows.getName()+"\n");
        System.out.println("MERRY CRISTMAS!!!");

    }

}
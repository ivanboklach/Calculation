package Gift;


import java.util.ArrayList;
import java.util.List;

public class MerryCristmas {

    public static void main(String[] args) {
        Sweetness candy = new Candy("M&M", 10, 5, "Round");
        Sweetness jellyBelly = new Jellybean("JellyBelly", 8, 3, "Medium");
        Sweetness oreo = new Cookie("Oreo", 25, 10, "Medium");
        Sweetness marshmallows = new Marshmallows("Marshmallows", 35, 13, "Mellow");

        List<GiftBox> giftBox = new ArrayList<GiftBox>();
        giftBox.add(candy);
        giftBox.add(jellyBelly);
        giftBox.add(oreo);
        giftBox.add(marshmallows);



        System.out.println("Подарок - " + giftBox.getNameBox() + " собран!");

        System.out.println("MERRY CRISTMAS!!!");


    }

}
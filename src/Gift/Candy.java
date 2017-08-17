package Gift;


public class Candy extends Sweetness {
    private String roundness;


    public Candy(String name, int weight, int worth, String roundness) {
        super(name, weight, worth);
        this.roundness = roundness;
    }
}

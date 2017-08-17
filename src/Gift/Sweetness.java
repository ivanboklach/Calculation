package Gift;


public abstract class Sweetness {

    private String name;
    private int weight;
    private int worth;



    public Sweetness(String name, int weight, int worth){
        this.name = name;
        this.weight = weight;
        this.worth = worth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
        {
            System.out.println("У сладости должно быть название;)");
        } else
        {
            this.name = name;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight<0)
        {
            System.out.println("У сладости должен быть вес");
        } else
        {
            this.weight = weight;
        }
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        if (worth<0)
        {
            System.out.println("Бесплатный сыр в мышеловке!");
        } else
        {
            this.worth = worth;
        }
    }

    @Override
    public String toString() {
        return "Sweetness{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", worth=" + worth +
                '}';
    }
}

package Gift;


import java.util.List;

public class GiftBox {
    private String nameBox;
    private int weightBox;
    private int worthBox;
    private List<Sweetness> sweetnessList;

    public GiftBox(String nameBox) {
        this.nameBox = nameBox;
    }

    public void setNameBox(String nameBox) {
        this.nameBox = nameBox;
    }

    public int getWeightBox() {
        return weightBox;
    }

    public int getWorthBox() {
        return worthBox;
    }

    public String getNameBox() {
        return nameBox;
    }

    public void setSweetnessList(List<Sweetness> sweetnessList) {
        this.sweetnessList = sweetnessList;
    }

    @Override
    public String toString() {
        return "GiftBox{" +
                "nameBox='" + nameBox + '\'' +
                ", weightBox=" + weightBox +
                ", worthBox=" + worthBox +
                ", sweetnessList=" + sweetnessList +
                '}';
    }
}

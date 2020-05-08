package pro.edu;

public class Tara extends Box {

    private String color;
    private String material;
    private int weightInGramms;
    private Boolean returnable;

    public Tara() {
    }

    public Tara(String color, String material, int weightInGramms, Boolean returnable) {
        this.color = color;
        this.material = material;
        this.weightInGramms = weightInGramms;
        this.returnable = returnable;
    }

    public Tara(int length, int width, int height, String color, String material, int weightInGramms, Boolean returnable) {
        super(length, width, height);
        this.color = color;
        this.material = material;
        this.weightInGramms = weightInGramms;
        this.returnable = returnable;
    }

    public void setLength(int length){
        super.setLength(length);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWeightInGramms() {
        return weightInGramms;
    }

    public void setWeightInGramms(int weightInGramms) {
        this.weightInGramms = weightInGramms;
    }

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }


    @Override
    public String toString() {
        return "Tara{" +
                super.toString()+
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", weightInGramms=" + weightInGramms +
                ", returnable=" + returnable +
                '}';
    }
}

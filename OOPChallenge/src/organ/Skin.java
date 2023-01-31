package organ;

public class Skin extends Organ {
    private String color;
    private int softness;
    public Skin(String name, String condition, String color, int softness) {
        super(name, condition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    protected void additionalCondition() {
        System.out.println("Skin color " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}

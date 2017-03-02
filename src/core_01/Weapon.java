package core_01;


public class Weapon {

    private String name;
    private String model;
    private int ammunition;
    private int precision;

    public Weapon(String name, String model, int ammunition, int precision) {
        this.name = name;
        this.model = model;
        this.ammunition = ammunition;
        this.precision = precision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

}

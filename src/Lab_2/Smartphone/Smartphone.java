package Lab_2.Smartphone;

public class Smartphone {
    String brand;
    String model;
    Integer batt_cap;
    Color color;
    Integer price;

    public Smartphone() {

    }
    public Smartphone(String brand, String model, Integer batt_cap, Color color, Integer price) {
        this.brand = brand;
        this.model = model;
        this.batt_cap = batt_cap;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getBatt_cap() {
        return batt_cap;
    }

    public void setBatt_cap(Integer batt_cap) {
        this.batt_cap = batt_cap;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batt_cap=" + batt_cap +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}

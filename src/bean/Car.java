package bean;

public class Car {
    private String brand;
    private String model;
    private String situation;
    private String year;
    private int price;

    public Car() {
    }

    public Car(String brand, String model, String situation, String year, int price) {
        this.brand = brand;
        this.model = model;
        this.situation = situation;
        this.year = year;
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

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFullInfo() {
        return "Brand:" + this.getBrand() + " Model:" + this.getModel() + " Situation:" + this.getSituation() + " Year:" + this.getYear() + " Price:" + this.getPrice()+"$";
    }
}

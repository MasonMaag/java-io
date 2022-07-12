package com.devmountain.objects;

public class Ram {
    private String brand;
    private String name;
    private String type;
    private String speed;
    private String modules;
    private String capacity;
    private String price;

    public Ram(String[] values){
        this.brand = values[0];
        this.name = values[1];
        this.type = values[2];
        this.speed = values[3];
        this.modules = values[4];
        this.capacity = values[5];
        this.price = values[6];
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", modules=" + modules +
                ", capacity='" + capacity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

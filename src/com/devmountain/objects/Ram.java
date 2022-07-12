package com.devmountain.objects;

public class Ram {
    private String brand;
    private String name;
    private String type;
    private Integer speed;
    private Integer modules;
    private String capacity;
    private String price;

    public Ram(String[] values){
        this.brand = values[0];
        this.name = values[1];
        this.type = values[2];
        this.speed = Integer.parseInt(values[3]);
        this.modules = Integer.parseInt(values[4]);
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

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getModules() {
        return modules;
    }

    public void setModules(Integer modules) {
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

package com.devmountain.objects;

import java.util.List;

public class Storage {
    private String brand;
    private String name;
    private String capacity;
    private String type;
    private String formFactor;
    private String price;

    public Storage(List<String> values){
        this.brand = values.get(0);
        this.name = values.get(1);
        this.capacity = values.get(2);
        this.type = values.get(3);
        this.formFactor = values.get(4);
        this.price = values.get(5);
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", capacity='" + capacity + '\'' +
                ", type='" + type + '\'' +
                ", formFactor='" + formFactor + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

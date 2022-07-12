package com.devmountain.objects;

public class CpuCooler {
    private String brand;
    private String name;
    private String type;
    private String radiator;
    private String price;

    public CpuCooler(String brand, String name, String type, String radiator, String price) {
        this.brand = brand;
        this.name = name;
        this.type = type;
        this.radiator = radiator;
        this.price = price;
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

    public String getRadiator() {
        return radiator;
    }

    public void setRadiator(String radiator) {
        this.radiator = radiator;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CpuCooler{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", radiator='" + radiator + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
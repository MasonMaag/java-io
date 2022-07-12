package com.devmountain.objects;

public class Cpu {
    private String brand;
    private String level;
    private String name;
    private String cores;
    private String threads;
    private String coreClock;
    private String boostClock;
    private String watts;
    private String intGraphics;
    private String socket;
    private String price;


    public Cpu(String brand, String level, String name, String cores, String threads, String coreClock,
               String boostClock, String watts, String intGraphics, String socket, String price) {
        this.brand = brand;
        this.level = level;
        this.name = name;
        this.cores = cores;
        this.threads = threads;
        this.coreClock = coreClock;
        this.boostClock = boostClock;
        this.watts = watts;
        this.intGraphics = intGraphics;
        this.socket = socket;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getThreads() {
        return threads;
    }

    public void setThreads(String threads) {
        this.threads = threads;
    }

    public String getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(String coreClock) {
        this.coreClock = coreClock;
    }

    public String getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(String boostClock) {
        this.boostClock = boostClock;
    }

    public String getWatts() {
        return watts;
    }

    public void setWatts(String watts) {
        this.watts = watts;
    }

    public String getIntGraphics() {
        return intGraphics;
    }

    public void setIntGraphics(String intGraphics) {
        this.intGraphics = intGraphics;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "brand='" + brand + '\'' +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", cores='" + cores + '\'' +
                ", threads='" + threads + '\'' +
                ", coreClock='" + coreClock + '\'' +
                ", boostClock='" + boostClock + '\'' +
                ", watts='" + watts + '\'' +
                ", intGraphics='" + intGraphics + '\'' +
                ", socket='" + socket + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

package ba.unsa.etf.rpr;

import java.io.Serializable;

public class Laptop implements Serializable {
    private String brand, model, cpu, gpu;
    private Double price, size;
    private Integer ram, hdd, ssd;

    public Laptop() {}

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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(brand).append(" | ")
                                  .append(model).append(" | ")
                                  .append(cpu).append(" | ")
                                  .append(gpu).append(" | ")
                                  .append(price).append(" | ")
                                  .append(size).append(" | ")
                                  .append(ram).append(" | ")
                                  .append(hdd).append(" | ")
                                  .append(ssd).toString();
    }
}

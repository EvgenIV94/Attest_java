package Attest_java;
import java.util.Objects;

public class Notebook {
    private String brand;
    private int ram; // in GB
    private int hdd; // in GB
    private String os;
    private String color;

    public Notebook(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return ram == notebook.ram && hdd == notebook.hdd && brand.equals(notebook.brand) && os.equals(notebook.os) && color.equals(notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, hdd, os, color);
    }
}

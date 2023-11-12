package ba.unsa.etf.rpr;

import java.util.ArrayList;

public interface LaptopRecord {
    void add(Laptop laptop);
    void addAll(ArrayList<Laptop> laptops);
    void clear();

    boolean writeFile();
    ArrayList<Laptop> readFile();

    Laptop getLaptop(String cpu) throws InvalidCpuException;
}

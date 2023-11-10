package ba.unsa.etf.rpr;

import java.util.ArrayList;

public interface LaptopRecord {
    void addToList(Laptop laptop);
    void addAllToList(ArrayList<Laptop> laptops);
    void clearList();

    void addToFile(Laptop laptop);
    void getFileData();

    Laptop getLaptop(String cpu) throws InvalidCpuException;
}

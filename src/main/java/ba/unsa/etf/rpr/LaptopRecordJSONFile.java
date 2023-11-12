package ba.unsa.etf.rpr;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class LaptopRecordJSONFile implements LaptopRecord {
    private final File file;
    private final List<Laptop> laptops;

    public LaptopRecordJSONFile(String file) {
        this.file = new File(file);
        this.laptops = new ArrayList<>();
    }

    @Override
    public void addToList(Laptop laptop) {
        laptops.add(laptop);
    }

    @Override
    public void addAllToList(ArrayList<Laptop> laptops) {
        this.laptops.addAll(laptops);
    }

    @Override
    public void clearList() {
        laptops.clear();
    }

    @Override
    public boolean writeToFile() {
        return false;
    }

    @Override
    public ArrayList<Laptop> readFromFile() {
        return null;
    }

    @Override
    public Laptop getLaptop(String cpu) throws InvalidCpuException {
        for (Laptop laptop : laptops) {
            if (laptop.getCpu().equals(cpu)) {
                return laptop;
            }
        }

        throw new InvalidCpuException("");
    }
}

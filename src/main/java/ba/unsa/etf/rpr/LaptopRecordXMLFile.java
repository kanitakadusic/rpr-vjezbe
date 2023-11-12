package ba.unsa.etf.rpr;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class LaptopRecordXMLFile implements LaptopRecord {
    private final File file;
    private final List<Laptop> laptops;

    public LaptopRecordXMLFile(String file) {
        this.file = new File(file);
        this.laptops = new ArrayList<>();
    }

    @Override
    public void add(Laptop laptop) {
        laptops.add(laptop);
    }

    @Override
    public void addAll(ArrayList<Laptop> laptops) {
        this.laptops.addAll(laptops);
    }

    @Override
    public void clear() {
        laptops.clear();
    }

    @Override
    public boolean writeFile() {
        return false;
    }

    @Override
    public ArrayList<Laptop> readFile() {
        return null;
    }

    @Override
    public Laptop getLaptop(String cpu) throws InvalidCpuException {
        for (Laptop laptop : laptops) {
            if (laptop.getCpu().equals(cpu)) {
                return laptop;
            }
        }

        throw new InvalidCpuException("");    }
}

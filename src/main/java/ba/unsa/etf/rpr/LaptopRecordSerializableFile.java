package ba.unsa.etf.rpr;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class LaptopRecordSerializableFile implements LaptopRecord {
    private final File file;
    private final List<Laptop> laptops;

    public LaptopRecordSerializableFile(String file) {
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
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file.getPath()));
            stream.writeObject(laptops);
            stream.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public ArrayList<Laptop> readFile() {
        ArrayList<Laptop> laptops;

        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file.getPath()));
            laptops = (ArrayList<Laptop>) stream.readObject();
            stream.close();
        } catch (Exception e) {
            return null;
        }

        return laptops;
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

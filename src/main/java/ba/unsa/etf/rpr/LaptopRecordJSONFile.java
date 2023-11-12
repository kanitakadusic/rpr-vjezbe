package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(file, laptops);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public ArrayList<Laptop> readFile() {
        ArrayList<Laptop> laptops;

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            laptops = objectMapper.readValue(file, new TypeReference<>() {});
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

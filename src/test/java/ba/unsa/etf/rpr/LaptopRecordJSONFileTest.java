package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import java.util.ArrayList;

class LaptopRecordJSONFileTest {
    private Laptop laptop;
    private LaptopRecordJSONFile jsonFile;

    @BeforeEach
    public void beforeEachTest() {
        laptop = new Laptop();
        laptop.setBrand("brand");
        laptop.setModel("model");
        laptop.setCpu("cpu");
        laptop.setGpu("gpu");
        laptop.setPrice(1.1);
        laptop.setSize(2.2);
        laptop.setRam(3);
        laptop.setHdd(4);
        laptop.setSsd(5);

        jsonFile = new LaptopRecordJSONFile("test.json");
        jsonFile.add(laptop);
    }

    @Test
    public void writeReadFile() {
        LaptopRecordJSONFile jsonFileMock = Mockito.spy(jsonFile);
        jsonFileMock.writeFile();

        ArrayList<Laptop> test = new ArrayList<>();
        test.add(laptop);

        assertEquals(test.toString(), jsonFileMock.readFile().toString());
    }

    @Test
    public void getLaptop() {
        try {
            assertEquals(laptop, jsonFile.getLaptop("cpu"));
        } catch (InvalidCpuException e) {
            System.out.println(e.getMessage());
        }
    }
}
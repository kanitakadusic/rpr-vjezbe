package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = null;
        Laptop laptop = new Laptop();

        laptop.setBrand("brand");
        laptop.setModel("model");
        laptop.setCpu("cpu");
        laptop.setGpu("gpu");
        laptop.setPrice(1.1);
        laptop.setSize(2.2);
        laptop.setRam(3);
        laptop.setHdd(4);
        laptop.setSsd(5);


        LaptopRecordSerializableFile binary = new LaptopRecordSerializableFile("binaryFile.dat");
        binary.add(laptop);

        binary.writeFile();
        laptops = binary.readFile();

        System.out.println(laptops);


        LaptopRecordXMLFile xml = new LaptopRecordXMLFile("xmlFile.xml");
        xml.add(laptop);

        xml.writeFile();
        laptops = xml.readFile();

        System.out.println(laptops);


        LaptopRecordJSONFile json = new LaptopRecordJSONFile("jsonFile.json");
        json.add(laptop);

        json.writeFile();
        laptops = json.readFile();

        System.out.println(laptops);
    }
}
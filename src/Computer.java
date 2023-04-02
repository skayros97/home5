class RAM{
    private String name ;
    private int value;

    public RAM(String name, int value) {
        this.name = name;
        this.value = value;
    }
    public void printinforRAM(){
        System.out.println(" RAM: "+ name + " " +value);
    }
}
class HDD{
    private String name;
    private int value;
    private String type;

    public HDD(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }
    public void printinforHDD(){
        System.out.println(" HDD: " + name + " " + value + " " + type);
    }
}

public class Computer {
    private String model;
    private int price;
    private RAM ram;
    private HDD hdd;

    public Computer(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public Computer(String model, int price, RAM ram, HDD hdd) {
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void printinfocomputer1(){
        System.out.println(" компьютер1 "+ model + " " + price);
    }
    public void printinfocomputer2(){
        System.out.println(" комютер2 "+ model + " " + price );
        ram.printinforRAM();
        hdd.printinforHDD();
    }
}

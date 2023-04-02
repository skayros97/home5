import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();
        card1.Getcard(100.5,4235);
        card2.Getcard(115.6,3386);
        card3.Getcard(125.7,4455);
        card1.GetMoney(50);
        card2.GetMoney(55);
        card3.TakeMonet(25.7);
        card1.Infodeposit();
        card2.Infodeposit();
        card3.Infodeposit();
        ATM atm1 = new ATM(5,5,0);
        atm1.Takemoney(170);
        Computer computer1 = new Computer("acer",1000);
        RAM ram = new RAM("samsung",16);
        HDD hdd = new HDD("toshiba", 1000, "встроенный");
        Computer computer2 = new Computer("Dell",3000, ram,hdd);
        computer1.printinfocomputer1();
        computer2.printinfocomputer2();
    }
}
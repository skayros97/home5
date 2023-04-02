public class CreditCard {
    double Money;
    double Deposit;
    public void Getcard(double money, double deposit){
        this.Money = money;
        this.Deposit = deposit;
    }

    public void GetMoney(double addmoney) {
      Money += addmoney;
    }
    public void TakeMonet(double takemoney){
        if (takemoney > Money){
            System.out.println("Сумма на депозите меньше чем введенное число");
        }
        else Money -= takemoney;
    }
    public void Infodeposit() {
        System.out.println(" Сумма на счете " + Money);
        System.out.println(" номер счета " + Deposit);
    }

}

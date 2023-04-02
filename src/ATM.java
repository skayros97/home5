public class ATM {
    private int twentybills;
    private int fiftybills;
    private int hundredbills;

    public ATM(int twentyCount, int fiftyCount, int hundredCount) {
        this.twentybills = twentyCount;
        this.fiftybills = fiftyCount;
        this.hundredbills = hundredCount;
    }

    public void addMoney(int twentybills, int fiftybills, int  hundredbills) {
        this.twentybills += twentybills;
        this.fiftybills += fiftybills;
        this.hundredbills += hundredbills;
    }
    public boolean Takemoney(int money) {

        int hundredWithdrawBills = Math.min(money / 100, this.hundredbills);
        money -= hundredWithdrawBills * 100;
        int fiftyWithdrawBills = Math.min(money / 50, this.fiftybills);
        money -= fiftyWithdrawBills * 50;
        int twentyWithdrawBills = Math.min(money / 20, this.twentybills);
        money -= twentyWithdrawBills * 20;


        if (money == 0) {
            this.hundredbills -= hundredWithdrawBills;
            this.fiftybills -= fiftyWithdrawBills;
            this.twentybills -= twentyWithdrawBills;
            System.out.println("Выдано " + hundredWithdrawBills + " купюр номиналом 100, "
                    + fiftyWithdrawBills + " купюр номиналом 50, " + twentyWithdrawBills + " купюр номиналом 20");
            return true;
        } else {
            System.out.println(" ошибка ");
            return false;
        }
    }
}
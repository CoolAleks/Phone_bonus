public class Main {
    public static void main(String[] args) {
        int currentAccount = 100; // ввести сумма на счёте
        int incomeSum = 1000; //ввести сумму пополнения
        int bonusRate = 100;
        int finalAccount;
        int totalBonus;
        if (incomeSum >= 1000) {
            totalBonus = incomeSum / bonusRate;
            System.out.println("BonusSum: " + totalBonus);
        } else {
            totalBonus = 0;
            System.out.println("BonusSum:" + totalBonus);
        }
    }
}

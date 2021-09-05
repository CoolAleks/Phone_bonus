public class Main {
    public static void main(String[] args) {
        int currentAccount = 100; // ввести сумму на счёте
        int incomeSum = 10000; //ввести сумму пополнения
        int bonusRate=100;
        int totalBonus;
        int FinalAccount;
        if (incomeSum > 1000) {
            totalBonus = incomeSum / bonusRate;
        } else {
            totalBonus = 0;
        }
        FinalAccount=currentAccount+incomeSum+totalBonus;
        System.out.println("BonusSum:" + totalBonus);
        System.out.println("FinalAccount "+FinalAccount);
    }
}

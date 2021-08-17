public class Main {
    public static void main(String[] args) {
        int current_account=100; // ввести сумма на счёте
        int income_sum=1000; //ввести сумму пополнения
        int bonus_rate=100;
        int final_account;
        int total_bonus;
       if (income_sum>=1000) {
            total_bonus=income_sum/bonus_rate;
          final_account=current_account+income_sum+total_bonus;
        System.out.println("Bonus sum: "+total_bonus);
           System.out.println("Final sum: "+final_account);
       }
       else {
           final_account=current_account+income_sum;
           System.out.println("Final account:"+final_account);
    }
    }
}

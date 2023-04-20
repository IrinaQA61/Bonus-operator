// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int startingbalance = 100;
        int bonusScale = 100;
        int accountToppedUp = 2000;
        int bonus;

        if (accountToppedUp >= 1000) {
            bonus = accountToppedUp / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = startingbalance + accountToppedUp + bonus;

        System.out.println("Вы пополнили счёт на " + accountToppedUp + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");

    }
}
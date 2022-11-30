import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("Ваш счет:" + bankAccount.getAmount());
        Scanner scanner = new Scanner(System.in);

        while (true){
            int schet = scanner.nextByte();
            try {
                bankAccount.withDraw(schet);
                System.out.println("Вы сняли:" + schet);
            } catch (LimitException e) {
                System.out.println(" Недостаточно денег на счету! Снято:" + e.getRemainingAmount());
                bankAccount.withDraw((int) e.getRemainingAmount());
                break;
            }
        }
        System.out.println("На ваше счете" + bankAccount.getAmount());
    }
    }






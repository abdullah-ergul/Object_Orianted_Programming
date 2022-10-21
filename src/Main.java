import BEng_2_1_NehadTARamaha.week03_Access_Modifiers.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        BankAccount example = new BankAccount(5960, "Abdullah");

        example.withdraw();
        System.out.println(example.getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount example = new BankAccount(5960, "Abdullah");

        example.withdraw();
        System.out.println(example.getBalance());
    }
}

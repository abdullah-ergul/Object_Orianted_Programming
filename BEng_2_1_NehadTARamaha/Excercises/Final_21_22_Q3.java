package BEng_2_1_NehadTARamaha.Excercises;

import java.util.ArrayList;
import java.util.Collections;


class BankAccount implements Comparable<BankAccount> {
    int accountNo;
    String holderName;
    double balance;

    public BankAccount(int accountNo, String holString, double balance) {
        this.accountNo = accountNo;
        this.holderName = holString;
        this.balance = balance;
    }

    void balanceChange(double amount) {
        this.balance -= amount;
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.holderName.compareTo(o.holderName);
    }

    @Override
    public String toString() {
        return this.accountNo + " : " + this.holderName + " : " + this.balance;
    }
}


public class Final_21_22_Q3 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(11, "Abdullah", 1907);
        BankAccount a2 = new BankAccount(12, "Emrah", 1905);
        BankAccount a3 = new BankAccount(13, "Mert", 1923);
        BankAccount a4 = new BankAccount(14, "Can", 1905);

        ArrayList<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1); myAccounts.add(a2); myAccounts.add(a3); myAccounts.add(a4);

        Collections.sort(myAccounts);

        for(BankAccount b : myAccounts) {
            b.balanceChange(500);
        }

        for(BankAccount b : myAccounts) {
            System.out.println(b);
        }
    }
}

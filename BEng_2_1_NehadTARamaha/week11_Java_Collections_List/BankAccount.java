package BEng_2_1_NehadTARamaha.week11_Java_Collections_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Account implements Comparable<Account> {
    int accountNo;
    String holderName;
    double balance;

    Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void balanceChange(double amounth) {
        this.balance -= amounth;
    }

    @Override
    public String toString() {
        return this.accountNo + " " + this.holderName + " " + this.balance;
    }

    // ? 2 -----------------------------------------------------------------------------
    @Override
    public int compareTo(Account o) {
        return this.holderName.compareTo(o.holderName);
    }
}

public class BankAccount {
    // ! MAIN SECTION
    public static void main(String[] args) {

        // ? 1 -------------------------------------------------------------------------
        List<Account> myAccounts = new ArrayList<>();

        myAccounts.add(new Account(1011, "Peter", 5146));
        myAccounts.add(new Account(1089, "Lois", 89521));
        myAccounts.add(new Account(1053, "Brian", 40312));

        // ? 2 -------------------------------------------------------------------------
        Collections.sort(myAccounts);

        // ? 3 -------------------------------------------------------------------------
        for(Account a : myAccounts) {
            a.balanceChange(500);
        }

        System.out.println(myAccounts);
    }
    // ! MAIN SECTION
}

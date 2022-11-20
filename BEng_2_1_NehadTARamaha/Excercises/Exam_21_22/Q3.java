package BEng_2_1_NehadTARamaha.Excercises.Exam_21_22;


class NFT{
    private double balance;
    private String owner;

    public void setBalance(double balance){
        if(balance<0 || balance>10000)
            throw new IllegalArgumentException("Balance must be [0,10000] range");
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

public class Q3 {
    public static void main(String[] args) {
        NFT n1= new NFT();
        NFT n2= new NFT();

        try{
            n1.setBalance(1190);
            n1.setOwner("Abdullah");
            n2.setBalance(16793);
            n2.setOwner("Emre");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

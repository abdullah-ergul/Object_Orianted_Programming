package BEng_2_1_KasimOzacar.week08_Inheritance;


class Company {
    private String name;

    protected String getAdress() {
        return "Company's Adress";
    }

    public void print() {
        System.out.println("Hi!");
    }
}

class AkinSoft extends Company {
    @Override
    public String getAdress() {
        return "AkinSoft's Adress";
    }
}

class GoogleCompany extends Company {
    @Override
    protected String getAdress() {
        return "Google Company's Adress";
    }

    public void print() {
        System.out.println("Hi,");
        this.DoSomething();
    }

    private void DoSomething() {
        System.out.println("Do Something!");
    }
}

class MicrosoftCompany extends Company {
    @Override
    public String getAdress() {
        return "Microsoft Company's Adress";
    }
}

public class Companies {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Company company= new Company();
        AkinSoft akinSoft= new AkinSoft();
        GoogleCompany googleCompany= new GoogleCompany();
        MicrosoftCompany microsoftCompany= new MicrosoftCompany();

        company.getAdress();
        akinSoft.getAdress();
        googleCompany.getAdress();
        microsoftCompany.getAdress();

        googleCompany.print();
    }
    // ! MAIN SECTION
}

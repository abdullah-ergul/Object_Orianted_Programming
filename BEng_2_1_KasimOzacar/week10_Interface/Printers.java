package BEng_2_1_KasimOzacar.week10_Interface;


interface ColorPrintBehaviour {
    void coloredPrint();
}

interface FaxBehaviour {
    void fax();
}

interface ScanBehaviour {
    void scan();
}

interface PrintBehaviour {
    void print();
}

class Printer implements PrintBehaviour {
    @Override
    public void print() {
        System.out.println("Printing!");
    }
}

class CanonProfessional extends Printer implements ColorPrintBehaviour, FaxBehaviour, ScanBehaviour {
    @Override
    public void scan() {
        System.out.println("Cannon Professional Scanned!");
    }

    @Override
    public void fax() {
        System.out.println("Cannon Professional Faxed!");
    }

    @Override
    public void coloredPrint() {
        System.out.println("Cannon Professional Print Colored!");
    }
}

class CanonBasic extends Printer {
    @Override
    public void print() {
        System.out.println("Cannon Basic Printing!");
    }
}

class CannonOffice extends Printer implements FaxBehaviour, ScanBehaviour {
    @Override
    public void scan() {
        System.out.println("Cannon Office Scanned!");
    }

    @Override
    public void fax() {  
        System.out.println("Cannon Office Faxed!");
    }
}


public class Printers {
    // ! MAIN SECTION
    public static void main(String[] args) {
        CanonBasic canonBasicPrinter= new CanonBasic();
        CannonOffice cannonOfficePrinter= new CannonOffice();
        CanonProfessional canonProfessionalPrinter= new CanonProfessional();

        Printer[] printers= {canonBasicPrinter, cannonOfficePrinter, canonProfessionalPrinter};

        for(Printer print: printers) {
            if(print instanceof ColorPrintBehaviour)
                ((ColorPrintBehaviour)print).coloredPrint();
        }
    }
    // ! MAIN SECTION
}

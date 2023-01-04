package BEng_2_1_KasimOzacar.week13_FileOperators_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class FileOperators {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Elon Musk", 928465423);

        try {
            Engineer loaded = SaveLoadManager.load();
        }catch(Exception e) {

        }
    }
    // ! MAIN SECTION
}

class Engineer implements Serializable{
    private static int id;
    private String fullName;
    private double salary;

    Engineer(String fullName, double salary) {
        id++;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }
}

class SaveLoadManager {
    static String filePath= "C:";

    static void save(Engineer engineer) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(engineer);


        fileOutputStream.close();
        objectOutputStream.close();
    }

    static Engineer load() {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.readObject();
    }
}

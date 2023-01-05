package BEng_2_1_KasimOzacar.week13_FileOperators_GUI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class FileOperator {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Elon Musk", 928465423);

        try {
            SaveLoadManager.save(engineer);
            Engineer loaded = SaveLoadManager.load();
            System.out.println(loaded);
        }catch(Exception e) {
            System.out.println(e.getMessage());
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
    public String toString() {
        return this.fullName + " : " + this.salary;
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
    static String filePath= "C:\\Users\\Abdullah\\OneDrive\\Abdullah\\Coding\\Object_Orianted_Programming\\BEng_2_1_KasimOzacar\\week13_FileOperators_GUI\\file.txt";

    static void save(Engineer engineer) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(engineer);


        fileOutputStream.close();
        objectOutputStream.close();
    }

    static Engineer load() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Engineer engineer = (Engineer) objectInputStream.readObject();

        fileInputStream.close();
        objectInputStream.close();

        return engineer;
    }
}

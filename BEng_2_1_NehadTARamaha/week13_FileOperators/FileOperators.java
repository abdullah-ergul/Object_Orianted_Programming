package BEng_2_1_NehadTARamaha.week13_FileOperators;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class FileOperators {
    // ! MAIN SECTION
    public static void main(String[] args) {
        Student s1=new Student(100,"Ali",40,60);

        try {
            FileManager.saveToFile(s1, "C:\\Users\\Abdullah\\OneDrive\\Abdullah\\Coding\\Object_Orianted_Programming\\BEng_2_1_NehadTARamaha\\week13_FileOperators\\MyFile2.txt");
            Student ss= FileManager.getFromFile("C:\\Users\\Abdullah\\OneDrive\\Abdullah\\Coding\\Object_Orianted_Programming\\BEng_2_1_NehadTARamaha\\week13_FileOperators\\MyFile2.txt");
            System.out.println(ss);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    // ! MAIN SECTION
}

class Student implements Serializable{
    int id;
    String name;
    int midTerm;
    int finalExam;

    public Student(int id, String Name, int midTerm, int finalExam) {
        this.id = id;
        this.name = Name;
        this.midTerm = midTerm;
        this.finalExam = finalExam;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " midTerm: " + midTerm + " finalExam: " + finalExam;
    } 
}

class FileManager {
    public static void saveToFile(Student s, String path) throws Exception {
        FileOutputStream  fo= new FileOutputStream(path);
        ObjectOutputStream objectOut = new ObjectOutputStream(fo);
        objectOut.writeObject(s);
        objectOut.close();
    }
 
    public static Student getFromFile(String path) throws Exception {
        FileInputStream  fileIn= new FileInputStream(path);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        Student s=(Student)objectIn.readObject();
        objectIn.close();
        return s;
    }

}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLoadManager {

    static String filePath ="C:\\Users\\Abdullah\\OneDrive\\Abdullah\\Coding\\Object_Orianted_Programming\\BEng_2_1_KasimOzacar\\week13_FileOperators_GUI\\GUI\\src\\mydata.txt";
    static void save(Engineer engineer) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(engineer);
        objectOutputStream.close();
    }

    static Engineer load() throws Exception{
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Engineer loaded = (Engineer) objectInputStream.readObject();
        objectInputStream.close();
        return loaded;
    }
}

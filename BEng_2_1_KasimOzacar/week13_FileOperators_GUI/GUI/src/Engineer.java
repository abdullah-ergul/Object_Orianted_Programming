import java.io.Serializable;

public class Engineer implements Serializable {
    static int id;
    String fullName;
    double salary;

    public Engineer(String fullName, double salary) {
        id++;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id +", " + fullName + ", " + salary;
    }
}

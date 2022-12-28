package BEng_2_1_KasimOzacar.week07_Examles.University_Example;


public class University {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Teacher teacher = new Teacher("JOHN NASH", Branch.MATH);
        Student student1= new Student(12131,"mariam", "asdsa");
        student1.setMidTerm(99);
        student1.setFinExam(50);

        Student student2= new Student(4545,"hamid", "asdsad", 75, 90);
        student2.setMidTerm(90);

        Student student3= new Student(657657,"random", "asdsa");
        student3.setMidTerm(45);
        student3.setFinExam(80);


    Student[] students = new Student[]{student1, student2,student3};

        teacher.setStudents(students);
        System.out.println(teacher.getBranchDescription());
        teacher.printStudentsScores();
        System.out.println(teacher.getNumberOFStudents());
    }
}
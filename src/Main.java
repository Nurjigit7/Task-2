import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 =new Student("Nurjigit","Umarov",22);
        Student student2 =new Student("Nurjigit","adijalilovich",20);
        Student student3 =new Student("Pysbek","Sharapov",25);
        Student student4 =new Student("Ruslan","Bekbolov",27);
        Student student5 =new Student("Ernist","Osorov",22);
        Student[]students={student1,student2,student3,student4,student5};
        System.out.println(namestudent(students, "Nur"));
    }
   public static Student[] namestudent(Student[] student, String name) {
       for (int i = 0; i < student.length; i++) {
           if (student[i].getName().contains(name)) {
               student[i].getName().equalsIgnoreCase(name);

           }
       }
           return student;

   }
}
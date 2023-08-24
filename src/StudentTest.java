class Student{
    public int roll;
    public String name;
    public String course;
    public int mark1, mark2, mark3;

    public double total(){
        return mark1 + mark2 + mark3;
    }
    public double average(){
        return total()/3;
    }
    public char grade(){
        if (average() > 70){
            return 'A';
        } else if (average() >= 60 && average() < 70){
            return 'B';
        } else if (average() >= 50 && average() < 60){
            return 'C';
        } else {
            return 'F';
        }

    }

}
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.mark1 = 70;
        student.mark2 = 80;
        student.mark3 = 33;

        System.out.printf("%s%n", student.grade());
        System.out.printf("%.2f%n", student.average());
        System.out.printf("%.2f", student.total());
    }
}

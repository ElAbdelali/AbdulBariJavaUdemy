import java.util.Date;

class Students{
    private static int counter = 1;
    private String rollNo;
    private String assignRollNo(){
        Date d = new Date();
        String rollNo = "Univ-" + (d.getYear()+1900) + "-" + counter;
        counter++;
        return rollNo;

    }
    Students(){
        rollNo = assignRollNo();
    }
    public String getRollNo(){
        return rollNo;
    }

}
public class StudentRollNumber {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}

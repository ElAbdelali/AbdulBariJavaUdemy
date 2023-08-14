import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Which number would you like to convert into day of the week? ");
        int day = scan.nextInt();

       switch(day)
       {
           case 1: System.out.println("Monday");
           break;
           case 2: System.out.println("Tuesday");
           break;
           case 3: System.out.println("Wednesday");
           break;
           case 4: System.out.println("Thursday");
           break;
           case 5: System.out.println("Friday");
           break;
           case 6: System.out.println("Saturday");
           break;
           case 7: System.out.println("Sunday");
           break;
           default: System.out.println("Does not exist");
               break;
       }

        System.out.println("Which number would you like to convert into Month of the Year? ");
        int month = scan.nextInt();

        switch(month)
        {
            case 1: System.out.println("Jan");
                break;
            case 2: System.out.println("Feb");
                break;
            case 3: System.out.println("Mar");
                break;
            case 4: System.out.println("Apr");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("Jun");
                break;
            case 7: System.out.println("Jul");
                break;
            case 8: System.out.println("Aug");
                break;
            case 9: System.out.println("Sep");
                break;
            case 10: System.out.println("Oct");
                break;
            case 11: System.out.println("Nov");
                break;
            case 12: System.out.println("Dec");
                break;
            default: System.out.println("Does not exist");
                break;
        }

        System.out.println("What da website do?");
        String website = scan.nextLine();

        String type = website.substring(website.lastIndexOf(".")+1);

        switch(type){
            case "com": System.out.println("Commercial");
            break;
            case "org": System.out.println("Organization");
            break;
            case "net": System.out.println("Network");
            break;
            default:
                System.out.println("DOESN'T EXIST");
                break;
        }



    }
}

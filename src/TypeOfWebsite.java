import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //we need a way to find the type of website and the protocol

        System.out.println("Enter the website name: ");
        String website = scan.nextLine();

        String protocol = website.substring(0, website.indexOf(":"));
        String type = website.substring(website.lastIndexOf(".")+1);
        if (protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("https"))
            System.out.println("Hypertext Transfer Protocol Secure");
        else if (protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");

        if (type.equals("com"))
            System.out.println("Commercial");
        else if (type.equals("org"))
            System.out.println("Organization");
        else if (type.equals("net"))
            System.out.println("Network");
//        if (website.contains("https")){
//            System.out.println("protocol = https");
//            if(website.contains("com")){
//                System.out.println("type of website = commercial");
//            }
//            else if(website.contains("org")){
//                System.out.println("type of website = organization");
//            }
//            else if(website.contains("net")){
//                System.out.println("type of website = network");
//            }
//        }
//        else if(website.contains("ftp")){
//            System.out.println("protocol = ftp");
//            if(website.contains("com")){
//                System.out.println("type of website = commercial");
//            }
//            else if(website.contains("org")){
//                System.out.println("type of website = organization");
//            }
//            else if(website.contains("net")){
//                System.out.println("type of website = network");
//            }
//        }
//        else if(website.contains("http")){
//            System.out.println("protocol = http");
//            if(website.contains("com")){
//                System.out.println("type of website = commercial");
//            }
//            else if(website.contains("org")){
//                System.out.println("type of website = organization");
//            }
//            else if(website.contains("net")){
//                System.out.println("type of website = network");
//            }
//        }

    }
}

public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Java Program";
        String str2 = new String("JAVA");
        System.out.println(str1);
        System.out.println(str2);
        char c[] = {'H', 'e', 'l', 'l', 'o'};

        String str3 = new String(c);
        System.out.println(str3);
        String str4 = str1.replace('a', 'A');
        System.out.println(str4);

        // Regex practice

        String str5 = "programmer@gmail.com";

        System.out.println(str5.indexOf("@"));
        System.out.println(str5.indexOf("."));

        String substringStr1 = str5.substring(0,10);
        String substringStr2 = str5.substring(11,16);
        String substringStr3 = str5.substring(17,20);

        System.out.println(substringStr1);
        System.out.println(substringStr2);
        System.out.println(substringStr3);


        System.out.println(str5.matches(".*gmail.*"));

        // Find if a Number is Binary or Not,
        // Find if a number is hexa-decimal or not,
        // Find if the data is in date format

        String binaryNum = "010101011";
        String hexadecimalNum = "A234B";
        String date = "01/02/2023";
        System.out.println(binaryNum.matches("[01]+"));
        System.out.println(hexadecimalNum.matches("[A-F0-9]+"));
        System.out.println(date.matches("[01][0-9]/[0-3][0-9]/[0-9]{4}"));


        // Remove Special characters from a String
        // Remove extra spaces from a String
        // Find number of words in a String

        String specialString = "A!b@c#1$2";
        String stringWithSpaces = "  Hello  There  World  ";
        System.out.println(specialString.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(stringWithSpaces.replaceAll("\\s+", " ").trim());
        String strings = stringWithSpaces.replaceAll("\\s+", " ").trim();
        String numOfWords[] = strings.split("\\s");
        System.out.println(numOfWords.length);


        System.out.println();


    }
}

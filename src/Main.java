import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> integerStringHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
//        int numvalue = 123;
        int remainder = num % 10;
        System.out.println( "Ones place = " + remainder);
        switch (remainder){
            case 1:
                integerStringHashMap.put(1,"one only");
                System.out.println(integerStringHashMap);

                break;
            case 2:
                integerStringHashMap.put(2,"two only");
                System.out.println(integerStringHashMap);

                break;
            case 3:
                integerStringHashMap.put(3,"three only");
                System.out.println(integerStringHashMap);

                break;
            case 4:
                integerStringHashMap.put(4,"four only");
                System.out.println(integerStringHashMap);

                break;
            case 5:
                integerStringHashMap.put(5,"five only");
                break;
            case 6:
                integerStringHashMap.put(6,"six only");
                System.out.println(integerStringHashMap);

                break;
            case 7:
                integerStringHashMap.put(7,"seven only");
                System.out.println(integerStringHashMap);

                break;
            case 8:
                integerStringHashMap.put(8,"eight only");
                System.out.println(integerStringHashMap);

                break;
            case 9:
                integerStringHashMap.put(9,"nine only");
                System.out.println(integerStringHashMap);

                break;
        }
        int quotient = num / 10;
//            System.out.println(quotient);

        remainder = quotient % 10;
        System.out.println("Tens place = " + remainder);
        quotient = quotient / 10;
        System.out.println("Hundreds place = " +quotient);

        if (num>=1 && num<=9999){

            switch (num){
                case 1:
                    integerStringHashMap.put(1,"One only");
                    System.out.println(integerStringHashMap);
                    break;
                case 10:
                    integerStringHashMap.put(10,"Ten only");
                    System.out.println(integerStringHashMap);
                    break;
                case 12:
                    integerStringHashMap.put(2,"Two only");
                    integerStringHashMap.put(10,"Ten only");
                    System.out.println(integerStringHashMap);
                    break;
                case 20:
                    integerStringHashMap.put(20,"Twenty only");
                    System.out.println(integerStringHashMap);
                    break;
                    case 100:
                        integerStringHashMap.put(100,"one hundred only");
                        System.out.println(integerStringHashMap);

                    break;
                case 1000:
                    integerStringHashMap.put(1000,"One thousand only");
                    System.out.println(integerStringHashMap);

                    break;

            }




        }
        else {
            System.out.println("Invalid input");
        }
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }
    }
}

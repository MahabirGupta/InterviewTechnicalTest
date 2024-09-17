public class NumberToWords {

    // Array for numbers 1 to 19
    private static final String[] belowTwenty = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    // Array for tens (20, 30, 40, etc.)
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    private static final String[] hundreds = {
            "", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"
    };

    private static final String[] thousands = {
            "", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"
    };
    // Method to convert number to words
    public static String numberToWords(int num) {
        System.out.println("Number = " + num);
        if (num <= 0 || num > 10000) {
            return "Number out of range";
        }

//        if (num >= 1000) {
//            num = num /1000;
//            return thousands[num];// Handle numbers like 2000, 3000, 4000, etc.
//        }

        if (num < 20) {
            return belowTwenty[num]; // Handle numbers 1 to 19
        }
        int thousandPart = num/1000;
        System.out.println("thousandPart = " + thousandPart);
        int remainPart = num % 1000;
        int hundredPart = remainPart/100;
        System.out.println("hundredPart = " + hundredPart);
        int remainder = remainPart%100;
        int tenPart = remainder / 10;
        System.out.println("tenPart = " + tenPart);
        int unitPart = remainder % 10;
        System.out.println("unitPart = " + unitPart);

        if (hundredPart == 0 && unitPart == 0 && tenPart ==0) {
//            return tens[tenPart]; // Handle numbers like 20, 30, 40, etc.
            return thousands[thousandPart];// Handle numbers like 2000, 3000, 4000, etc.

        }
        else if (thousandPart == 0 && hundredPart ==0 && unitPart == 0  ) {
//            return hundreds[hundredPart];
            return tens[tenPart]; // Handle numbers like 20, 30, 40, etc.

        }
        else if (thousandPart == 0 && unitPart == 0 && tenPart ==0) {
//            return thousands[thousandPart];// Handle numbers like 2000, 3000, 4000, etc.
            return hundreds[hundredPart];

        } else if (thousandPart == 0 && hundredPart ==0) {
            return tens[tenPart] + "-" + belowTwenty[unitPart]; // Handle numbers like 21, 22, 37, etc.
        }else if (thousandPart == 0 && unitPart == 0) {
            return hundreds[hundredPart] + " and " + tens[tenPart];

        }
        else if (thousandPart == 0) {
            return hundreds[hundredPart] + " and " + tens[tenPart] + "-" + belowTwenty[unitPart];

        } else {
//            return tens[tenPart] + "-" + belowTwenty[unitPart]; // Handle numbers like 21, 22, 37, etc.
            return thousands[thousandPart] + " " + hundreds[hundredPart] + " and " + tens[tenPart] + "-" + belowTwenty[unitPart];
        }
    }

    public static void main(String[] args) {
        // Test examples
        System.out.println(numberToWords(22));  // Output: twenty-two
        System.out.println(numberToWords(37));  // Output: thirty-seven
        System.out.println(numberToWords(19));  // Output: nineteen
        System.out.println();
        System.out.println(numberToWords(20));  // Output: twenty
        System.out.println(numberToWords(40));  // Output: forty
        System.out.println();
        System.out.println(numberToWords(100)); // Output: one hundred
        System.out.println(numberToWords(45));  // Output: forty-five
        System.out.println(numberToWords(500)); // Output: five hundred
        System.out.println(numberToWords(800)); // Output: one hundred
        System.out.println();
        System.out.println(numberToWords(123)); // Output: one hundred and twenty-three
        System.out.println(numberToWords(567)); // Output: five hundred and sixty-seven
        System.out.println(numberToWords(120)); // Output: one hundred and twenty
//
        System.out.println();
        System.out.println(numberToWords(1000)); // Output: one thousand
        System.out.println(numberToWords(6000)); // Output: six thousand
        System.out.println(numberToWords(3000)); // Output: three thousand
        System.out.println(numberToWords(7000)); // Output: seven thousand
        System.out.println();
        System.out.println(numberToWords(1234)); // Output: seven thousand
        System.out.println(numberToWords(9999)); // Output: seven thousand
        System.out.println(numberToWords(9876)); // Output: seven thousand



    }
}

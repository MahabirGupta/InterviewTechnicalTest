import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElements {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        int arraySize = scanner.nextInt();
        System.out.println("Array size = " + arraySize);
        int[] array = new int[arraySize];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        sumArrays(arraySize,array);


    }

    private static void sumArrays(int arraySize, int[] array) {
        System.out.println("Array size = " + arraySize);
        System.out.println(Arrays.toString(array));
        for (int i = 4; i <=arraySize-1 ; i++) {
            array[i] = array[i-1] + array[i-2] + array[i-3] + array[i-4];
        }
        System.out.println(Arrays.toString(array));

    }
}

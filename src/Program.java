import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.println("Array size: ");
        int num  = scan.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        System.out.println("Enter values of the first array: ");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter values of the second array: ");
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = scan.nextInt();
        }

        int[] arr3 = new int[num];
        System.out.println("Array 1 + Array 2: ");
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = arr1[i] + arr2[i];
        }

        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }


        scan.close();

    }
}

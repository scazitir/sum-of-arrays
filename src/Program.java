import java.util.Locale;
import java.util.Scanner;

public class Program {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Locale.setDefault(Locale.CANADA);

        System.out.println("Array size: ");
        int num  = scan.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        System.out.println("Enter values of the first array: ");
        populateArray(arr1);

        System.out.println("Enter values of the second array: ");
        populateArray(arr2);

        int[] arr3 = new int[num];
        System.out.println("Array 1 + Array 2: ");
        sum(arr1, arr2, arr3);
        showValues(arr3);
    }

    public static void populateArray(int[] a){
        for (int i = 0; i < a.length; i++){
            a[i] = Program.scan.nextInt();
        }
    }

    public static void showValues(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void sum(int[] a, int[] b, int[] c){
        for (int i = 0; i < c.length; i++){
            c[i] = a[i] + b[i];
        }
    }

}

import java.util.Scanner;
import java.util.Arrays;

public class MyMain {

    public static int[] someMethod() {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) 
            arr[i] = (int) (Math.random() * 11) + 10;
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = someMethod();
        System.out.println("The three random numbers are " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The largest number is " + arr[2]);
    }

}



import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int count = 0; 
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter a number : ");
            arr[i] = in.nextInt();
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
             if(i == arr.length - 1)
        System.out.print(arr[i]);
         else
        System.out.print(arr[i] + ", ");
            count ++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Total element in array is : " + count);
    }
}

//Code to take input from user and print it also print how many elements are there

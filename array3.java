import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        int count = 0; 
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
        System.out.print("Enter numbers : ");
            arr[i] = in.nextInt();
        }
        System.out.println();
        for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
        System.out.println();
         if(arr[i]<0){
            System.out.println("Negative nums in array is : " + arr[i] + " ");
            break;
         }
        }
        System.out.println();
    }
}

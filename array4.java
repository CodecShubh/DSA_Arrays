import java.util.*;
public class array4 {
    public static void main(String[] args) {
        int arr[] = {4,12,8,9,2,11};
        int max =  Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

//Code to find largest in an array
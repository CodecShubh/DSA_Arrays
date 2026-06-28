import java.util.Arrays;

public class array22 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//wave array
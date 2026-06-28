public class array20 {

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 1};

        int count = 0;

        // Count number of zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        // Fill zeros
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        // Fill ones
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
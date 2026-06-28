public class array17 {
    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 6, 7, 8};

        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

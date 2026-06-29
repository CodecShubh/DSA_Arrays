public class array24 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;
          int  count= 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for(int j = index;j<arr.length; j++){
            arr[j] = 0;
        }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

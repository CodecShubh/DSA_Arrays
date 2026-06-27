public class array17 {
    public static void main(String[] args) {
        int arr [] = {2,4,5,6,7,8};
        int temp = arr[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i + 1;
        }
        temp = arr[0];
        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j] + " ");
        }
        
    }
}

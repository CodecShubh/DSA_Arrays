public class arrays11 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,10};
        for(int i = 0;i<arr.length;i++){
            if(i%2 == 0){
               arr[i] = arr[i]*2;
            }
            else if(i%2 == 1){
                arr[i] = arr[i] + 10;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

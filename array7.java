public class array7 {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,7,8};
        int key = arr[4];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                arr[i] = 3;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}

public class array21 {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] %2 == 0){
                arr[i] = arr[i];
                
            }else{
                arr[i] = arr[i + 1];
            }
        }
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}

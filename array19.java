public class array19 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,1};
        int left = arr[0];
        int right = arr.length;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                left--;
            }
            else{
                right++;
            }
        }
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]+ " ");
        }
    }
}

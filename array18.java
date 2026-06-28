public class array18 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        int n = arr.length + 1;
        int sum = (n*(n+1))/2 ;
        int SUM = 0;
        
        for(int i = 0;i<arr.length;i++){
            SUM += arr[i];
        }
        int miss = sum - SUM;
        System.out.println("MISSING NUMBER IS : " + miss);
    }
}

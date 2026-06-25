public class array14 {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int smax = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != max &&  arr[i] > smax){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}

//second largest in an array

public class array5 {
    public static void main(String[] args) {
       int arr[] = {10,2,4,5,15,6,7,8,9};
       int max = arr[0];
       for(int i = 0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
          }
       }
       System.out.print("Max number in array is : " + max);
    }
}

//Finding max element of an array

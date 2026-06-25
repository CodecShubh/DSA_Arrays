public class array6 {
   public static void main(String[] args) {
    int arr[] = {2,4,5,6,7,1,9,10};
    int min = arr[0];
    for(int i =0;i<arr.length;i++){
        if(arr[i]< min){
            min = arr[i];
        }
    }
    System.out.println("Min in array is : " + min);
   } 
}

//Finding minimum element of an array

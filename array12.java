public class array12 {
    public static void main(String[] args) {
        int arr[] = {2,5,4,6,7,8};
        int key = 4;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                System.out.print("Key found at index : " + i);
            }
        }
    }
}

//linear search
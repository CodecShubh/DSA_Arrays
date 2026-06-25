public class array13 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,9};
        int key = 9;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == key){
                    System.out.println("2 sum index is : " + i + " , "+ j);
                    return;
                } else {System.out.println("No pair found");} 
            }
        }
    }
}

//2 sum code
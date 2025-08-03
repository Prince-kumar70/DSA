import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,2,3,-1};
        MoveZero(arr); 
        System.out.println(Arrays.toString(arr));
    }   
    public static void MoveZero(int[] arr){
        int j = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i=j+1 ; i<arr.length ; i++){
            if(arr[i] != 0){
                swap(arr,i,j);
                j++;
            }
        }
    }
    public static void swap(int[] arr ,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

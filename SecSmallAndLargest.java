public class SecSmallAndLargest {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,9,8};
        System.out.println(Slargest(arr));
        System.out.println(Ssmallest(arr));
    }
    public static int  Slargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int Slargest = -1;

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i] < largest && arr[i] > Slargest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }
    public static int  Ssmallest(int[] arr){
        int smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i]<smallest){
                Ssmallest = smallest;
                smallest=arr[i];
            }
            else if(arr[i] != smallest && arr[i] < Ssmallest){
                Ssmallest = arr[i];
            }
        }
        return  Ssmallest;
    }
}

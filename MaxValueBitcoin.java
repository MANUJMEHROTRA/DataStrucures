public class MaxValueBitcoin{
	public static void main(String[] args){

		int[] arr = {1,15,25,45};
		int n =arr.length;
		int max = arr[n-1];
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                max = arr[i-1];
                break;
            }
        }
        System.out.println(max);
 

	}

}













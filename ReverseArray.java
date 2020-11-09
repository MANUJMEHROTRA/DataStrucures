public class ReverseArray{
	public static void main(String[] args){
		int[] arr = {4, 5, 1, 2};
		int[] arrRev = new int[arr.length];
		for(int i=arr.length; i>0;i--){
			arrRev[arr.length-i] = arr[i-1];
		}
		for(int i=0; i<arrRev.length;i++){
			System.out.println(arrRev[i]);
		}
	}
}
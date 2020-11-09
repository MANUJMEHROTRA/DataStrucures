public class LittlePonnyMobilePhones{
	public static void main(String[] args){
		
		int[] A= {3, 4, 4, 6};
		int[] B={20, 4, 10, 2};
		int[] arr= {-1,-1,-1,-1};
		int sum=0;
		int cnt=0;
		for(int j=0;j<A.length;j++){

			for(int i=0; i<A.length;i++){
					if(sum<B[j]){
						sum=sum+A[i];
						cnt=cnt+1;

				}
				else{
						break;
					}
				
					

		}
		arr[j] = cnt;
				cnt=0;
				sum=0;

		}
		
		for(int i=0; i<A.length;i++){
			System.out.println(arr[i]);
		}

	}
}
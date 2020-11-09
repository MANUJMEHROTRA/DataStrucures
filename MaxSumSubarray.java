public class MaxSumSubarray{
	public static void main(String[] args){
		int[] A = {-100};//{-2, 1, -3, 4, -1, 2, 1, -5, 4} ;
		int maxSum = Integer.MIN_VALUE;
		int temp = 0;
		int setValue = 0;
		for(int i=0;i<A.length;i++){
			if (A[i]>0){
				setValue=1;
				break;
			}
		}
		if(setValue==1){
			for(int i=0;i<A.length;i++){
			
			if(0<temp+A[i]){
				temp = temp+A[i];
			}
			else{
				temp=0;
			}
			if(temp>maxSum){
				maxSum=temp;
			}

		} 
	}
		else{
			maxSum = A[0];
			for(int i=0;i<A.length;i++){
				if(A[i]<maxSum){
					maxSum=A[i];
				}
			}

		}

		
		System.out.println("The maxOut is "+ maxSum);
	}
}
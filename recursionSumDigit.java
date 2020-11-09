public class recursionSumDigit{

	static int sum =0;
	public static void main(String[] args){

		int A =10;
		System.out.println(recursionSumDigitFunc(A));

	}

	static int recursionSumDigitFunc(int A){
		if (A!=0){
			sum = sum+ A%10;
			A=A/10;
			recursionSumDigitFunc(A);
		}
		return sum;
	}
	
}
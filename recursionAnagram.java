public class recursionAnagram{
	
	public static void main(String[] args){
		String A = "memem";
		int len = A.length();


		System.out.println(A.charAt(A.length()-1));
		System.out.println(isAnagram(A, 0, (A.length()-1)));

	}

	public static int isAnagram(String A,int start, int end){

			if (start<=end){

				if(A.charAt(start) == A.charAt(end)){
				start = start+1;
				end = end-1;
				return isAnagram(A,start,end);
				}

				else{
					return 0;
				} 
			}
		return 1;
	}

}



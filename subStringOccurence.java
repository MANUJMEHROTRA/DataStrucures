public class subStringOccurence{

	public static void main(String[] args){
		String A = "mazbooobbobobob";
		String sub ="bob";
		int cnt = 0;
		for(int i=0;i-1<(A.length()-sub.length());i++){

			if (sub.equals(A.substring(i,i+sub.length()))){
				cnt=cnt+1;
			}
		}
		System.out.println(cnt);
	}

}
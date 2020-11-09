public class RevStringWordbyWord{

	public static void main(String[] args){

		String s = "The Sky is blue Manuj Mehrotra";
		System.out.println(s);
		s = rev(s);
		System.out.println(s);
		//System.out.println(rev("scaler"));
		int start =0;
		int end =0;
		StringBuilder sb = new StringBuilder("");
		String sbRes = new String();

		for(int i=0; i<s.length();i++){

			if((s.charAt(i)==' ')||(end==s.length()-1)){

				if(end==s.length()-1){
					end = end+1;
				}
				String substring = s.substring(start,end);
				System.out.println(rev(substring));

				sb = sb.append(rev(substring));
				sb = sb.append(" ");
				start =end+1;
			}

			end = end+1;

		}

		sbRes = sb.toString();

		System.out.println(sbRes);



	}


	static String rev(String s){

		StringBuilder sb = new StringBuilder(s);
		StringBuilder sbRev = sb.reverse();
		String sb1 = new String(sbRev);
		return sb1;
	}
}
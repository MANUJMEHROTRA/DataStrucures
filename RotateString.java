public class RotateString{

	public static void main(String[] args){

		String s = "The Sky is blue";
		//System.out.println(rev("scaler"));
		int start =0;
		int end =0;
		StringBuilder sb = new StringBuilder("");
		String sbRes = new String();

		for(int i=0; i<sb.length;i++){

			if(sb.charAt(i)==' '){

				String substring = s.substring(start,end);
				sb.append(rev(substring));
				start =end+1;
			}

			++end;

		}

		sbRes = sb.ToString();

		System.out.println(sbRes);



	}


	static String rev(String s){

		StringBuilder sb = new StringBuilder(s);
		StringBuilder sbRev = sb.reverse();
		String sb1 = new String(sbRev);
		return sb1;
	}
}
public class ReverseString{

	public static void main(String[] args){

		String s = "scaler";
		int rotate = 3;
		StringBuilder sb = new StringBuilder(s);
		int len = sb.length();
		//StringBuilder sbResult = sb.substring(len-rotate,len-1)+sb.substring(0,len-rotate-1);
		 String sb1 = new String(sb.substring(len-rotate,len)); 
		 String sb2 =  new String(sb.substring(0,len-rotate));
		System.out.println(sb.substring(len-rotate,len));
		System.out.println(sb.substring(0,len-rotate));
		System.out.println(sb1.concat(sb2));
	}
}
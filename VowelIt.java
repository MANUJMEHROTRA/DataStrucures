public class VowelIt{
	public static void main(String[] args){
		String a = "interviewbit"; 
		String returnString="";
		for(char b: a.toCharArray()){
			switch(b){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': 
					returnString = returnString+b;
					break;
				default:
					continue;
			}


		}
		System.out.println("The output String is: "+returnString);
	}
}
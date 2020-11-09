public class Teams{
	public static void main(String[] args){
		String A = "00011011";
		int cntZ = 0;
		int cntO = 0;
		int retunVal = 0;
		for (char i: A.toCharArray()){
			if(i=='0')
				cntZ++;
			if(i=='1')
				cntO++;
			if(cntO==cntZ){
				cntZ = 0;
				cntO = 0;
				retunVal ++;
			}

		}
		if (cntO==cntZ){
			System.out.println(retunVal);
		} 
		else{
			System.out.println("0");
		}
	}
}
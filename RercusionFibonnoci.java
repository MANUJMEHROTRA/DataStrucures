public class RercusionFibonnoci{

static int fib =0;

	public static void main(String[] args){

    System.out.println(fiboFunc(7));

}


static int fiboFunc(int A){
    if(A==1||A==2){
        return 1;
    }
     fib= fiboFunc(A-1)+fiboFunc(A-2);
     return fib;
}



}




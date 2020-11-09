import java.util.ArrayList;


public class SpiralOrderPrinting{
	public static void main(String[] args){
		int A = 5;
		int fc =0;
        int fr = 0;
        int lr = A-1;
        int lc = A-1;
        int[][] arr = new int[A][A];
        // int[] arrReuslt = new int[A*A];
        // int[][] arrReuslt2D = new int[A][A];
        int cnt =1 ;

        for(int i=0; i<A; i++){
        	for(int j=0;j<A;j++){
        		arr[i][j] = cnt++;
        	}
        }

        for(int i=0; i<A; i++){
        	for(int j=0;j<A;j++){
        		System.out.println(arr[i][j]);
        	}
        }

        //Sy

        cnt =0;

        while(fc<=lc&&fr<=lr&&cnt<(A*A)){
        	//Printing the top row from left to right
            for(int i=fc;i<=lc;i++){
            	arr[fr][i] = cnt++ ;
            }
            fr++;
            //Printing the last Column from top to bottom
            for(int i=fr;i<=lr;i++){
            	arr[i][lc] = cnt++; 
            	
            }
            lc--;
            //Printing the last row from right to left
            for(int i=lc;i>=fc;i--){
            	arr[lr][i] =cnt++; 
            	
            }
            lr--;
            //Printing the firt column from bottom to top
            for(int i=lr;i>=fr;i--){
            	arr[i][fc] =cnt++; 
            	
            }
            fc++;

           // break;
            
        }

        return arr;
// System.out.println("Start Printing the Result");
//         for(int i=0;i<(A*A);i++){
//         	System.out.println(arrReuslt[i]);
//         }

        cnt=0;

         for(int i=0; i<A; i++){
        	for(int j=0;j<A;j++){
        		arrReuslt2D[i][j] = arrReuslt[cnt];
        		cnt++;
        	}
        }
        return arrReuslt2D;



	}
}
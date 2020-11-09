public class ScalerMaxMod{
	public static void main(String[] args){
		System.out.println("The Program is going to run: ");
		int[] a = {2, 6, 4};//{1, 2, 44, 3};//{1,2,3,5,6};
		int max=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i]==0){
					continue;
				}
				if(a[j]%a[i]>max){
					max = a[j]%a[i];
				}
			}
		}
		System.out.println("The programs maximum Mod is:" +max);
	}
}
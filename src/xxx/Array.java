package xxx;

public class Array {
	
	public static void main(String[] args) {
		
		int num[]=new int[5];
//		System.out.println(num[2]);
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=4;
//		num[4]=6;
		
//		for(int i=0;i<num.length;i++) {
//			
//			System.out.println(num[i]);
//		}
		
		System.out.println(num[2]);
		
		for(Integer k:num) {
			
			System.out.println(k);
		}
	}

}

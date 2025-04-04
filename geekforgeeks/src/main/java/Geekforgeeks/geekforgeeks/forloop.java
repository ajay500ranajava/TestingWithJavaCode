package Geekforgeeks.geekforgeeks;

public class forloop {

	public static void main(String[] args) {
		int arr []= {10,20,30,40,50};
		for(int i:arr) {
			
			System.out.println(i );
		}
		// TODO Auto-generated method stub
for (int i=1; i<=5; i++) {
	
	for(int j=5;j>=i;j--) {
		System.out.print("*");
		//System.out.println();
	}
	System.out.println();
	
}

	}

}

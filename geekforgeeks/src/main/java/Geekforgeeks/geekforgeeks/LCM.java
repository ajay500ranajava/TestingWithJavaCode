package Geekforgeeks.geekforgeeks;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int lcm=Math.max(n, m);
		int i=0;
		while(i<lcm) {
			if(lcm%n==0 && lcm%m==0) {
				lcm=i;
			}
			i++;
			System.out.println(lcm);
		}
		
		
		

	}

}

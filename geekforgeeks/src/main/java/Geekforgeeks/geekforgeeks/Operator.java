package Geekforgeeks.geekforgeeks;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=n*(n+1)/2;
System.out.println(sum);

int a=10;int b= 20;
int add=(a+b);
System.out.println("addition of numbers: " +add);


int y=Math.abs(n);
int ans=y%10;
System.out.println("last digit of a number " + ans);

if (n/2==0) {
System.out.println("number is  even");
}
else {
	System.out.println("odd");
}
	}

}

package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Students>set=new HashSet<>();
		
		System.out.print("How many students for course A?");
		int numA=sc.nextInt();
		for(int i=0;i<numA;i++) {
			int codstudents=sc.nextInt();
			set.add(new Students(codstudents));
			
		}
		
		System.out.print("How many students for course B?");
		int numB=sc.nextInt();
		for(int i=0;i<numB;i++) {
			int codstudents=sc.nextInt();
			set.add(new Students(codstudents));
			
		}
		
		System.out.print("How many students for course C?");
		int numC=sc.nextInt();
		for(int i=0;i<numC;i++) {
			int codstudents=sc.nextInt();
			set.add(new Students(codstudents));
			
		}
		
		System.out.print("Total students: "+set.size());
		
		
		
		sc.close();

	}

}

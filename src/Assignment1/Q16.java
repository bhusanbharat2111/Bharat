package Assignment1;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter values of array: ");
		
		for(int i=0; i<size; i++) {
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<size-1;i++) {
			int index=i;
			for(int j=i+1;j<size;j++) {
				if( array[index]>array[j]) index=j;
			}
			if(index!=i) {
				int temp=array[index];
				array[index]=array[i];
				array[i]=temp;
			}
		}
		
		for(int x:array) {
			System.out.print(x+" ");
		}

	}

}

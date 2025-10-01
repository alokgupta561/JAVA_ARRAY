package array;

import java.util.Arrays;

public class ClassA {

	void meth1()
	{
	System.out.println("Implementing java array\n");
	int arr1[];
	arr1 = new int [5];
	int arr2[]= new int [3];
	int arr3[]= {11,22,33,44};
	int arr4[]= new int [] {100,200,300,400,500,600};
	String s= "java";
	System.out.println("arr1 length :"+ arr1.length);
	System.out.println("arr2 length :"+ arr2.length);
	System.out.println("arr3 length :"+ arr3.length);
	System.out.println("arr4 length :"+ arr4.length);
	System.out.println("s.length :" + s.length());
	System.out.println("\n arr1 :"+arr1);
	System.out.println(" arr2 :"+arr2);
	System.out.println("arr3 :"+arr3);
	System.out.println("arr4 :"+arr4);
	System.out.println("\n arr1 :"+ Arrays.toString(arr1));
	System.out.println(" arr2 :"+ Arrays.toString(arr2));
	System.out.println(" arr3 :"+ Arrays.toString(arr3));
	System.out.println(" arr4 :"+ Arrays.toString(arr4));
	arr1[1]=25;
	arr1[3]=45;
	System.out.println("\n arr1 :"+ Arrays.toString(arr1));
	System.out.println("\n"+ arr1[0]);
	System.out.println(arr3[arr3.length-1]);
	System.out.println(arr1[arr1.length-2]);
	System.out.println(arr4[arr3.length/2]);
	System.out.println("\n reteriving the data from arr4 by using forloop");
	for(int i=0;i<=arr4.length-1;i++)
	
		System.out.print(arr4[i]+" ");
		System.out.println();
	for (int i= arr4.length-1; i>=0; i--) 
		System.out.print(arr4[i]+" ");
	System.out.println("\n\n Reteriving the data from arr4 by using forloop");
	
	for(int data: arr4)
		System.out.print(data+" ");
	}
	public static void main(String[] args)
	{
	ClassA aobj = new ClassA();
	aobj.meth1();
	}	
	
		
	
	
}

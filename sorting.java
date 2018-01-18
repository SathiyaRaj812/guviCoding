package sortingEX1;
import java.util.Scanner;
public class sorting {

	public static void main(String[] args) {
		
		
		
		
	
		
			Scanner sc=new
				java.util.Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("enter array element:");
		for(int i=0;i<size;i++)
		{
			System.out.print("element no"+(i+1)+":");
			arr [i]=sc.nextInt();
		}
		System.out.print("before sorting:");
		for(int i=0;i<size;i++)
			System.out.print(" "+arr[i]);
		for(int i=0;i<size;i++)
		{
			int temp;
			for (int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}

		}
		System.out.println();
		System.out.println("after sorting in ascending order");
		for(int i=0;i<size;i++)
		{
			System.out.println(" "+arr[i]);
			
		}
		System.out.println();
		System.out.println("after  sorting in decsending order");
			for(int i=size-1;i>=0;i--)
			{
				System.out.println(" "+arr[i]);
			}
		}
		

		// TODO Auto-generated method stub

	}


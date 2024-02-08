package linkedlist;
import javax.xml.transform.stream.StreamSource;
import java.util.Random;
import java.util.Scanner;
public class StackMain {

	public static void main(String[] args) 
	{
		System.out.println( "Enter the length of the input value :");
		Scanner sc = new Scanner(System.in);
		int  length=sc.nextInt();
		//System.out.println("Enter the value :");
		//int v=sc.nextInt();
		
		int[] inputValue = new int[length];
		Stack<Integer> stack =new Stack<Integer>(length);
		
		for(int i=0; i<length; i++)
		{
			int value=sc.nextInt();
			inputValue[i]=value;
			stack.push(value);
		}
		int flag=0;
		for(int i=0;i<length;i++)
		{
			if(inputValue[i]!=stack.pop())
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}

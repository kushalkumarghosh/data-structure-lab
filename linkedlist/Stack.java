package linkedlist;

public class Stack<E> 
{
   private E[] data;
   private int top=-1;
   private int capacity;
   
   public Stack( int capacity)
   {
	   this.capacity=capacity;
	   data= (E[])new Object[capacity];
   }
   public boolean isEmpty()
   {
	   if(top==-1)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   public boolean isFull()
   {
	   if((top+1)==capacity)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   public void push(E item)
   {
	   if( !isFull())
	   {
		   top++;
		   data[top]=item;
	   }
	   else
	   {
		   System.out.println("Stack is Full");
	   }
   }
   public E pop()
   {
	   if( !isEmpty())
	   {
		   E value =data[top];
		   data[top]=null;
		   top--;
		   return value;
	   }
	   else
	   {
		   System.out.println("Stack is Empty");
		   return null;
	   }
   }
   public E peek()
   {
	   if(!isEmpty())
	   {
		   E value =data[top];
		   
		   return value;
	   }
	   else
	   {
		   System.out.println("Stack is Empty");
		   return null;
	   }
   }
}





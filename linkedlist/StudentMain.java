package linkedlist;

import java.util.LinkedList;

public class StudentMain {

	public static void main(String[] args) {
		//Student linkedlist
		LinkedList<Student> list = new LinkedList<Student>();
		
		//student create
		Student S1 = new Student(398,"Kushal","7th semester");
		Student S2 = new Student(404,"Akash","7th semester");
		Student S3 = new Student(242,"Safraz","7th semester");
		
		//Adding student to the studentlist
		list.add(S1);
		list.add(S2);
		list.add(S3);
		
		//Information display
		for(Student S : list) {
			System.out.println(S.id+"  "+S.name+"  "+S.className);
		}
	}

}

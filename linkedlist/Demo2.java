package linkedlist;

import java.util.LinkedList;

public class Demo2 {

	public static void main(String[] args) {
		LinkedList<String> DistrictNames = new LinkedList<String>();
		
		DistrictNames.add("Dhaka");
		DistrictNames.add("khulna");
		DistrictNames.add("satkhira");
		DistrictNames.add("Gopalganj");
		DistrictNames.add(4,"Argentina");
		//DistrictNames.addFirst("Koyra");
		//DistrictNames.addLast("Satkhira");
		//DistrictNames.remove("Koyra");
		//DistrictNames.removeFirst();
		//DistrictNames.removeLast();
		
		
		
		for(String District : DistrictNames) {
			System.out.println(District);
		}
		System.out.println("Size of the Linked List: "+DistrictNames.size());
		
		System.out.println("First Element: "+DistrictNames.getFirst());
		System.out.println("Last Element: "+DistrictNames.getLast());
		DistrictNames.clear();
		System.out.println(DistrictNames);
	}

}

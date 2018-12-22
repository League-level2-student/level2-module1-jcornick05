package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> a  = new ArrayList<String>();
		//2. Add five Strings to your list
		a.add("hi");
		a.add("bye");
		a.add("Dylan is not cool");
		a.add("w");
		a.add("l");
		//3. Print all the Strings using a standard for-loop
//	for (int i = 0; i < a.size(); i++) {
//			String s = a.get(i);
//			System.out.println(s);
//		}
		//4. Print all the Strings using a for-each loop
//		for (String i: a) {
//			System.out.println(i);
//		}
		//5. Print only the even numbered elements in the list.
//		for (int i = 0; i < a.size(); i+=2) {
//			String s = a.get(i);
//			System.out.println(s);
//		}
		
		
		//6. Print all the Strings in reverse order.
//		for (int i = a.size()-1; i > -1; i--) {
//			String s = a.get(i);
//			System.out.println(s);
//		}
		
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < a.size(); i++) {
		if (a.get(i).contains("e")) {
			System.out.println(a.get(i));
		}
		
	}
}
}
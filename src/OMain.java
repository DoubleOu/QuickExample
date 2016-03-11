import java.util.LinkedList;

/*
 * Date: 1/29/15
 * 
 * Name: OMain.Java
 * 
 * Description: This is the main class of the QuickExample project.  
 * 				A simple "before and after" to show the results of the merge sort.
 * 
 * Note: So my original goal was to create a nice JSP file to show this example, 
 * 		 but due to my futile attempts to get Spring working this morning, I decided to create a much simpler example.
 * 		 If a JSP or Spring oriented example would be preferred I'll work on it, but I just wanted to get something out there.
 *
 * Author: Okwudili Udeh 
 * 
 */

public class OMain {

	public static void main(String[] args) {
		LinkedList<Integer> TestQ = new LinkedList<Integer>();
		TestQ.add(2);
		TestQ.add(11);
		TestQ.add(0);
		TestQ.add(3);
		TestQ.add(5);
		TestQ.add(1);
	System.out.println(TestQ);
	System.out.println(OMerge.sort(TestQ));
	}

}

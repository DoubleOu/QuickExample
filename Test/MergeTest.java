import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

/*
 * Date: 1/29/15
 * 
 * Name: MergeTest.Java
 * 
 * Description: This is a basic Junit test of OMerge.java's Sort() method.
 * 
 * Note: So because I wasn't able to implement the Spring portion of this example today, I decided to add a quick Junit test
 * 		 I'm still doing research on Spring, and hopefully I'll expand on it as well as my unit testing skills.
 *
 * Author: Okwudili Udeh 
 * 
 */


public class MergeTest {
	

	
	@Test
	public void testSort() {
		LinkedList<Integer> ConList = new LinkedList<Integer>();
			ConList.add(1);
			ConList.add(2);
			ConList.add(3);
			ConList.add(4);
			ConList.add(5);
		LinkedList<Integer> SorList = new LinkedList<Integer>();
			SorList.add(3);
			SorList.add(1);
			SorList.add(2);
			SorList.add(5);
			SorList.add(4);
		assertArrayEquals(OMerge.sort(SorList).toArray(), ConList.toArray());
		
	}


}

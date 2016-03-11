import java.util.LinkedList;
import java.util.Queue;
/*
 * Date: 1/29/15
 * 
 * Name: OMerge.Java
 * 
 * Description: This is a queue based natural merge sort.
 * 
 * Note: I found the algorithm for it online because it would have taken even longer otherwise. 
 * 		 The "Comparable" interface (hence the "Natural" part) led to an issue with it while Junit testing. Mixed up some numbers.
 * 		 But hey, it led to a fun time in debug mode! 
 *
 * Author: Okwudili Udeh 
 * 
 */
public class OMerge
{
  public static <T extends Comparable<T>> Queue<T> sort(Queue<T> node) {
        Queue<T> result = new LinkedList<T>();
        Queue<T> tempArrayA = new LinkedList<T>();
        Queue<T> tempArrayB = new LinkedList<T>();
        while (node.size() > 0) {
            while (node.size() > 0) {
                merge(node, result, tempArrayA);
                merge(node, result, tempArrayB);
            }
            while (tempArrayA.size() > 0 || tempArrayB.size() > 0) {
                merge(tempArrayA, tempArrayB, result);
                merge(tempArrayA, tempArrayB, node);
            }
        }
        return result;
}

public static <T extends Comparable<T>> void merge(Queue<T> left, Queue<T> right, Queue<T> result) {
        T prevLeft = null;
        T prevRight = null;
        while ((left.size() > 0 && (prevLeft == null || prevLeft.compareTo(left.peek()) <= 0)) ||
               (right.size() > 0 && (prevRight == null || prevRight.compareTo(right.peek()) <= 0))) {

            if (right.size() == 0 || (left.size() > 0 && left.peek().compareTo(right.peek()) <= 0)) {
                prevLeft = left.poll();
                result.add(prevLeft);
            } else {
                prevRight = right.poll();
                result.add(prevRight);
            }
        }
    }
}

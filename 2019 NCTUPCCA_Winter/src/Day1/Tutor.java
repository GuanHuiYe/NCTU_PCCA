package Day1;
import java.util.*;
import javafx.util.Pair;
public class Tutor {

	public static void main(String[] args) {
		Pair<Integer, String> pair = new Pair<>(1, "One");
		System.out.println(pair.getKey()+" "+pair.getValue()); // 1 One

		Pair<Integer, String> pair2 = new Pair<>(2, "Two");
		System.out.println(pair2.getKey()+" "+pair2.getValue()); // 2 Two
		System.out.println(pair.equals(pair2));
	    System.out.println(pair2.getValue().compareTo(pair.getValue()));
		
	    System.out.println("---------");
	    
	    Vector v = new Vector<>(); //�i�H�s���@���A�}�C
	    v.add(new Integer(12));//���|�s��}�C�̫�
	    v.add(new Long(34L));
	    v.add(new Float(5.6f));
	    v.add(new Double(7.8));
	    v.add(new String("Hello"));
	    
	    System.out.println("Firsh�G"+v.firstElement());
	    System.out.println("GetIndex1�G"+v.get(1));
		  

	    for (int i = 0 ; i < v.size() ; i++){ //size()�o��Vector�j�p
	         Object obj = v.get(i);
	         System.out.println(obj); 
	    }
	    
	    System.out.println("---------");
	    
	    Deque<Integer> deque = new LinkedList<>();
	    deque.addFirst(0);
	    deque.addLast(1);
	    deque.add(2);
	    deque.addFirst(3);
	    
	    while(!deque.isEmpty()) {
	    	System.out.println(deque.pop());
	    }
	}

}
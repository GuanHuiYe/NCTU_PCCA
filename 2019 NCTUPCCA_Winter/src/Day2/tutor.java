package Day2;

import java.util.*;

class map {
	public int group;
	public Queue<Integer> que;

}

public class tutor {
public static map[] mp;
	public static void main(String[] args) {
		 mp = new map[10];
		for (int n = 0; n < mp.length; n++) {
			mp[n] = new map();
			mp[n].que = new LinkedList<>();
		}

		mp[0].group = 10;
		mp[0].que.add(123);

		System.out.println(mp[0].group + ". " + mp[0].que.poll());

	}

}



package Day12Iterator;

import java.util.ArrayList;
import java.util.List;

public class TestMyIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		MyIterator mi = new MyIterator(list);
		while(mi.myHasNext()) {
			System.out.println(mi.myNext());
		}
	}	
}

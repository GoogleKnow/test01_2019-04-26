import java.util.*;
public class Map1 {
	public static void main(String[] args) {
		Map<String,Integer> m1 = new HashMap<String,Integer>();

		m1.put("one",1);
		m1.put("two",2);
		System.out.println(m1.size());
	}
}
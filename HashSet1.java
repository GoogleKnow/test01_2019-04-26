import java.util.*;
//
public class HashSet1 {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("aaa");
		s.add("bbb");
		s.add("hello");
		s.add("aaa");
		System.out.println(s);
	}
}
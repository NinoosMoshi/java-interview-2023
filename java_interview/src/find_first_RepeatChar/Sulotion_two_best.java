package find_first_RepeatChar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Sulotion_two_best {

	public static void main(String[] args) {
		
		String str = "niwaise";
		
		System.out.println(firstRepeatingCharacter(str));
		

	}

	public static char firstRepeatingCharacter(String str) {
		
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0; i < str.length(); i++) {
			char value = str.charAt(i);
			if(list.contains(value)) {
				return value;
			}else {
				list.add(value);
			}
		}
		
		return '\0';
	}
	

}

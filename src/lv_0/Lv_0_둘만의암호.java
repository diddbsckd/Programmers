package lv_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv_0_둘만의암호 {

	public static void main(String[] args) {
		String s = "z";
		String skip = "abcdefghij";
		int index = 1;
		String answer = new Lv_0_둘만의암호().solution(s, skip, index);
		System.out.println(answer);
	}
	
	public String solution(String s, String skip, int index) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] a = skip.split("");
        String[] b = s.split("");
        
        List<String> list = new ArrayList<>(Arrays.asList(alphabet));
        
        for(int i=0; i<skip.length(); i++) {
        	list.remove(a[i]);
        }
        
        int x = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
        	x = list.indexOf(b[i]) + index;
        	while(x >= list.size()) {
        		x -= list.size();
        	}
        	
        	for(int j=0; j<1; j++) {
        		sb.append(list.get(x));
        	}
        }
        return sb.toString();
    }
}

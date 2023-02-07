package lv_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Lv_0_한번만등장한문자 {

	public static void main(String[] args) {
		String s = "hello";
		String answer = new Lv_0_한번만등장한문자().solution(s);
		System.out.println(answer);
	}
	
	public String solution(String s) {
        String answer = "";
        
        HashSet<String> hashset = new HashSet<>();
        
        String[] array = s.split("");
        for(int i=0; i<s.length(); i++) {
        	hashset.add(array[i]);
        }
        
        List<String> list = new ArrayList<>(hashset);
        for(int i=0; i<list.size(); i++) {
        	int count = 0;
        	for(int j=0; j<array.length; j++) {
        		if(list.get(i).equals(array[j])) {
        			count++;
        		}
        	}
        	if(count == 1) {
        		Collections.sort(list);
        		answer += list.get(i);
        	}
        }
        
        return answer;
    }

}

package lv_0;

import java.util.Arrays;

public class Lv_0_문자열정렬하기_2 {

	public static void main(String[] args) {
		String my_string = "heLLo";
		Solution.solution(my_string);
	}
	
	static class Solution {
	    public static String solution(String my_string) {
	        String answer = "";
	        
	        String mystring = my_string.toLowerCase();
	        
	        char[] array = mystring.toCharArray();
	        Arrays.sort(array);

	        for(int i=0; i<array.length; i++) {
	        	answer += array[i];
	        }
	        System.out.println(answer);
	        return answer;
	    }
	}

}

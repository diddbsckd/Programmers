package lv_0;

public class Lv_0_문자열안에문자열 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		Solution.solution(array);
	}
	
	static class Solution {
	    public static int solution(int[] array) {
	        int answer = 0;
	        String x = "";
	        for(int i=0; i<array.length; i++) {
	        	String y = Integer.toString(array[i]);
	        	x += y;
	        }
	        String[] arrays = x.split("");
	        
	        for(int i=0; i<arrays.length; i++) {
	        	if(arrays[i].equals("7")) {
	        		answer++;
	        	}
	        }
	        System.out.println(answer);
	       
	        return answer;
	    }
	}

}

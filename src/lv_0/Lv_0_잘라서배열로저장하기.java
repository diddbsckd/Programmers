package lv_0;

public class Lv_0_잘라서배열로저장하기 {

	public static void main(String[] args) {
		Solution.solution("abc1Addfggg4556b", 6);
	}
	
	static class Solution {
	    public static String[] solution(String my_str, int n) {
	    	int num = my_str.length()/n;
	    	if(my_str.length()%n != 0) {
	    		num += 1;
	    	}
	    	
	        String[] answer = new String[num];
	        
	        for(int i=0; i<num; i++) {
	        	if(my_str.length() > n) {
	        		answer[i] = my_str.substring(0, n);
	        		my_str = my_str.substring(n);
	        	}else {
	        		answer[i] = my_str;
	        	}
	        	System.out.println(answer[i]);
	        }
	        
	        
	        return answer;
	    }
	}

}

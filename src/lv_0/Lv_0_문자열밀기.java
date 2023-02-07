package lv_0;

public class Lv_0_문자열밀기 {

	public static void main(String[] args) {
		
		Solution.solution("abc", "abc");
		
	}
	
	// A를 한칸씩 민다.
	// B와 비교를 한다.
	// A와 B가 같다면 민 횟수를 리턴한다.
	// A와 B가 같지 않다면 또 A를 한칸씩 민다.
	// 끝까지 다 돌렸는데도 같지 않다면 -1을 리턴한다.
	

	static class Solution {
		
	    public static int solution(String A, String B) {
	    	
	        int answer = 0;
	        
	        String B2 = B + B;
	        
	        int num = B2.indexOf(A);
	        
	        if(num != 0) {
	        	answer = num;
	        }else if(num == 0) {
	        	answer = 0;
	        }else if(num == -1) {
	        	answer = -1;
	        }

	        return answer;
	        
	    }
	    
	}
	
}

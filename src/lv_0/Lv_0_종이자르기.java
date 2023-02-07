package lv_0;

public class Lv_0_종이자르기 {

	public static void main(String[] args) {
		System.out.println(Solution.solution(2, 1));
	}
	
	static class Solution {
	    public static int solution(int M, int N) {
	        int answer = 0;
	        
	        if(M>0 && N>0) {
	        	answer += M-1;
	        	for(int i=M; i>0; i--) {
	        		answer += N-1;
	        	}
	        }
	        return answer;
	    }
	}

}

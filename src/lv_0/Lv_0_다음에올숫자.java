package lv_0;

public class Lv_0_다음에올숫자 {

	public static void main(String[] args) {
		int[] common = {2,4,8};
		System.out.println(Solution.solution(common));
	}
	
	static class Solution {
	    public static int solution(int[] common) {
	        int answer = 0;
	        
	        int x = common[1] - common[0];
	        int y = common[2] - common[1];
	        
	        if(x == y) {
	        	answer = common[common.length - 1] + x;
	        }else {
	        	answer = common[common.length - 1] * (y / x);
	        }
	        
	        return answer;
	    }
	}

}

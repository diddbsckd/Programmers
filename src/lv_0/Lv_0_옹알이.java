package lv_0;

public class Lv_0_옹알이 {

	public static void main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(Solution.solution(babbling));
	}
	
static class Solution {
	
	
    public static int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++) {
        	babbling[i] = babbling[i].replace("aya", " ");
        	babbling[i] = babbling[i].replace("ye", " ");
        	babbling[i] = babbling[i].replace("woo", " ");
        	babbling[i] = babbling[i].replace("ma", " ");
        	babbling[i] = babbling[i].trim();
        	System.out.println(babbling[i]);
        	if(babbling[i].length() == 0) {
        		answer++;
        	}
        }
        
        return answer;
    }
}

}

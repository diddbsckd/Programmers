package lv_0;

public class Lv_0_문자열밀기2 {

	public static void main(String[] args) {
		
		Solution.solution("hello", "llohe");
		
	}
	
	// A를 한칸씩 민다.
	// B와 비교를 한다.
	// A와 B가 같다면 민 횟수를 리턴한다.
	// A와 B가 같지 않다면 또 A를 한칸씩 민다.
	// 끝까지 다 돌렸는데도 같지 않다면 -1을 리턴한다.
	

	static class Solution {
		
	    public static int solution(String A, String B) {
	    	
	        int answer = 0;
	        
	        char[] Ac = A.toCharArray();
	        int length = Ac.length;
	        char[] Bc = new char[length];
	        int x = 0;
	        String A2 = "";
	        
	        if(A == B) {
	        	System.out.println(answer);
	        	return answer;
	        }else {
	        	while(x != length || A2 != B) {
	        		char last = Ac[length-1];
	        		for(int i=0; i<length-1; i++) {
	        			Bc[i+1] = Ac[i];
	        		}
	        		Bc[0] = last;
	        		Ac = Bc;
	        		answer++;
	        		System.out.println(Bc);
	        		
	        		if(Bc.toString() == B) {
	        			break;
	        		}else {
	        			break;
	        		}
	        	}
	        }
	        System.out.println(answer);
	        return answer;
	        
	    }
	    
	}
	
}

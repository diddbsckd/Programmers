package lv_0;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lv_0_약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		int[] answer = new Lv_0_약수구하기().solution(n);
		System.out.println(answer);
	}
	
	public int[] solution(int n) {
		Deque<Integer> answerD = new ArrayDeque<Integer>();
        int count = 0;
        
        for(int i=0; i<n; i++) {
        	if(n%(i+1)==0) {
        		answerD.add(i+1);
        	}
        }
        
        count = answerD.size();
        int[] answer = new int[count];
        
        for(int i=0; i<count; i++) {
        	answer[i] = answerD.pollFirst();
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}

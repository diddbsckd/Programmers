package lv_0;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Lv_0_n의배수고르기 {

	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] answer = new Lv_0_n의배수고르기().solution(n, numlist);
		
		System.out.println(Arrays.toString(answer));
	}
	
	public int[] solution(int n, int[] numlist) {
		Deque<Integer> aaa = new ArrayDeque<>();
       
        for(int i=0; i<numlist.length; i++) {
        	if(numlist[i]%n == 0) {
        		aaa.add(numlist[i]);
        	}
        }
        
        int num = aaa.size();
        int[] answer = new int[aaa.size()];
        
        for(int i=0; i<num; i++) {
        	answer[i] = aaa.pollFirst();
        }
        
        return answer;
    }

}

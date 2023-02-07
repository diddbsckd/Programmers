package lv_0;

import java.util.Arrays;
import java.util.Comparator;

public class Lv_0_명예의전당 {
	
	public static void main(String[] args) {
		Integer[] score = {10, 100, 20, 150, 1, 100, 200};
		int k = 3;
		Solution.solution(k, score);
	}
	
	static class Solution {
	    public static int[] solution(int k, Integer[] score) {
	        int[] answer = {};
	        int[] honor = new int[k];
	        
	        Arrays.sort(score, Comparator.reverseOrder());
	        for(int i=0; i<score.length; i++) {
	        	honor[i] = score[i];
	        }
	        
	        return answer;
	    }
	}

	

}

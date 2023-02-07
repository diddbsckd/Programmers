package lv_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lv_0_등수매기기 {

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[] answer = new Lv_0_등수매기기().solution(score);
		System.out.println(answer);
	}
	
	public int[] solution(int[][] score) {
		int length = score.length;
        int[] answer = new int[length];
        int[] avg = new int[length];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<length; i++) {
        	avg[i] = score[i][0] + score[i][1];
        }
        
        int[] avg2 = avg.clone();
        Arrays.sort(avg2);
        
        int a = length;
        for(int i=0; i<length; i++) {
        	map.put(avg2[i], a);
        	a--;
        }
        
        for(int i=0; i<length; i++) {
        	answer[i] = map.get(avg[i]);
        }
        
        return answer;
    }

}

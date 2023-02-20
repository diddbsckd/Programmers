package lv_0;

import java.util.Arrays;

public class Lv_0_중앙값구하기 {

	public static void main(String[] args) {
		int[] array = {1,2,7,10,11};
		int answer = new Lv_0_중앙값구하기().solution(array);
		System.out.println(answer);
	}
	
	public int solution(int[] array) {
        int answer = 0;
        int middle = (array.length)/2;
        
        Arrays.sort(array);
        answer = array[middle];
        
        return answer;
    }

}

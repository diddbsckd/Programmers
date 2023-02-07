package lv_0;

import java.util.Arrays;

public class Lv_0_삼각형의완성조건1 {

	public static void main(String[] args) {
		int[] sides = {3,6,2};
		int answer = new Lv_0_삼각형의완성조건1().solution(sides);
		System.out.println(answer);
	}
	
	public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        System.out.println(sides[0]);
        
        answer = (sides[2] < sides[1] + sides[0])? 1 : 2;
        
        return answer;
    }

}

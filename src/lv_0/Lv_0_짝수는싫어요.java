package lv_0;

import java.util.ArrayList;
import java.util.List;

public class Lv_0_짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		int[] answer = new Lv_0_짝수는싫어요().solution(n);
		System.out.println(answer);
	}
	
	public int[] solution(int n) {
        int[] answer = new int[(n/2)+(n%2)];
        int x = 0;
        for(int i=1; i<=n; i++) {
        	if(i%2 != 0) {
        		answer[x] = i;
        		x++;
        	}
        }
        
        return answer;
    }

}

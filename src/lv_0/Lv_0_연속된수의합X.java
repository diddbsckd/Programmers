package lv_0;

public class Lv_0_연속된수의합X {

	public static void main(String[] args) {
		int num = 4;
		int total = 14;
		int[] answer = new Lv_0_연속된수의합X().solution(num, total);
		System.out.println(answer);
	}
	
	
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int X = num/2;
        int Y = total/num;
        
        if(num%2 == 1) {
        	for(int i=0; i<num; i++) {
        		answer[i] = Y - X;
        		X--;
        		System.out.println(answer[i]);
        	}
        }else if(num%2 == 0) {
        	X -= 1;
        	for(int i=0; i<num; i++) {
        		answer[i] = Y - X;
        		X--;
        		System.out.println(answer[i]);
        	}
        }
        return answer;
    }
}

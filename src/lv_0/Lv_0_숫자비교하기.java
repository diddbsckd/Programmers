package lv_0;

public class Lv_0_숫자비교하기 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int answer = new Lv_0_숫자비교하기().solution(num1, num2);
		System.out.println(answer);
	}
	
	public int solution(int num1, int num2) {
        int answer = 0;
        
        if(num1 == num2) {
        	answer = 1;
        }else {
        	answer = -1;
        }
        
        return answer;
    }

}

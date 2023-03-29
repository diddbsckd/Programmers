package lv_0;

public class Lv_0_두수의나눗셈 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 16;
		int answer = new Lv_0_두수의나눗셈().solution(num1, num2);
		System.out.println(answer);
	}
	
	public int solution(int num1, int num2) {
        int answer = 0;
        
        answer = (int)((double)num1/num2*1000);
        
        return answer;
    }

}

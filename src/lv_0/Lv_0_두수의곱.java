package lv_0;

public class Lv_0_두수의곱 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int answer = new Lv_0_두수의곱().solution(num1, num2);
		System.out.println(answer);
	}
	
	public int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }

}

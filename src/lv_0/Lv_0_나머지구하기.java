package lv_0;

public class Lv_0_나머지구하기 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 2;
		int answer = new Lv_0_나머지구하기().solution(num1, num2);
		System.out.println(answer);
	}
	
	public int solution(int num1, int num2) {
        return num1%num2;
    }

}

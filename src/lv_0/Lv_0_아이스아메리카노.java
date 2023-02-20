package lv_0;

public class Lv_0_아이스아메리카노 {

	public static void main(String[] args) {
		int money = 15000;
		int[] answer = new Lv_0_아이스아메리카노().solution(money);
		System.out.println(answer);
	}
	
	public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money/5500;
        answer[1] = money%5500;
        
        return answer;
    }

}

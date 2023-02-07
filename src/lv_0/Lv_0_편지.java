package lv_0;

public class Lv_0_편지 {

	public static void main(String[] args) {
		String message = "happy birthday!";
		int answer = new Lv_0_편지().solution(message);
		System.out.println(answer);
	}
	
	public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }

}

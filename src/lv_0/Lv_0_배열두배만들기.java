package lv_0;

public class Lv_0_배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] answer = new Lv_0_배열두배만들기().solution(numbers);
		System.out.println(answer);
	}
	
	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = numbers[i]*2;
        }
        
        return answer;
    }

}

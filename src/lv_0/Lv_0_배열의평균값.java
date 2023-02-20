package lv_0;

public class Lv_0_배열의평균값 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 16};
		double answer = new Lv_0_배열의평균값().solution(numbers);
		System.out.println(answer);
	}
	
	public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
        	sum += numbers[i];
        }
        
        answer = sum/numbers.length;
        return answer;
    }

}

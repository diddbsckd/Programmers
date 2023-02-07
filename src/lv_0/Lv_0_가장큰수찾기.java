package lv_0;

public class Lv_0_가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {9, 10, 11, 12};
		int[] answer = new Lv_0_가장큰수찾기().solution(array);
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
	
	public int[] solution(int[] array) {
        int[] answer = {0, 0};
        answer[0] = array[0];
        answer[1] = 0;
        for(int i=1; i<array.length-1; i++) {
        	if(array[i] > array[i-1]) {
        		answer[0] = array[i];
        		answer[1] = i;
        	}
        }
        
        return answer;
    }

}

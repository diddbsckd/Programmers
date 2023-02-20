package lv_0;

public class Lv_0_피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 10;
		int answer = new Lv_0_피자나눠먹기2().solution(n);
		System.out.println(answer);
	}
	
	public int solution(int n) {
        int answer = 1;
        
        while(true) {
        	if((6*answer)%n != 0) {
        		answer++;
        	}else {
        		return answer;
        	}
        }
    }

}



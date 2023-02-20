package lv_0;

public class Lv_0_피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15;
		int answer = new Lv_0_피자나눠먹기1().solution(n);
		System.out.println(answer);
	}
	
	public int solution(int n) {
        int answer = 0;
        int x = n%7;
        
        if(x == 0) {
        	answer = n/7;
        }else {
        	answer = (n/7)+1;
        }
        
        return answer;
    }

}



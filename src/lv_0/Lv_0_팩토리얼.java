package lv_0;

public class Lv_0_팩토리얼 {

	public static void main(String[] args) {
		int n = 3628800;
		int answer = new Lv_0_팩토리얼().solution(n);
		System.out.println(answer);
	}
	
	public int solution(int n) {
        int answer = 1;
        int i=1;
        
        while(i<n) {
        	answer++;
        	i *= answer;
        	if(i>n) {
        		answer -= 1;
        	}
        }
        
        return answer;
    }

}

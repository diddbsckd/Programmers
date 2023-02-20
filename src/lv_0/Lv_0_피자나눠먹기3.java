package lv_0;

public class Lv_0_피자나눠먹기3 {

	public static void main(String[] args) {
		int slice = 4;
		int n = 12;
		int answer = new Lv_0_피자나눠먹기3().solution(slice, n);
		System.out.println(answer);
	}
	
	public int solution(int slice, int n) {
        int answer = 0;
        
        while((slice*answer)/n < 1) {
        	answer++;
        }
        
        return answer;
    }

}



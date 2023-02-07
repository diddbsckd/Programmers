package lv_0;

public class Lv_0_숫자찾기 {

	public static void main(String[] args) {
		int num = 123456;
		int k = 4;
		int answer = new Lv_0_숫자찾기().solution(num, k);
		System.out.println(answer);
	}
	
	public int solution(int num, int k) {
        int answer = 0;
        
        String numS = num+"";
        String kS = k+"";
        
        answer = numS.indexOf(kS);
        
        if(answer > -1) {
        	answer += 1;
        }
        
        
        return answer;
    }

}

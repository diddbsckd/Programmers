package lv_0;

public class Lv_0_자리수더하기 {

	public static void main(String[] args) {
		int n = 930211;
		int answer = new Lv_0_자리수더하기().solution(n);
		System.out.println(answer);
	}
	
    public int solution(int n) {
        int answer = 0;
        
        while(n>0) {
        	answer += n%10;
        	n = n/10;
        }
        
        return answer;
    }

}

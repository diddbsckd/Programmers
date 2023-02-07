package lv_0;

public class Lv_0_암호해독 {

	public static void main(String[] args) {
		String cipher = "pfqallllabwaoclk";
		int code = 2;
		String answer = new Lv_0_암호해독().solution(cipher, code);
		System.out.println(answer);
	}
	
	public String solution(String cipher, int code) {
        String answer = "";
        int X = cipher.length()/code;
        System.out.println(X);
        
        for(int i=1; i<=X; i++) {
        	answer += cipher.charAt((code*i)-1);
        }
        
        return answer;
    }

}

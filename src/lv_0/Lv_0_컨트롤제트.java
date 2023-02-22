package lv_0;

public class Lv_0_컨트롤제트 {

	public static void main(String[] args) {
		String s = "10 20 30 40";
		int answer = new Lv_0_컨트롤제트().solution(s);
		System.out.println(answer);
	}
	
	public int solution(String s) {
        int answer = 0;
        
        String[] S = s.split(" ");
        
        int num = 0;
        for(int i=0; i<S.length; i++) {
        	if(S[i].equals("Z")) {
        		answer -= num;
        	}else if(!S[i].equals("Z")) {
        		num = Integer.parseInt(S[i]);
        		answer += num;
        	}
        }
        
        return answer;
    }

}

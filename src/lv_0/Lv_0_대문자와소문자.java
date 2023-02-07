package lv_0;

public class Lv_0_대문자와소문자 {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		String answer = new Lv_0_대문자와소문자().solution(my_string);
		System.out.println(answer);
	}
	
	public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	char X = my_string.charAt(i);
        	
        	if(X >= 'A' && X <= 'Z') {
        		answer += Character.toLowerCase(X);
        	}else if(X >= 'a' && X <= 'z') {
        		answer += Character.toUpperCase(X);
        	}
        }
        return answer;
    }

}
package lv_0;

public class Lv_0_A로B만들기 {

	public static void main(String[] args) {
		String before = "allpe";
		String after = "apple";
		int answer = new Lv_0_A로B만들기().solution(before, after);
		System.out.println(answer);
	}
	
	public int solution(String before, String after) {
        int answer = 0;
        int length = before.length();
        String arr[] = new String[length];
        arr = before.split("");
        
        for(int i=0; i<length; i++) {
        	after = after.replaceFirst(arr[i], "");
        }
        
        if(after.length() == 0) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }

}

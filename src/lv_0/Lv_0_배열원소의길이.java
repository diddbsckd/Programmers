package lv_0;

public class Lv_0_배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		int[] answer = new Lv_0_배열원소의길이().solution(strlist);
		System.out.println(answer);
	}
	
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++) {
        	answer[i] = strlist[i].length();
        }
        
        return answer;
    }

}

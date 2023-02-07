package lv_0;

public class Lv_0_배열의유사도 {

	public static void main(String[] args) {
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		int answer = new Lv_0_배열의유사도().solution(s1, s2);
		System.out.println(answer);
	}
	
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(int i=0; i<s1.length; i++) {
        	for(int j=0; j<s2.length; j++) {
        		if(s1[i].equals(s2[j])) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }

}

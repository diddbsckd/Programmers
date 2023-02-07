package lv_0;

public class Lv_0_k의개수 {

	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		int k = 5;
		int answer = new Lv_0_k의개수().solution(i, j, k);
		System.out.println(answer);
	}
	
	public int solution(int i, int j, int k) {
        int answer = 0;
        String a = "";
        
        for(int x=i; x<=j; x++ ) {
        	a += String.valueOf(x);
        }
        
        String[] z = a.split("");
        String K = String.valueOf(k);
        
        for(int y=0; y<a.length(); y++) {
        	if(z[y].equals(K)) {
        		answer++;
        	}
        }
        
        return answer;
    }

}

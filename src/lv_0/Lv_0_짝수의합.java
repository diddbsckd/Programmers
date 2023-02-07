package lv_0;

public class Lv_0_짝수의합 {

	public static void main(String[] args) {
		int n = 14;
		int answer = new Lv_0_짝수의합().solution(n);
		System.out.println(answer);
	}
	
    public int solution(int n) {
        int answer = 0;
        
//        answer = ((n/2)%2) == 0 ? (n+2) * (n/4) : (n+2) * ((n/2)/2) + ((n+2)/2);
        
        if((n/2)%2 == 0 ) {
        	answer = (n+2) * (n/4);
        }else {
        	answer = (n+2) * ((n/2)/2) + ((n+2)/2);
        }
        
        return answer;
    }

}

//        2 4 6 8 10
//        2 4 6 8 10 12 14
//        (N+2) * (N/2)%2 + (N+2)/2
//        
//        16 * 3 + 8
//        48 + 8
//        56
//        
//        2 4 6 8 10 12
//        2 4 6 8 10 12 14 16
//        (N+2) * (N/4)
//        18 * 4
//        72

//        for(int i=1; i<=n; i++) {
//        	if(i%2 == 0) {
//        		answer += i;
//        	}
//        }

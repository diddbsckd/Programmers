package lv_0;

public class Lv_0_치킨쿠폰 {

	public static void main(String[] args) {
		int chicken = 1081;
		int answer = new Lv_0_치킨쿠폰().solution(chicken);
		System.out.println(answer);
	}
	
	public int solution(int chicken) {
        int answer = 0;
        int rem = 0;
        
        while(chicken >= 10) {
        	rem = chicken % 10;
        	chicken /= 10;
        	answer += chicken;
        	chicken += rem; 
        }
        
        return answer;
    }

}

package lv_0;

public class Lv_0_개미군단 {

	public static void main(String[] args) {
		int hp = 999;
		int answer = new Lv_0_개미군단().solution(hp);
		System.out.println(answer);
	}
	
	public int solution(int hp) {
        int answer = 0;
        
        while(hp>0){
        	if(hp>=5) {
        		answer = hp/5;
        		hp %= 5;
        		continue;
        	}else if(hp>=3 && hp<5) {
        		answer++;
        		hp %= 3;
        		continue;
        	}else if(hp<3 && hp>0){
        		answer += hp;
        		hp = 0;
        		continue;
        	}else {
        		break;
        	}
        }
        return answer;
    }

}

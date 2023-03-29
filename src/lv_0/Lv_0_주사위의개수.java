package lv_0;

public class Lv_0_주사위의개수 {

	public static void main(String[] args) {
		int n = 1;
		int[] box = {1,1,1};
		int answer = new Lv_0_주사위의개수().solution(box, n);
		System.out.println(answer);
	}
	
	public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0]/n;
        int height = (box[1]/n);
        int high = box[2]/n;
        
        answer = (width * height) * high;
        
        return answer;
    }

}

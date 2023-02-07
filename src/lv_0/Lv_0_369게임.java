package lv_0;

public class Lv_0_369게임 {

	public static void main(String[] args) {
		int order = 29323;
		int answer = new Lv_0_369게임().solution(order);
		System.out.println(answer);
	}
	
	public int solution(int order) {
        int answer = 0;
        
        String[] arr = (order+"").split("");
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) answer++;
        }
        
        return answer;
    }

}

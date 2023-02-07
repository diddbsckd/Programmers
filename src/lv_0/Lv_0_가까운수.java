package lv_0;

public class Lv_0_가까운수 {

	public static void main(String[] args) {
		int[] array = {1,3,5};
		int n = 4;
		int answer = new Lv_0_가까운수().solution(array, n);
		System.out.println(answer);
	}
	
	public int solution(int[] array, int n) {
        int answer = 0;
        int X = 100;
        int Y = 0;
        
        for(int i=0; i<array.length; i++) {
        	Y = Math.abs(array[i] - n);
        	
        	if(Y < X) {
        		X = Y;
        		answer = array[i];
        	}else if(X == Y) {
        		if(array[i]<answer) {
        			answer = array[i];
        		}
        	}
        }
        return answer;
    }
}

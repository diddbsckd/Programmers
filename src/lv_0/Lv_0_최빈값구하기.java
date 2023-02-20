package lv_0;

public class Lv_0_최빈값구하기 {

	public static void main(String[] args) {
		int[] array = {1,2,3,3,3,4};
		int answer = new Lv_0_최빈값구하기().solution(array);
		System.out.println(answer);
	}
	
	public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] arr = new int[1000];
        
        for(int i=0; i<array.length; i++) {
        	arr[array[i]] += 1;
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        		answer = i;
        	}else if(arr[i] != 0 && arr[i] == max) {
        		answer = -1;
        	}
        }
        return answer;
    }

}

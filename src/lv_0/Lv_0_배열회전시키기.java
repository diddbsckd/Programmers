package lv_0;

import java.util.Deque;
import java.util.LinkedList;

public class Lv_0_배열회전시키기 {

	public static void main(String[] args) {
		int[] number = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] answer = new Lv_0_배열회전시키기().solution(number, direction);
		System.out.println(answer);
	}
	
	public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int a = 0;
        
        Deque<Integer> deque = new LinkedList<>();
        
        for(int i=0; i<numbers.length; i++) {
        	deque.addLast(numbers[i]);
        }
        
        if(direction.equals("right")) {
        	a = deque.pollLast();
        	deque.addFirst(a);
        }else if(direction.equals("left")) {
        	a = deque.pollFirst();
        	deque.addLast(a);
        }
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = deque.pollFirst();
        }
        
        return answer;
    }

}
















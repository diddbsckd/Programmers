package lv_0;

public class Lv_0_문자열계산하기 {

	public static void main(String[] args) {
		String my_string = "3 + 4";
		int answer = new Lv_0_문자열계산하기().solution(my_string);
		System.out.println(answer);
	}
	
	public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split(" ");
        
        answer = Integer.parseInt(array[0]);
        
        for(int i=1; i<array.length-1; i++) {
        	if(i%2 == 1) {
        		if(array[i].equals("+")) {
        			answer += Integer.parseInt(array[i+1]);
        		}else if(array[i].equals("-")) {
        			answer -= Integer.parseInt(array[i+1]);
        		}
        	}
        }
        
        
        
        
        
        return answer;
    }

}

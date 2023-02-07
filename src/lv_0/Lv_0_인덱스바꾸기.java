package lv_0;

public class Lv_0_인덱스바꾸기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String answer = new Lv_0_인덱스바꾸기().solution(my_string, num1, num2);
		System.out.println(answer);
	}
	
	
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] mychar = my_string.toCharArray();
        
        char X = mychar[num1];
        char Y = mychar[num2];
        
        mychar[num1] = Y;
        mychar[num2] = X;
        
        for(int i=0; i<mychar.length; i++) {
        	answer += mychar[i];
        }
        
        return answer;
    }
	

}

package lv_1;

public class Lv_1_개인정보수집유효기간 {

	public static void main(String[] args) {
		String today = "2022.05.19";
//		HashMap<String, Integer> term = new HashMap<>();
		String[] term = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		int[] answer = new Lv_1_개인정보수집유효기간().solution(today, term, privacies);
		System.out.println(answer);
	}

	public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        String[] todayA = today.split("\\.");
        System.out.println(todayA[0]);
        System.out.println(todayA[1]);
        System.out.println(todayA[2]);
        
        
        
        for(int i=0; i<privacies.length; i++) {
        }
        
        
        return answer;
    }
}

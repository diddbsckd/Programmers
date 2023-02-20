package lv_0;

public class Lv_0_옷가게할인받기 {

	public static void main(String[] args) {
		int price = 300000;
		int answer = new Lv_0_옷가게할인받기().solution(price);
		System.out.println(answer);
	}
	
	public int solution(int price) {
        if(price >= 100000 && price < 300000) {
        	price -= price * 0.05;
        }else if(price >= 300000 && price < 500000) {
        	price -= price * 0.1;
        }else if(price >= 500000) {
        	price -= price * 0.2;
        }
        return price;
    }

}

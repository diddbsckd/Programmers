package lv_0;

public class Lv_0_캐릭터의좌표 {

	public static void main(String[] args) {
		int[] board = {7, 9};
		String[] keyinput = {"down", "down", "down", "down", "down"};
		int[] answer = new Lv_0_캐릭터의좌표().solution(keyinput, board);
		System.out.println(answer);
	}
	
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        int xRight = board[0]/2;
        int xLeft = -(xRight);
        int yUp = board[1]/2;
        int yDown = -(yUp);
        
        for(int i=0; i<keyinput.length; i++) {
        	if(keyinput[i].equals("left") && answer[0]>xLeft) {
        		answer[0] -= 1;
        	}else if(keyinput[i].equals("right")&&answer[0]<xRight){
        		answer[0] += 1;
        	}else if(keyinput[i].equals("up")&&answer[1]<yUp) {
        		answer[1] += 1;
        	}else if(keyinput[i].equals("down")&&answer[1]>yDown) {
        		answer[1] -= 1;
        	}
        }
        
        return answer;
    }

}

package lv_0;

public class Lv_0_로그인성공 {

	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"meosseugi", "1234"}, {"rardss", "123"}, {"yyoom", "1234"}};
		String answer = new Lv_0_로그인성공().solution(id_pw, db);
		System.out.println(answer);
	}
	
	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i=0; i<db.length; i++) {
        	if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
        		System.out.println(1);
        		answer = "login";
        	}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1]) && !answer.equals("login") ) {
        		System.out.println(2);
        		answer = "wrong pw";
        	}else if(!id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1]) && !answer.equals("login") && !answer.equals("wrong pw")) {
        		System.out.println(3);
        		answer = "fail";
        	}
        }
        
        return answer;
    }

}

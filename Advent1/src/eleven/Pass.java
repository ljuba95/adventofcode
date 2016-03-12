package eleven;

public class Pass {
	
	
	private static boolean isValid(char[] yo){
		String hello = String.valueOf(yo);
		int a=0;
		int b=0;
		if(hello.contains("i") || hello.contains("o") || hello.contains("l"))
			return false;
		for (char i = 'a'; i <='z' ; i++) {
			String la = String.valueOf(i)+ String.valueOf(i);
			if(hello.contains(la)) a++;
			if(a ==2) break;
		}
		for(int i = 0;i<26;i++){
			String hai = String.valueOf((char)('a'+i)).concat(String.valueOf((char)('a' +i+1)).concat(String.valueOf((char)('a' +i+2))));
			if(hello.contains(hai)){
				b=1;
				break;
			}
		}
		if(a==2 && b==1) return true;
		else return false;
		
	}
	
	private static char [] fkinSHEET(char [] yo, int mesto){
		if(mesto<0) return yo;
		if(yo[mesto] == 'z'){
			yo[mesto] = 'a';
			return fkinSHEET(yo,mesto-1);
		} else {
			yo[mesto]++;
			return yo;
		}
	}
	public static void main(String[] args) {
		char[] pass = "cqjxxyzz".toCharArray();
		while(true){
			pass = fkinSHEET(pass, 7);
			if(isValid(pass)){
				System.out.println(String.valueOf(pass));
				return;
			}
		}		
	}

}

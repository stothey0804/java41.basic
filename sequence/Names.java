package sequence;

public class Names {

	public static void main(String[] args) {
		String[] name = {"a","b","c","d","e"};
		// ace 를 출력하시오.
		String result = "";
		
//		for(int i = 0; i < name.length; i+=2) {
//			result += name[i];
//		}
		
		int i = 0;
		while(true) {
			if(i < name.length) {
				result += name[i];
				i+=2;
				continue;
			}else {
				break;
			}
		}		
		
		System.out.println(result);
	}

}

package programs;

public class RemoveOneDuplicatesfromaNumberString {
	
	public static void main(String[] args) {
		String s= "564430047697980000000";
		String str="";
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)=='0')) {
				str=str+s.charAt(i);	
			}	
		}
		
				System.out.println(str);
	}

	
	
}

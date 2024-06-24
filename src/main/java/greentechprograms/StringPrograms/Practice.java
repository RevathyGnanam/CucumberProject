package greentechprograms.StringPrograms;

public class Practice {

	public static void main(String[] args) {
		String s = "Welcome to Maveric Systems";
		String[] text =s.split(" ");
		String nstr="";
		for(int i=0;i<text.length;i++) {
			String words = text[i];
		for(int j=words.length()-1;j>=0;j--){
	
		nstr= nstr+words.charAt(j);
				
		}
		nstr=nstr+" ";
		}
		
		System.out.println(nstr);

	}

}

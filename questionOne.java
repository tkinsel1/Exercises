package generalScripting ;
public class questionOne {
	
		public static void main (String args[]){
			
			String s = "hope you are doing well";
			reverseEverything(s);
		
		}
		public static void reverseEverything(String s){
			String reverse = new StringBuffer(s).reverse().toString();
			System.out.println(reverse);
		}
	
		
}
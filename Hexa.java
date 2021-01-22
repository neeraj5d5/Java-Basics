import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hexa {
	public static String ConvertHexa(String str) {
		char ch[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < ch.length; i++) {
	         String hexString = Integer.toHexString(ch[i]);
	         sb.append(hexString);
	      }
	      String hexa = sb.toString();
	      char ch1[] = hexa.toCharArray();
	      StringBuffer sb1 = new StringBuffer();
	      int j=ch1.length;
	      for(int i = 1; i < j+1; i++) {
		         sb1.append(ch1[i-1]);
		         if(i%4==0) {
		        	 sb1.append(" ");
		         }
		         
		      }
	      String hexa1 = sb1.toString();
	      
		return hexa1;
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\R~N~K~V\\Documents\\Neeraj\\Selenium\\Data.txt"));
		 String line1 = reader1.readLine();
		
		 while (line1 != null)
		    {
			 String a=ConvertHexa(line1);
			 System.out.println(a+" "+line1);
			
			 line1 = reader1.readLine();
			 
		    }

	}

}

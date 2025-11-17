package OtherCode;

public class RemoveSpaceinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//1.Using for loop		
		String str = "ABC DEF";
        
        String rev = "";
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                rev = rev + str.charAt(i);
            }
        }
          
        System.out.println(rev);
        
        
//2.Using Replace() and ReplaceAll() method        
        
        String s = "ABC BCA";
        
        String res = s.replace(" ", "");
        
        System.out.println(res);

	}

}

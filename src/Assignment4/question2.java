package Assignment4;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class StringUtil {
		    String ans = "";
		    public String reverse(String str) {
		        ans = Character.toString(str.charAt(str.length()-1));
		        if (str.length() != 1)
		            return ans + reverse(str.substring(0,str.length()-1));
		        else
		            return ans;
		    }
		}

		class Main
		{
		        public void main(String[] args) {
		                
		                StringUtil s = new StringUtil();
		                System.out.println(s.reverse("ABCDEF"));
		        }
		}
	}

}

package ConfigLayer;

public class JavaProgram {

	public static void main(String[]args) {
		
	String ab="shital@#pedd123$%awad",ch="",dig="",specialchar="";
		
		for (int i=0;i<ab.length();i++)
		{
			if(Character.isAlphabetic(ab.charAt(i)))
			{
				ch=ch+ab.charAt(i);
			}
			else if(Character.isDigit(ab.charAt(i)))
			{
				dig=dig+ab.charAt(i);
			}
			
			else
			{
				specialchar=specialchar+ab.charAt(i);
			}
		}
     
		
		System.out.println(ch);
		System.out.println(dig);
		System.out.println(specialchar);
	}
		
	
		
	}


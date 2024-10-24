package reverseAString;

public class TaskLogicalProgram 
{

	public static void main(String[] args) 
	{
//		String str= "This is selenium class";  //This si selenium ssalc 
//  		str=str.trim();
//		System.out.println(str);
//
//		
//		String substring1=str.substring(4);
//		System.out.println(substring1);
//		
//		char c1=str.charAt(4);
//		System.out.println(c1);
//	
//	System.out.println(str.length());
//		for (int v=str.length()-1; v>=0; v--)
//		{
//			System.out.print(str.charAt(v));
//	
//		}
//	
		
		String strr = "This is selenium class";    
		System.out.println(strr.length());
		String replaceddata= strr.replaceAll("\\s", "");
		System.out.println(replaceddata);

char[] chAr=strr.toCharArray();

System.out.println(chAr[0]);
System.out.println(chAr[1]);

////for(int i=chAr.length-1; i>=0; i--)
//{
//	System.out.print(chAr[i]);
//}
//
//System.out.println(" "); 
//
//		
	}
	
}
	







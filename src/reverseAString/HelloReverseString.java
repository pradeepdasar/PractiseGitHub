package reverseAString;

public class HelloReverseString
{

	public static void main(String[] args)
	{
		
	//	Step---1
		String str= "hello";
		System.out.println(str.length());

		for(int i= str.length()-1; i>=0; i--)
		{
	//	System.out.println(str.charAt(i));
		
			System.out.print(str.charAt(i));
		}
		System.out.println("  ");
		
		
	//	Step2
		String strr = "hello";
		System.out.println(strr.length());

char[] chAr=strr.toCharArray();
for(int i=chAr.length-1; i>=0; i--)
{
	System.out.print(chAr[i]);
}

System.out.println(" "); 

//	Step3

String stri= "hello";
StringBuffer sb= new StringBuffer(stri);
System.out.print(sb.reverse());

System.out.println(" ");

//	Step4
	
	
	String strin= "hello";
	StringBuilder sbd= new StringBuilder(strin);
	System.out.println(sbd.reverse());


	}

}

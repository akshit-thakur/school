//icse 2006
class StringEdit
{
	public static void main(String args[])
	{
		String S="January 26 is celebrated as Republic day in India.";
		System.out.println("Original String:"+S);
		String Date="August 15",Day="Independence";
		int len=S.length(),DateIndex=S.indexOf("January 26"),IndexDay=S.indexOf("Republic");
		String dayChange=S.substring((IndexDay+1),len);
		String dateChange=S.substring((DateIndex+1),IndexDay);
		String S1=Date+""+dateChange;
		String S2=Day+""+dayChange;
		String S3=S1+""+S2; 
		System.out.println("Edited String:"+Date+""+dateChange+""+Day+""+dayChange);
	}
}
		
		 







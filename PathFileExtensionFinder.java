import java.io.*;
class PathFileExtensionFinder
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter the path of a file with extension e.g. D:/Folder/File.jpg.");
		String S=input.readLine();
		int fileIndex=S.lastIndexOf('/');
		int extensionIndex=S.indexOf('.');
		int i=fileIndex+1,j=extensionIndex,a=extensionIndex+1,len=S.length();
		String path=S.substring(0,fileIndex);
		String file=S.substring(i,j);
		String extension=S.substring(a,(len));
		System.out.println("File location: "+S);
		System.out.println("File path: "+path);
		System.out.println("File name: "+file);
		System.out.println("File extension: "+extension);
	}
}
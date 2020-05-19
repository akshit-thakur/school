import java.io.*;
class movieMagic{
	public int year;
	public float rating;
	public String title;
	movieMagic(){
		year=0;
		rating=0.0f; 
		title="";
	} 
	void accept() throws IOException{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.println("Enter year of release of film.");
		year=Integer.parseInt(input.readLine());
		System.out.println("Enter name of film.");
		title=input.readLine();
		System.out.println("Enter rating from 0-5 in decimals.:");
		rating=Float.parseFloat(input.readLine());
	}
	void display(){
		System.out.println("Name of film "+title);
		System.out.println("Year of release: "+year);
		if(rating<2.0)
		System.out.println("Flop");	
		else if(rating>2.0&&rating<=3.4)
		System.out.println("Semi-Hit");	
		else if(rating>3.4&&rating<=4.5)
		System.out.println("Hit.");	
		else
		System.out.println("SUPER HIT");	
	}
	public static void main(String args[]) throws Exception{
		movieMagic obj=new movieMagic();
		obj.accept();
		obj.display();
	}
}
	
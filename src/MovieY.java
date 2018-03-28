import java.util.Scanner;
public class MovieY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner U=new Scanner(System.in);
Movie A=new Movie("IT","Horror",4);	

Movie B=new Movie("The Goonies","Adventure",4);		

Movie C=new Movie("Step Brothers","Comedy",3);	

Movie D=new Movie("The Dark Knight","Action",5);		

Movie E=new Movie("Tower Height","Action",3);		
		
Movie[]	Movie={A,B,C,D,E};

System.out.println("Type in a Movie");		
String User=U.nextLine();	

for(int i=0;i<5;i++){
	
if(User.equals(Movie[i].name))	{
	System.out.println(Movie[i].name);
	System.out.println(Movie[i].genre);
	System.out.println(Movie[i].rating);
	i=4;
}

else if(User.equals("Quit")){
	
	System.out.println("End");
	i=4;
}
else{
	System.out.println("Not found");
}


}


		
		
		
	}

}

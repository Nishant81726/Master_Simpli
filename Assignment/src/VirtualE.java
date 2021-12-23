import java.io.File;
import java.util.Scanner;
public class VirtualE {

	public static void main(String[] args) {
		System.out.println(" Developer , " +       "Nishant   " +    "Warm Welcome!, to all of you in my Program" );
		System.out.println();
		virtualB vb = new virtualB();
		vb.display();
				
	}

}
class virtualB
{
	void display() 
	{
		System.out.println("############# Main Menu ############ ");
		System.out.println("Enter 1, Folder creation take place at partition E: by the name of Java_Full_Stack_Developer");
		System.out.println("Enter 2, to show new File menu");
		System.out.println("Enter 3, to Quit");
		System.out.println("#################################### ");
		Scanner sc1 =new Scanner(System.in);
		int choice = sc1.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
			File f = new File("E:\\Java_Full_Stack_Developer");
			String str = f.getPath();
			if(!f.exists())
				{
					f.mkdir();
					System.out.println("Folder Created " +str);
				}
			else
				System.out.println("Folder Already Exist " +str);
			}
			catch (Exception e)
			{
				System.out.println("Folder not created");
			}
			display();
			break;
			
		case 2:
		{
			System.out.println(" ************* File Menu **************** ");
			System.out.println(" Enter 1 ,Add file to current location ");
			System.out.println(" Enter 2 ,Search File ");
			System.out.println(" Enter 3 ,Delete file to current location ");
			System.out.println(" Enter 4 ,Go to main option ");
			System.out.println("***************************************** ");
			File f1 = new File("E:\\Java_Full_Stack_Developer\\Simpli_Java");
			String str1 = f1.getPath();
			Scanner sc2 = new Scanner(System.in);
			int choice2 = sc2.nextInt();
		
			switch(choice2)
			{
			case 1:
				try
				{
					if(!f1.exists())
					{
						f1.createNewFile();
						System.out.println(" Simpli_Java File added  at location " +str1 +" by the name Simpli_Java");
					}
					else
						System.out.println("File Already Exist " +str1);
				}
				catch (Exception e)
				{
					System.out.println("File not added");
				}
				display();
				break;
			case 2:
				if(f1.exists())
				System.out.println("File found at E: by the name Simpli_Java"+f1.getAbsolutePath());
				else
					System.out.println("File not found at current location");
				display();
			break;
			case 3:
				if(f1.exists())
				System.out.println("File get deleted, " +f1.delete()+ " indicate file deleted");
				else
					System.out.println("There is no file to delete");
				display();
			break;
			default:
				System.out.println(" Terminated from the file option ");
				//System.exit(choice2);
				display();	
		}	
		break;
		}
		default :
			System.out.println("termination from the main option");
			System.exit(choice);
	 }
   }
}
		
			

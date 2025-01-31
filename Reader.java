/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class FileReader 
{
	public static void main(String[] args) {
	   FileReader r=new FileReader("\\Documents\\Hello World.txt");
	   int i;
	   while((i=r.read())!=-1){
	       System.out.print((char)i);
	   }
	   r.close();
   }
}	
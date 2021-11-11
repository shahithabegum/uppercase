import java.lang.*;
import java.util.*;
class lu{
	public static void main(String arg[])
	 {
	   try{
                            // UPPER
	          String s=" ";
	          Scanner t=new Scanner(System.in);
	          System.out.println("enter u name");
	           s=t.next();
	           s=s.toUpperCase();
	            System.out.println(s);
	           //lower
	             s=s.toLowerCase();
	           System.out.println(s);
	          }
	        catch(Exception e)
	          {
	             System.out.println(e);
	           }
	}
}
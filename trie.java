
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n;
		sc.nextLine();
		for(int a=0;a<t;a++)
		{
		     n=sc.nextInt();
		      sc.nextLine();
		    String arr[]=sc.nextLine().split(" ");
		    String search=sc.nextLine();
		    for(int i=0;i<n;i++)
		    {
		        if(search.equals(arr[i]))
		        {
		        System.out.println("1");
		        n=-1;
		        break;
		        }
		    }
		    if(n!=-1)
		    System.out.println(0);
		}
		
	}
}

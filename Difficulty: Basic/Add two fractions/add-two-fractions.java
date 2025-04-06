//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
        int resNum=num1*den2+num2*den1;
        int resDen=den1*den2;
        int g=gcd(resNum,resDen);
        System.out.println(resNum/g+"/"+resDen/g);
    }
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}

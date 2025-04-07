//{ Driver Code Starts
import java.util.*;
class Replace{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		Solution g=new Solution();
		System.out.println(g.convertFive(n));
	
System.out.println("~");
}
}
}
// } Driver Code Ends


/*Complete the function below*/
class Solution{
	public static int convertFive(int n){
    //add code here.
    if (n == 0)
    return 5;
    int ans=0, m=1,rem=0;
    while(n>0){
       rem = n%10; 
       if(rem == 0){
           rem = 5;
       }
       ans = rem*m + ans;
       n/=10;
       m = m*10;
    }
    return ans;
    }
}
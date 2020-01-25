
import java.io.*;       
public class kaprekar
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,c=0,n2,sq;
        System.out.println("Enter a number:");
        n = Integer.parseInt(br.readLine());
      n2 = n;
      sq=n*n;
      while(n2>0)
      {
          n2 = n2/10;
          c++;
        }
        if(sq%Math.pow(10,c)+sq/(int)Math.pow(10,c)==n)
        System.out.println("The number is an kaprekar number");
        else
        System.out.println("The number is not an kaprekar number");
    }
}
        
        
        

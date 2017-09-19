
import java.io.*;
class karprekar
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int p;
    int q;
    int d;
    
    void get()throws Exception
    {
        System.out.println("Give limits");
        String x = br.readLine();
        p = Integer.parseInt(x);
        String y = br.readLine();
        q = Integer.parseInt(y);
        
        if(p>=q)
        {
            System.out.println("WRONG INPUT");
            
            
        }
    }
    void calc()throws Exception
    {
        System.out.println("THE NUMBERS ARE:");
        for(int i = p;i<=q;i++)
        {
            String c =Integer.toString(i);
            
            int sq =i*i;
            String let = Integer.toString(sq);
            if(let.length()<=1)
            {
                if(i<=1)
                {
                   System.out.print(i+",");
                    continue;
                }
                else
                {
                    continue;
                }
            }
            
            
            
            int k = let.length();    
            int g = k/2;
            String let1 = let.substring(0,g);
           
            String let2 = let.substring(g,k);
            int inp1 = Integer.parseInt(let1);      
            int inp2 = Integer.parseInt(let2);
            
                        
            int tot = inp1 + inp2;
            
             if(tot==i)
            {
                System.out.print(i+",");
            }
           
        }
    }
    public static void main(String[]args)throws Exception
    {
        karprekar o1 = new karprekar();
        o1.get();
        o1.calc();
    }
}
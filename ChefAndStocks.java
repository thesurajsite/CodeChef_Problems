package CodeChef;
import java.util.*;
public class ChefAndStocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int []num=new int[n];
            for(int i=0;i<n;i++)
            {
                num[i]=sc.nextInt();
            }
            Arrays.sort(num);
            int sum=0;
            for(int i=1;i<n;i++)
            {
                sum=sum+num[i];
            }
            System.out.println(sum);

        }
    }
}

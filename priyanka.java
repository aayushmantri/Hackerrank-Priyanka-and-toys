import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int weight[]=new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i]=sc.nextInt();
        }
        Arrays.sort(weight);
        int cost=1;
        int tempweight=weight[0];
        for(int i=1;i<weight.length;i++)
        {
            if(tempweight+4>=weight[i])
            {
                continue;
            }

            else{
            cost++;
            tempweight=weight[i];
            }


        }
        System.out.println(cost);

    }
}

class GfG
{
    public static long count2s(long n)
    {  long count=0;
        for(int i=0;i<=n;i++)
        {
            int j=i;
           while(j!=0)
           {
               if(j%10==2)
               count++;
               j=j/10;
           }
        }
        return count;
    }
    
    public static long count2sinRangeAtDigit(long n, long d)
    {
        return 0;
    }
}

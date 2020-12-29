class rearrange
{
    // Function to rearrange the elements
    // arr: input array
    // n: size of array
    static void arrange(long arr[], int n)
    {
        // your code here
         for(int i=0;i<n;i=i+1){
             

arr[i]=arr[i]+(arr[(int)arr[(int)i]]%n*n);


}

for(int i=0;i<n;i=i+1){

arr[i]=arr[i]/n;


}
    }
}

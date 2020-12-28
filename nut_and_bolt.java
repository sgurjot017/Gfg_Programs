class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        // code here
        char[] arr = {'!','#','$','%','&','*','@','^','~'};
int[] a = new int[9];
Map<Character, Integer> map = new HashMap<>();

for(int i=0; i<9; i++)
map.put(arr[i],i);

for(int i = 0; i<n; i++)
a[map.get(nuts[i])]++;
for(int i=0;i<n;i++) 
a[map.get(bolts[i])]++;
int index=0; 
for(int i= 0; i<9; i++)
{if(a[i]> 1){
nuts[index] = arr[i];
bolts[index] = arr[i];
index++;
}
}
    }
}

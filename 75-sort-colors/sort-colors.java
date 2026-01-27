class Solution {
    public void sortColors(int[] a) {
        int min;
        for(int i=0;i<a.length;i++){
         min=i;
        for(int j= i+1; j<a.length;j++)
        {
            if(a[j]<a[min])
            {
                min = j;
            }
        }
        int temp = a[i];
        a[i] = a[min];
        a[min]=temp;
    }
    }
}
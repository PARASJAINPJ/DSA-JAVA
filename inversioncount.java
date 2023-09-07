// Given an array of integers. Find theInversion Countin the array. (HARD)
// InversionCount:Foranarray,inversioncountindicateshowfar(orclose)thearrayisfrombeingsorted.
// Ifthearrayisalreadysortedthentheinversioncountis0.Ifanarrayissorted in the reverse order then the inversion count is the 
// maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3)


public class inversioncount {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

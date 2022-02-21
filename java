package rapid;

public class main {
    public static void main(String args){
        int [] x = new int [35];
        for (int i = 0; i < x.length ; i++){
            x[i] = i*i ;
        }
        main Ref = new main();
        System.out.println (Ref.binary_search(x, 9, x.length));
    }

    public int binary_search(int[] arr, int x, int n){
        int lo = 0;
        int hi = n - 1;
        int mid = 0;

        while(lo <= hi) {
            mid = (hi + lo); // 2
            if (arr[mid] < x){
                lo = mid + 1;
            }else if (arr[mid] > x){
                hi = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

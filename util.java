package lec6;

public class util {
    public static void main(String[] args) {

    }
    public static int maxindex(int ar[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (ar[i] > ar[max]) {
                max = i;
            }
        }
        return max;
    }
    public static void swap(int ar[], int i, int j){
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }

}



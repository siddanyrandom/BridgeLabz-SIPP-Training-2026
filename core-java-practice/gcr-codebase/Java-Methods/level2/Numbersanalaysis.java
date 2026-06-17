public class NumberAnalysis {
    static boolean isPositive(int n){ return n>=0; }
    static boolean isEven(int n){ return n%2==0; }
    static int compare(int a,int b){
        if(a>b) return 1;
        if(a<b) return -1;
        return 0;
    }
}

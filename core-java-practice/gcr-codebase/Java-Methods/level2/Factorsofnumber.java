import java.util.*;
public class FactorsOfNumber {
    static int[] getFactors(int number){
        int count=0;
        for(int i=1;i<=number;i++) if(number%i==0) count++;
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=number;i++) if(number%i==0) factors[index++]=i;
        return factors;
    }
    static int sumFactors(int[] arr){
        int sum=0;
        for(int n:arr) sum+=n;
        return sum;
    }
    static long productFactors(int[] arr){
        long product=1;
        for(int n:arr) product*=n;
        return product;
    }
    static double sumSquareFactors(int[] arr){
        double sum=0;
        for(int n:arr) sum+=Math.pow(n,2);
        return sum;
    }
}

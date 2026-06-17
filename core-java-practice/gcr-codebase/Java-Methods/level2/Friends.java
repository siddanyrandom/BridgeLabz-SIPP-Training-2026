public class FriendsAnalysis {
    static int findYoungest(int[] ages){
        int min=ages[0];
        for(int age:ages) if(age<min) min=age;
        return min;
    }
    static double findTallest(double[] heights){
        double max=heights[0];
        for(double h:heights) if(h>max) max=h;
        return max;
    }
}

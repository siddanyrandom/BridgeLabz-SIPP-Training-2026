public class LeapYear {
    static boolean isLeapYear(int year){
        return year>=1582 && ((year%4==0 && year%100!=0)||(year%400==0));
    }
}

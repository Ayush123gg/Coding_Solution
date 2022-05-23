class Solution {
    public boolean isLeapYear(int year)
{
    
    if(year%400==0)
        return true;
    else if(year%4==0 && year%100!=0)
        return true;
    else
        return false;
}
    public String dayOfTheWeek(int day, int month, int year) {
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int sum=4;
        for(int i=1971;i<year;i++){
            if(isLeapYear(i)) sum+=366;
            else sum+=365;
        }
        for(int i=0;i<month;i++){
            if(i==2&&isLeapYear(year)) sum++;
            sum+=mon[i];
        }
        sum+=day;
        return dayOfWeek[sum%7];
    }
}
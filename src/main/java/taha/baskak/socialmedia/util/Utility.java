package taha.baskak.socialmedia.util;

import java.util.Date;

public class Utility {
    public static final long MAGIC=864L;

    public static int DateToDays (Date date){
        //  convert a date to an integer and back again
        long currentTime=date.getTime();
        currentTime=currentTime/MAGIC;
        return (int) currentTime;
    }

    public static Date DaysToDate(int days) {
        //  convert integer back again to a date
        long currentTime=(long) days*MAGIC;
        return new Date(currentTime);
    }
}

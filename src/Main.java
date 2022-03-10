public class Main {
    public static void main(String[] args)
    {
        daysOfChristmas(5);
    }

    public static void daysOfChristmas(int dayNum)
    {
        String lyric = "On the " + dayNum + "th day of Christmas my true love gave to me ";
        String gifts = dayNum == 12 ? "twelve drummers drumming, ":
                dayNum == 11 ? "eleven pipers piping, ":
                        dayNum == 10 ? "ten lords a-leaping, ":
                                dayNum == 9 ? "nine ladies dancing, ":
                                        dayNum == 8 ? "eight maids a-milking, ":
                                                dayNum == 7 ? "seven swans a-swimming, ":
                                                        dayNum == 6 ? "six geese a-laying, ":
                                                                dayNum == 5 ? "five golden rings, ":
                                                                        dayNum == 4 ? "four calling birds, ":
                                                                                dayNum == 3 ? "three French hens, ":
                                                                                        dayNum == 2 ? "two turtle-doves, and ":
                                                                                                "a partridge in a pear tree";
        if(dayNum < 12)
        {
            switch(dayNum)
            {
                case 1:
                    lyric = "On the " + dayNum + "st day of Christmas ";
                    break;
                case 2:
                    lyric = "On the " + dayNum + "nd day of Christmas";
                    break;
                case 3:
                    lyric = "On the " + dayNum + "rd day of Christmas";
                    break;
            }

            daysOfChristmas(dayNum + 1);
        }
        System.out.println(lyric + gifts);
    }

/*    public static String daysOfChristmas(int dayNum)
    {
        String day = "first";
        boolean twelfthReached = false;
        switch(dayNum)
        {
            case 2:
                day = "second";
                break;
            case 3:
                day = "third";
                break;
            case 4:
                day = "fourth";
                break;
            case 5:
                day = "fifth";
                break;
            case 6:
                day = "sixth";
                break;
            case 7:
                day = "seventh";
                break;
            case 8:
                day = "eighth";
                break;
            case 9:
                day = "ninth";
                break;
            case 10:
                day = "tenth";
                break;
            case 11:
                day = "eleventh";
                break;
            case 12:
                day = "twelfth";
                twelfthReached = true;
                break;
        }



        String gifts = createGifts(dayNum);
        String song = "\nOn the " + day + " day of Christmas my true love gave to me, \n" + gifts;
        return twelfthReached ? song: song + daysOfChristmas(dayNum + 1);
        //return song;
    }
*/

    public static String createGifts(int dayNum)
    {
        String gifts = "a partridge in a pear tree.\n";
        if(dayNum > 1 && (dayNum + 1) != 2)
        {
            gifts = dayNum == 12 ? "twelve drummers drumming, ": dayNum == 11 ? "eleven pipers piping, ": dayNum == 10 ? "ten lords a-leaping, ": dayNum == 9 ? "nine ladies dancing, ": dayNum == 8 ? "eight maids a-milking, ": dayNum == 7 ? "seven swans a-swimming, ": dayNum == 6 ? "six geese a-laying, ": dayNum == 5 ? "five golden rings, ": dayNum == 4 ? "four calling birds, ": dayNum == 3 ? "three French hens, ": "two turtle-doves, and ";;
            gifts += createGifts(dayNum -1);
        }
        return gifts;
    }
}
package sample;

public class date
{
    private int year;
    private int month;
    private int day;

    private date(int year, int month , int day)
    {
        super();

        // Validate the Year
        if (year <2021 && year >2000)
        {
            this.year = year;
        }
        else
        {
            System.out.println("Please Enter a Valid Year between 2000 - 2021");
        }

        // Validate the Month
        if (month >= 1 && month <=12)
        {
            this.month = month;
        }
        else
        {
            System.out.println("Please Enter a Valid month between 01 - 12");
        }

        // Validate the Day
        if (day <= 31 && day >0)
        {
            this.day= day;
        }
        else
        {
            System.out.println("Please Enter a Valid Day between 01-31");
        }


    }
}

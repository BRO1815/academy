package by.academy.homework4.Task1;

public class SubtractionDate {
   private Date date1;
    private Date date2;

    public SubtractionDate(Date date1, Date date2) {
        this.date1 = date1;
        this.date2 = date2;
    }

    public int findNumberOfDay(Date date) {

        Short baseYear = 1;
        byte baseMonth = 1;
        byte baseDay = 1;

        Short year = date.Y.getYear();
        byte month = date.M.getMonth();
        byte day = date.D.getDay();

        int numberOfYear = (year - baseYear);
        int numberOfDay = (day - baseDay);

        byte[] dayInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = month; i-- > baseMonth; ) {
            numberOfDay += dayInMonth[i];
            if (i == 2) {
                if (date.leapYear(year)) {
                    numberOfDay++;
                }
            }
        }

        numberOfDay+=numberOfYear*365+numberOfYear/400+numberOfYear/4-numberOfYear/100;

        return numberOfDay;
    }

    public int substract(){
       return findNumberOfDay(date1)-findNumberOfDay(date2);
    }


}

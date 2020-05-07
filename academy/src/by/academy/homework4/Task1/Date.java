package by.academy.homework4.Task1;

class Date {

    protected Year Y;
    protected Month M;
    protected Day D;

    static class Year {

        private short yearY;

        public short getYear() {
            return yearY;
        }

        public void setYear(short year) {
            this.yearY = year;
        }

        public Year(short year) {
            this.yearY = year;
        }

    }

    static class Month {
        private byte monthM;

        public byte getMonth() {
            return monthM;
        }

        public void setMonth(byte month) {
            this.monthM = month;
        }

        public Month(byte month) {
            this.monthM = month;
        }
    }

    static class Day {
        private short yearD;
        private byte monthD;
        private byte dayD;
        private Weekday weekday;

        public Weekday getWeekday() {
            return weekday;
        }

        public byte getDay() {
            return dayD;
        }

        public void setDayD(byte dayD) {
            this.dayD = dayD;
        }

        public Day(byte day, byte month, short year) {
            this.dayD = day;
            this.monthD = month;
            this.yearD = year;
            this.weekday = findWeekday(dayD, monthD, yearD);
        }

        public Weekday findWeekday(byte day, byte month, short year) {
            byte dayW = day;
            byte monthW = month;
            short yearW = year;
            if (monthW < 3) {
                yearW--;
                monthW += 10;
            } else {
                monthW -= 2;
            }
            int numberWeekday = ((dayW + 31 * monthW / 12 + yearW + yearW / 4 - yearW / 100 + yearW / 400) % 7);
            if (numberWeekday == 1)
                return Weekday.MONDAY;
            if (numberWeekday == 2)
                return Weekday.TUESDAY;
            if (numberWeekday == 3)
                return Weekday.WEDNESDAY;
            if (numberWeekday == 4)
                return Weekday.THURSDAY;
            if (numberWeekday == 5)
                return Weekday.FRIDAY;
            if (numberWeekday == 6)
                return Weekday.SATURDAY;
            return Weekday.SUNDAY;
        }
    }

    public Date(String date) {
        DateValidator dv = new DateValidator();
        String[] splitDate = null;
        if (0 != dv.validate(date)) {
            if (1 == dv.validate(date)) {
                splitDate = date.split("/");
            }
            if (2 == dv.validate(date)) {
                splitDate = date.split("-");
            }
            if (3 == dv.validate(date)) {
                splitDate = date.split("\\.");
            }

            Y = new Year(Short.parseShort(splitDate[2]));
            M = new Month(Byte.parseByte(splitDate[1]));
            D = new Day(Byte.parseByte(splitDate[0]), Byte.parseByte(splitDate[1]), Short.parseShort(splitDate[2]));

        }
    }

    public boolean setDate(String date) {
        DateValidator dv = new DateValidator();
        String[] splitDate = null;
        if (0 == dv.validate(date)) {
            return false;
        }

        if (1 == dv.validate(date)) {
            splitDate = date.split("/");
        }
        if (2 == dv.validate(date)) {
            splitDate = date.split("-");
        }
        if (3 == dv.validate(date)) {
            splitDate = date.split("\\.");
        }

        Y = new Year(Short.parseShort(splitDate[2]));
        M = new Month(Byte.parseByte(splitDate[1]));
        D = new Day(Byte.parseByte(splitDate[0]), Byte.parseByte(splitDate[1]), Short.parseShort(splitDate[2]));

        return true;
    }

    public boolean leapYear(short year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

}

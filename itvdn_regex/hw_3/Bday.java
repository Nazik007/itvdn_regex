package itvdn_regex.hw_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bday {
    static void findPeriodFromBD(String start_date, String end_date) {

        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");

        try {
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);

            long difference_In_Time
                    = d2.getTime() - d1.getTime();

            long difference_In_Seconds
                    = (difference_In_Time
                    / 1000)
                    % 60;

            long difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;

            long difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;

            long difference_In_Years
                    = (difference_In_Time
                    / (1000l * 60 * 60 * 24 * 365));

            long difference_In_Days
                    = (difference_In_Time
                    / (1000 * 60 * 60 * 24))
                    % 365;

            System.out.print("З дати вашого народження  " + "пройшло: ");

            System.out.println(
                    difference_In_Years + " роки, " + difference_In_Days + " днів, " + difference_In_Hours + " годин, " + difference_In_Minutes + " хвилин, " + difference_In_Seconds + " секунд");
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
//        String start_date = "10-03-1991 21:10:20";
//        String end_date = "18-07-2022 22:45:50";

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вкажіть вашу дату народження в форматі дд-мм-рррр також час у ворматі гг-хх-сс: ");
        String start_date = buff.readLine();
        System.out.println("Вкажіть дату та час сьогодні у тому ж форматі: ");
        String end_date = buff.readLine();

        findPeriodFromBD(start_date, end_date);
    }
}

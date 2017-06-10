package kod.utils;

import kod.exceptions.util.ErrorMessage;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DataUtils {
    public static final String nullDate = "  /  /    ";
    public static final String infinite = "31/12/99";
    private static DateFormat fmt = DateFormat.getDateInstance(3, new Locale("pt", "BR"));


    private static DateFormat fmtShortTime = DateFormat.getDateTimeInstance(3, 3, new Locale("pt", "BR"));


    private static DateFormat fmtMediumTime = DateFormat.getDateTimeInstance(3, 2, new Locale("pt", "BR"));


    private static DateFormat fmtLong = DateFormat.getDateInstance(0, new Locale("pt", "BR"));


    private DataUtils() {
    }


    public static Date toStandardDate(String data) {
        try {
            return new Date(fmt.parse(data.trim()).getTime());
        } catch (ParseException ex) {
            ErrorMessage.advert("Formato invalido de data");
        }

        return null;
    }


    public static String dateBRShort(Date data) {
        return fmt.format(data);
    }


    public static String dateTimeBRShort(Date data) {
        return fmtShortTime.format(data);
    }


    public static String dateTimeBRMedium(Date data) {
        return fmtMediumTime.format(data);
    }


    public static String dateBRLong(Date data) {
        return fmtLong.format(data);
    }


    public static Date monthsBeginning() {
        Calendar c = Calendar.getInstance();
        c.set(5, 1);
        return c.getTime();
    }


    public static Date monthsEnding() {
        Calendar c = Calendar.getInstance();
        c.set(5, c.getActualMaximum(5));
        return c.getTime();
    }


    public static Date lastWeek() {
        Calendar c = Calendar.getInstance();
        c.add(5, -7);
        return c.getTime();
    }


    public static Date yesterday() {
        Calendar c = Calendar.getInstance();
        c.add(5, -1);
        return c.getTime();
    }


    public static Date tomorrow() {
        Calendar c = Calendar.getInstance();
        c.add(5, 1);
        return c.getTime();
    }


    public static long diferenca(Date menor, Date maior) {
        return (maior.getTime() - menor.getTime()) / 86400000L;
    }


    public static String actualMonthName() {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return meses[Calendar.getInstance().get(2)];
    }
}

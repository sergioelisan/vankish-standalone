package kod.utils;

import kod.exceptions.util.ErrorMessage;

import java.util.StringTokenizer;


public class StringUtils {
    public static final int ONLY_ALFA = 0;
    public static final int ONLY_ALFA_NUM = 1;
    public static final int ONLY_ALFA_ESPEC = 2;
    public static final int ONLY_NUM = 3;
    public static final int ONLY_NUM_ESPEC = 4;

    public StringUtils() {
    }

    public static String upperFirstLetter(String word) {
        StringTokenizer token = new StringTokenizer(word);
        StringBuilder builder = new StringBuilder();

        while (token.hasMoreTokens()) {
            String n = token.nextToken();
            String fiLetter = n.substring(0, 1);

            builder.append(n.length() >= 3 ? fiLetter : n.charAt(0) != 'd' ? fiLetter.toUpperCase() : fiLetter)
                    .append(n.substring(1, n.length()))
                    .append(" ");
        }

        return new String(builder);
    }


    public static boolean onlyContain(String item, int sequencia) {
        switch (sequencia) {
            case 0:
                return onlyAlfa(item);

            case 1:
                return onlyAlfaNum(item);

            case 2:
                return onlyAlfaEspec(item);

            case 3:
                return onlyNum(item);

            case 4:
                return onlyNumEspec(item);
        }
        ErrorMessage.advert("Falha na comparacao de Strings: opcao incorreta");


        return false;
    }


    private static boolean onlyNumEspec(String item) {
        for (char it : item.toCharArray())
            if (((it >= 'A') && (it <= 'Z')) || ((it >= 'a') && (it <= 'z') && (it != ' ')))
                return false;
        return true;
    }


    private static boolean onlyNum(String item) {
        for (char it : item.toCharArray())
            if (((it < '0') || (it > '9')) && (it != ' '))
                return false;
        return true;
    }


    private static boolean onlyAlfaEspec(String item) {
        for (char it : item.toCharArray())
            if ((it >= '0') && (it <= '9') && (it != ' '))
                return false;
        return true;
    }


    private static boolean onlyAlfaNum(String item) {
        for (char it : item.toCharArray())
            if (((it < '0') || (it > '9')) && ((it < 'A') || (it > 'Z')) &&
                    ((it < 'a') || (it > 'z')) && (it != ' ') && (it != '@'))
                return false;
        return true;
    }


    private static boolean onlyAlfa(String item) {
        for (char it : item.toCharArray())
            if (((it < 'A') || (it > 'Z')) && ((it < 'a') || (it > 'z')) && (it != ' '))
                return false;
        return true;
    }
}

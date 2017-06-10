package kod.support;

public class CriaSeriasAleatoriamente {
    public CriaSeriasAleatoriamente() {
    }

    public static void main(String[] args) {
        int max_seriais = 30;

        String alfa1 = "AA5CDE7GH8J";
        String alfa2 = "KK3M4O2QRST";

        String[] seriais = new String[30];

        for (int s = 0; s <= seriais.length; s++) {
            StringBuilder serial = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                serial.append(alfa1.charAt(rand()));
                serial.append(alfa2.charAt(rand()));
                if ((i == 1) || (i == 3) || (i == 5))
                    serial.append("-");
            }
            System.out.println(serial);
        }
    }


    public static int rand() {
        return (int) Math.round(Math.random() * 10.0D);
    }
}

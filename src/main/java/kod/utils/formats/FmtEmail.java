package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;


public class FmtEmail {
    private FmtEmail() {
    }

    public static String format(String email)
            throws CaractereInvalidoException {
        if ((!email.isEmpty()) && (email.contains("@")) && (email.length() <= 64)) {
            return email.toLowerCase();
        }
        throw new CaractereInvalidoException("Email invalido");
    }
}

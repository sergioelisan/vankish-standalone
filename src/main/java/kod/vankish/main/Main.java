package kod.vankish.main;

import kod.vankish.gui.Login;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Login.getInstance().setAppInstance(kod.vankish.gui.MainFrame.getInstance());
    }
}

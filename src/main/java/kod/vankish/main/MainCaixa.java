package kod.vankish.main;

import kod.vankish.gui.CaixaFrame;
import kod.vankish.gui.Login;


public class MainCaixa {
    public MainCaixa() {
    }

    public static void main(String[] args) {
        Login.getInstance().setAppInstance(CaixaFrame.getInstance());
    }
}

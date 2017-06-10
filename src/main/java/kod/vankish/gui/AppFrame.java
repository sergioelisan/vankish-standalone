package kod.vankish.gui;

import kod.vankish.pojo.Usuario;

public abstract interface AppFrame {
    public abstract Usuario getUser();

    public abstract void setUser(Usuario paramUsuario);

    public abstract void init();
}

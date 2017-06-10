package kod.vankish.logics;

import kod.database.Dao;
import kod.exceptions.InvalidOSException;
import kod.exceptions.LicencaFailException;
import kod.exceptions.util.ErrorMessage;
import kod.license.LicencaController;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.gui.Splash;
import kod.vankish.pojo.Caixa;
import kod.vankish.pojo.Caixalog;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Date;


public final class StartUp {
    private final String win = "Windows";
    private final String linux = "Linux";
    private LicencaController data = new LicencaController();

    public StartUp() {
        try {
            Splash.getInstance().upBar("Validando licenca");
            data.validation();
            Splash.getInstance().upBar("Identificando sistema");
            identifyOS();
            Splash.getInstance().upBar("Iniciando Banco de dados");
            iniciaDataBase();
        } catch (InvalidOSException e) {
            ErrorMessage.close("Sistema Operacional nao suportado");
        } catch (LicencaFailException e) {
            ErrorMessage.close("Erro na licenca de uso");
        }
    }


    private void iniciaDataBase() {
        new Dao();
    }


    public void IsThereCaixa() {
        Caixa x = CaixaLogics.actualCaixa();

        if (x == null) {
            String input = JOptionPane.showInputDialog(null, "Digite um valor inicial para o Caixa");
            Caixa primeiro = new Caixa(DataUtils.yesterday(), BigDecimal.ZERO, FmtMoney.toBigDecimal(input));
            String data = DataUtils.dateBRLong(new Date());

            CaixaLogics.save(primeiro);
            CaixaLogger.save(new Caixalog(CaixaLogics.actualCaixa(), "Primeiro Caixa! ---- " + data));
        }
    }


    public void identifyOS()
            throws InvalidOSException {
        String os = System.getProperty("os.name");

        if ((!os.contains("Linux")) && (!os.contains("Windows"))) {
            throw new InvalidOSException("Sistema Operacional nao suportado!");
        }
    }
}

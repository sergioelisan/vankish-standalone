package kod.vankish.logics;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.vankish.pojo.Pagamento;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.List;


public class Calendario
        extends JPanel {
    public Calendario() {
        setLayout(new FlowLayout(0));
        setPreferredSize(new Dimension(200, 170));
        setBackground(Color.white);
        criaCalendario();
        setVisible(true);
    }


    private void criaCalendario() {
        JLabel[] weekDayName = new JLabel[7];
        JLabel[] day = new JLabel[31];


        Calendar d = Calendar.getInstance();
        int today = d.get(5);
        int month = d.get(2);

        d.set(5, 1);
        int weekday = d.get(7);
        int firstDayOfWeek = d.getFirstDayOfWeek();


        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            d.add(5, -1);
            weekday = d.get(7);
        }


        int w = 0;
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            weekDayName[w] = new JLabel(" " + weekdayNames[weekday]);
            weekDayName[w].setForeground(Color.RED);
            d.add(5, 1);
            weekday = d.get(7);
            add(weekDayName[w]);
            w++;
        } while (weekday != firstDayOfWeek);


        for (int i = 0; i < indent; i++) {
            JLabel space = new JLabel("  ");
            space.setPreferredSize(new Dimension(21, 15));
            add(space);
        }


        int lastMonthDay = 0;
        d.set(5, 1);
        do {
            if (lastMonthDay < 10) {
                day[lastMonthDay] = new JLabel("  " + String.valueOf(d.get(5)));
            } else {
                day[lastMonthDay] = new JLabel(String.valueOf(d.get(5)));
            }
            day[lastMonthDay].setHorizontalAlignment(4);
            day[lastMonthDay].setPreferredSize(new Dimension(21, 15));

            if (d.get(5) == today) {
                day[lastMonthDay].setForeground(Color.red);
            }
            add(day[lastMonthDay]);


            d.add(5, 1);
            weekday = d.get(7);
            lastMonthDay++;
        }
        while (d.get(2) == month);


        for (Pagamento p : procuraNoBanco()) {
            int dia = p.getVencimento().getDate() - 1;

            day[dia].setForeground(Color.blue);
            day[dia].setToolTipText(p.getDescricao());
        }
    }


    private List<Pagamento> procuraNoBanco() {
        return
                new Pesquisa(Pagamento.class).between("vencimento", DataUtils.monthsBeginning(), DataUtils.monthsEnding());
    }


    public void atualiza() {
        removeAll();
        criaCalendario();
    }
}

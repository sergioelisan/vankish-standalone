package kod.utils;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileUtils {
    private String dir;

    public FileUtils(String dir) {
        this.dir = dir;
    }


    public PrintWriter getWriter(File arquivo)
            throws Exception {
        return new PrintWriter(new FileWriter(arquivo));
    }


    public BufferedReader getReader(File arquivo)
            throws FileNotFoundException {
        return new BufferedReader(new FileReader(arquivo));
    }


    public File getFile(String arquivo) {
        return new File(dir + arquivo);
    }


    public Matcher getMatcher(String obj, String compara) {
        return Pattern.compile(obj).matcher(compara);
    }


    public String getContent(String nomeArquivo)
            throws Exception {
        File arquivo = getFile(nomeArquivo);
        StringBuilder builder = new StringBuilder();


        BufferedReader reader = getReader(arquivo);


        while (reader.readLine() != null) {
            builder.append(reader.readLine());
        }
        reader.close();

        return new String(builder);
    }


    public void setContent(String conteudo, String arquivo)
            throws Exception {
        PrintWriter saida = getWriter(getFile(arquivo));
        saida.write(conteudo);

        saida.close();
    }
}

// Nome: Tiago Eloy Possidonio Pereira - RA: 2417677

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura {
    public String EntDados(String txt) {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.print(txt);
        try {
            str = ler.readLine();
        } catch (Exception e) {
            System.out.println("\nEntrada de dados invalida!");
        }
        return str;
    }
}

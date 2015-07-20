
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.ExecCmd;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica93 {
    public static void main(String[] args) {
        System.out.println("Digite os comandos");
        Scanner scanner = new Scanner(System.in);
        String nome1=null;
        List<ExecCmd> comandos= new ArrayList<>();
        while(nome1!="fim"){
        if (scanner.hasNext()) {
            nome1 = scanner.next();
        
        ExecCmd ex= new ExecCmd(nome1);
        comandos.add(ex);
        ex.start();
        }
    }
}

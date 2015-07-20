/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliente
 */
public class ExecCmd extends Thread {

    String cmd;
    String os = System.getProperty("os.name");
    Process proc = null;
public boolean terminado(){
    return !(proc.isAlive());
}
    public void cancela() {
        proc.destroy();
    }
 public ExecCmd(String cmd){
     this.cmd=cmd;
     
 }

    @Override
    public void run() {

     

        Runtime rt = Runtime.getRuntime();
        System.out.println("Executando " + cmd);

        try {
            proc = rt.exec(cmd);

        } catch (IOException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        }

        int status = 0;
        try {
            status = proc.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecCmd.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoCompiler.Runtime;

import MemoCompiler.InOut;

/**
 *
 * @author orisha
 */
public class PintarRobot {

    public PintarRobot() {
    }
    
    public void PintarRobot(int orientacion, String name, int posicion){
        switch(orientacion){
            case 1:
                InOut.Write("  *  ", null);
                InOut.Write("* * *", null);
                for (int i = 0; i < name.length(); i++) {
                    InOut.Write("* "+name.charAt(i)+" *", null);
                }
                InOut.Write("* * *", null);
                for (int i = 0; i < posicion; i++) {
                    InOut.Write(".", null);
                }
                break;
            case 2:
                String vaux="";
                for (int i = 0; i < posicion; i++) {
                    vaux+=".";
                }
                String varl="   ";
                for (int i = 0; i < name.length()+4; i++) {
                    varl+="*";
                }
                InOut.Write(varl+vaux, null);
                InOut.Write("*   "+name+"   "+vaux, null);
                InOut.Write(varl+vaux, null);
                break;
            case 3:
                for (int i = 0; i < posicion; i++) {
                    InOut.Write(".", null);
                }
                InOut.Write("* * *", null);
                for (int i = 0; i < name.length(); i++) {
                    InOut.Write("* "+name.charAt(i)+" *", null);
                }
                InOut.Write("* * *", null);
                InOut.Write("  *  ", null);
                break;
            case 4:
                String aux="";
                for (int i = 0; i < posicion; i++) {
                    aux+=".";
                }
                String var="";
                for (int i = 0; i < name.length()+4; i++) {
                    var+="*";
                }
                InOut.Write(aux+var, null);
                InOut.Write(aux+" "+name+"     *", null);
                InOut.Write(aux+var, null);
                break;
            default:
                break;
        }
    }    
}

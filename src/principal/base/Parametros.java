/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.base;


public class Parametros {
    private static String sNmUsuas;
    private static String sSenhaUsuas;
    private static String sFuncao;
    
    public static String getsNmUsuas()
    {
        return sNmUsuas;
    }
    public static void setsNmUsuas(String aNmUsuas)
    {
       Parametros.sNmUsuas=aNmUsuas;
      
    }
    
    public static String getsSenhaUsuas()
    {
        return sSenhaUsuas;
    }
    public static void setsSenhaUsuas(String aSenhaUsuas)
    {
       Parametros.sSenhaUsuas=aSenhaUsuas;
      
    } public static String getsFuncao()
    {
        return sFuncao;
    }
    public static void setsFuncao(String aServidor)
    {
       Parametros.sFuncao=aServidor;
    }
    public static String getsServidor()
    {
        return sFuncao;
    }
    public static void setsServidor(String aServidor)
    {
       Parametros.sFuncao=aServidor;
    }
}

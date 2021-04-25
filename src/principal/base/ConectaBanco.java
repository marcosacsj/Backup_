
package principal.base;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;




public class ConectaBanco {
   // Parametros oParam = new Parametros();
    //File arquivo = new File("System.ini");
    //private String sServidor=Arquivo.LeIni(arquivo,"BancoDeDados","Servidor");
    File arquivo = new File("ConfigBanco.xml");
//    private String driver = "org.postgresql.Driver";
    //    private String url = "jdbc:postgresql://bpd-srv:5432/bpd_controle";
//    public String usuario ="postgres";
//    public String senha = "EasdPG";
    
    
    String Banco      = new String();
    String servidor   = new String();
    String Driver     = new String();
    String Url        = new String();
    String Usuario    = new String();
    String senhaBanco = new String();
    
            
    Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(String NomeBanco){
        boolean result = true;
        CarregaBanco(NomeBanco);
        try
        {
            Class.forName(Driver);
            conexao = DriverManager.getConnection(Url, Usuario, senhaBanco);
        } 
        catch (ClassNotFoundException ex) 
        {
            //JOptionPane.showMessageDialog(null, "Drive não localizado");
            InOut.MsgDeErro(null, "Drive não localizado");
            result=false;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Erro na conexão" );
          // InOut.MsgDeErro("AppAdm", "Erro na Conexão");
            System.out.println(e.getMessage());
            result=false;
        }
        return result;
    }
   public void executaSelect (String query)  {
        try {
            statement = conexao.createStatement();
            resultset = statement.executeQuery(query); 
        } catch (SQLException ex) {
           InOut.MsgDeErro("Erro de Consulta", ex.getMessage());
        }
              
       
    }
    public void desconecta(){
        try {   
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void executa(String query) throws SQLException{
        
           statement = conexao.createStatement();
           statement.executeUpdate(query);
           
        
       
        }

    private void CarregaBanco(String NomeBanco)  {
        Banco      = new String();
        servidor   = new String();
        Driver     = new String();
        Url        = new String();
        Usuario    = new String();
        senhaBanco = new String();
       try {
             BufferedReader in = new BufferedReader(new FileReader(arquivo));
             String linha;
             while( (linha = in.readLine()) != null ){
                  String[] dados = linha.split(Pattern.quote("&"));
                  if(dados[0].equals(NomeBanco)){
                        Banco     =dados[0];
                        servidor  =dados[1];
                        Driver    =dados[2];
                        Url       =dados[3];
                        Usuario   =dados[4];
                        senhaBanco=dados[5];                                              
                  }
             }
        } catch (FileNotFoundException ex) {
            InOut.MsgDeErro(NomeBanco, ex.getMessage());
        } catch (IOException ex) {
            InOut.MsgDeErro(NomeBanco, ex.getMessage());
        }    
    }
}


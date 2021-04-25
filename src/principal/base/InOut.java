package principal.base;
import javax.swing.JOptionPane;



public class InOut 
{

	public static String leString (String frase)
	{
		String Entrada;
		
		Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
											   JOptionPane.QUESTION_MESSAGE);
		return Entrada;
	}
	

	public static byte leByte (String frase)
	{
		byte num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   							   JOptionPane.QUESTION_MESSAGE
						                               
						                               
						   								);
				num = Byte.parseByte(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
											  "BYTE", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	

	public static short leShort (String frase)
	{
		short num=0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Short.parseShort(Entrada);
				ERRO = false;
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
											  "SHORT", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}
	

	public static int leInt (String frase)
	{
		int num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Integer.parseInt(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
											  "INTEIRO ", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}
	

	public static long leLong (String frase)
	{
		long num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Long.parseLong(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
											  "LONG ", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);		
		return num;
	}


	public static float leFloat (String frase)
	{
		float num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   JOptionPane.QUESTION_MESSAGE);
				num = Float.parseFloat(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
 											  "FLOAT", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}


	public static double leDouble (String frase)
	{
		double num = 0;
		String Entrada;
		boolean ERRO;
		
		do{
			try{
				Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
						   								JOptionPane.QUESTION_MESSAGE);
				num = Double.parseDouble(Entrada);
				ERRO = false;
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
											  "DOUBLE", "   >>>      ERRO     <<<", 
											  JOptionPane.ERROR_MESSAGE);
				ERRO = true;
			}
		}while (ERRO);	
		return num;
	}


	public static char leChar (String frase)
	{
		String Entrada;
		
		Entrada = JOptionPane.showInputDialog (null, frase, "Entrada de dados", 
				   								JOptionPane.QUESTION_MESSAGE);
		return Entrada.charAt(0);
	}	

	public static void MsgDeErro(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.ERROR_MESSAGE);
	}
	public static void MsgDeInformacao(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.INFORMATION_MESSAGE);
	}
	public static void MsgSemIcone(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.PLAIN_MESSAGE);
	}
	public static void MsgDeAviso(String cabecalho, String frase)
	{
		JOptionPane.showMessageDialog(null, frase, cabecalho,  JOptionPane.WARNING_MESSAGE);
	}
	public static int MsgDeSimNao (String cabecalho, String frase)
	{
		String str[] = {"Sim","N�o"};
		int li_opcao = JOptionPane.showOptionDialog(null, frase, "",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,  null, str, str[0]);
		return li_opcao;
		
		/*if (JOptionPane.showConfirmDialog(null, frase , AppPdv.getLs_versao(), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE( null, "Sim", "N�o")) == JOptionPane.NO_OPTION)
		{
			return -1;			
		}
		else
		{
			return 1;			
		}*/		
	}
	
}

package búsqueda_secuencial;
import javax.swing.*;
public class BúsquedaSecuencial
{
	public static void main(String[] args)
	{
		int array[] = new int[10];
		for(int i = 0; i < array.length;i++)
		{
			array[i] = (int)(Math.random()*100);
			JOptionPane.showMessageDialog(null,"Número: "+array[i]);
		}
		int número = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número deseas buscar?:\n"));
		for(int i = 0; i < array.length;i++)
		{
			if(número == array[i])
			{
				JOptionPane.showMessageDialog(null,"El número "+número+", fue encontrado en la posición: "+i);
			}
		}
	}

}

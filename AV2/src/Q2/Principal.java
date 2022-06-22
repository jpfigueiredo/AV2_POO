package Q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		
		 ArrayList<ProvaEnem> prova = new ArrayList <> ();
			
			int id_prova= Integer.parseInt(JOptionPane.showInputDialog("Digite a ID da prova"));
			String  titulo= JOptionPane.showInputDialog("Digite o Titulo da prova");
			int nota= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da prova"));
			ProvaEnem p1 = new ProvaEnem (id_prova, titulo, nota);
			prova.add(p1);
			
			
			int i = 0;
		    for (ProvaEnem notas: prova) {
		      System.out.printf("Posição %d- %s %s %d\n", i, notas.getId_prova(), notas.getTitulo(), notas.getNota() );
		      i++;
		    }

		
		
		
		
		
		
		
		
	}

}

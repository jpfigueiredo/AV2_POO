package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Q2.ProvaEnem;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		 ArrayList<Publicacao> publicacoes = new ArrayList <> ();
			
		    String  dataPublicacao= JOptionPane.showInputDialog("Digite a data da Publica��o:");
			String  textoPublicacao= JOptionPane.showInputDialog("Digite o Texto da Publica��o:");
			String  linkMidia= JOptionPane.showInputDialog("Insira o link:");
			Publicacao public1 = new Publicacao (dataPublicacao, textoPublicacao, linkMidia);
			publicacoes.add(public1);
			
			
			int i = 0;
		    for (Publicacao publics: publicacoes) {
		      System.out.printf("Posi��o %d- %s %s %d\n", i, publics.getDataPublicacao(), publics.getTextoPublicacao(), publics.getLinkMidia() );
		      i++;
		    }
		
		
		
	}

}

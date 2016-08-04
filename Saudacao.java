import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao {

	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);

		// Aqui criamos um objeto que irá receber o nome do aluno
		//System.out.print("Digite o nome do aluno: ");
		//String nome = entrada.nextLine();

		String nome = JOptionPane.showInputDialog("Digite o nome do fulano");

		System.out.println("Bem-vindo ao curso "
			+ nome);
	}
}
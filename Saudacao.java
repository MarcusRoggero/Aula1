import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao {

	public static void main (String args[]) {
		
		//Scanner entrada = new Scanner(System.in);

		// Aqui criamos um objeto que irá receber o nome do aluno
		//System.out.print("Digite o nome do aluno: ");
		//String nome = entrada.nextLine();
		//String nome = JOptionPane.showInputDialog("Digite o nome do fulano");

		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Base"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		String tipoForma = JOptionPane.showInputDialog("Forma");
		
		System.out.println(tipoForma);

		if (tipoForma.equals("Triangulo")) {

		System.out.println(areaTriangulo(base, altura));

		} else if (tipoForma.equals("Retangulo")) {

			System.out.println(areaRetangulo(base, altura));

		} else {

			System.out.println("Voce é burro fdp?");

		}

	}

	public static double areaTriangulo(double a, double b) {

			double area = (a * b)/2;
			return area;

	}

	public static double areaRetangulo(double a, double b) {

			double area = (a * b);
			return area;

	}

}


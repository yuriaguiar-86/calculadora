package calculadora;

import java.util.Scanner;

public class Controle {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Controle aux = new Controle();
		Soma soma = aux.new Soma();
		Subtracao sub = aux.new Subtracao();
		Multiplicacao mult = aux.new Multiplicacao();
		Divisao div = aux.new Divisao();
		
		Integer auxiliar;
		Short operacao;
		
		do {
            System.out.println("Digite a operacao desejada");
            System.out.println("[1]Soma");      
            System.out.println("[2]Subtracao");      
            System.out.println("[3]Multiplicacao");      
            System.out.println("[4]Divisao");      
            System.out.println("[0]Sair");
            System.out.print("Operação: ");
            operacao = teclado.nextShort();
            
            if (operacao == 0) {
           	 System.out.println("OBRIGADO!");
           	 break;
            }
            
            switch(operacao) {
            case 1:
            	System.out.print("\n01 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor1(auxiliar);
            	
            	System.out.print("02 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor2(auxiliar);
            	
            	System.out.printf("%d + %d = %d\n\n", soma.getValor1(), soma.getValor2(), soma.getSoma());
                break;
            case 2:
            	System.out.print("\n01 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor1(auxiliar);
            	
            	System.out.print("02 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor2(auxiliar);
            	
            	System.out.printf("%d + %d = %d\n\n", soma.getValor1(), soma.getValor2(), sub.getSubtracao());
            	break;
            case 3:
            	System.out.print("\n01 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor1(auxiliar);
            	
            	System.out.print("02 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor2(auxiliar);
            	
            	System.out.printf("%d + %d = %d\n\n", soma.getValor1(), soma.getValor2(), mult.getMultiplicacao());
            	break;
            case 4:
            	System.out.print("\n01 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor1(auxiliar);
            	
            	System.out.print("02 Valor: ");
            	auxiliar = teclado.nextInt();
            	soma.setValor2(auxiliar);
            	
            	System.out.printf("%d + %d = %d\n\n", soma.getValor1(), soma.getValor2(), div.getDivisao());
            	break;
            }
            
       }while (operacao != 0);
	}
	
	class Soma {
		public int valor1, valor2, soma;

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		public int getValor2() {
			return valor2;
		}

		public void setValor2(int valor2) {
			this.valor2 = valor2;
		}

		public int getSoma() {
			return soma = soma = valor1 + valor2;
		}

		public void setSoma(int soma) {
			this.soma = soma = valor1 + valor2;
		}
	}
	
	class Subtracao{
		public int valor1, valor2, subtracao;

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		public int getValor2() {
			return valor2;
		}

		public void setValor2(int valor2) {
			this.valor2 = valor2;
		}

		public int getSubtracao() {
			return subtracao = subtracao = valor1 - valor2;
		}

		public void setSubtracao(int subtracao) {
			this.subtracao = subtracao = valor1 - valor2;
		}
	}
	
	class Multiplicacao{
		public int valor1, valor2, multiplicacao;

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		public int getValor2() {
			return valor2;
		}

		public void setValor2(int valor2) {
			this.valor2 = valor2;
		}

		public int getMultiplicacao() {
			return multiplicacao = multiplicacao = valor1 * valor2;
		}

		public void setMultiplicacao(int multiplicacao) {
			this.multiplicacao = multiplicacao = valor1 * valor2;
		}
	}
	
	class Divisao{
		public int valor1, valor2, divisao;

		public int getValor1() {
			return valor1;
		}

		public void setValor1(int valor1) {
			this.valor1 = valor1;
		}

		public int getValor2() {
			return valor2;
		}

		public void setValor2(int valor2) {
			this.valor2 = valor2;
		}

		public int getDivisao() {
			return divisao = divisao = valor1 + valor2;
		}

		public void setDivisao(int divisao) {
			this.divisao = divisao = valor1 + valor2;
		}
	}
}


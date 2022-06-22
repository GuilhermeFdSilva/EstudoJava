package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //Atribui��o por valor (Tipo primitivo)
		a++;
		b--;
		System.out.println(a+ " " + b);
		Data d1 = new Data(18, 5, 2000);
		Data d2 = d1;//Atribui��o por refer�ncia (Objeto)
		d1.dia = 31;
		d2.mes = 12;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}

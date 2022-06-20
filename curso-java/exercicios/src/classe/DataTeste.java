package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 23;
		d1.mes = 3;
		d1.ano = 2003;
		
		Data d2 = new Data();
		d2.dia = 18;
		d2.mes = 5;
		d2.ano = 2000;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
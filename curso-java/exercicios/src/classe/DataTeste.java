package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(18, 5, 2000);
		
		Data d2 = new Data(23, 3, 2003);
		
		Data d3 = new Data();

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}
}
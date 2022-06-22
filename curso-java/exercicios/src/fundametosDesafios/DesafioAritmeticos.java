package fundametosDesafios;

public class DesafioAritmeticos {

	public static void main(String[] args) {
			
		int dv1 = 3 * 2;
		int dv2 = 2;
		int dv3 = (int) Math.pow(10, 3);

		int op1_1 = 3 + 2;
		int op2_1 = 6 * op1_1;
		int op3_1 = (int) Math.pow(op2_1, 2);
		int r1 = op3_1 / dv1;
		
		int op1_2 = 1 - 5;
		int op2_2 = 2 - 7;
		int op3_2 = op1_2 * op2_2;
		int op4_2 = op3_2 / dv2;
		int r2 = (int) Math.pow(op4_2, 2);
		
		int op1_3 = r1 - r2;
		int op2_3 = (int) Math.pow(op1_3, 3);
		int rf = op2_3 / dv3;
		
		System.out.println(rf);
		
		
		
	}
}

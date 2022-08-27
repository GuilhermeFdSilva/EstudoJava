package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner ent = new Scanner(System.in);
		System.out.print("Informe o codigo: ");
		int codigo = ent.nextInt();
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		}else {
			System.out.println("Pessoa não encontrada");
		}
		conexao.close();
		ent.close();
	}
}

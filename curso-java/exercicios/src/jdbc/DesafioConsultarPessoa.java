package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarPessoa {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner ent = new Scanner(System.in);
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		System.out.print("Consultar pessoas: ");
		String texto = ent.next();
		stmt.setString(1,"%" + texto + "%");
		ResultSet resultado = stmt.executeQuery();
		List<Pessoa> pessoas = new ArrayList<>();
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " -> " + p.getNome());
		}
		ent.close();
		stmt.close();
		conexao.close();
	}
}

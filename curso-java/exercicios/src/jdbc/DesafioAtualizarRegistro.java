package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner ent = new Scanner(System.in);
		String sql1 = "SELECT * FROM pessoas";
		String sql2 = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		Statement stmt1 = conexao.createStatement();
		ResultSet resultado = stmt1.executeQuery(sql1);
		List<Pessoa> pessoas = new ArrayList<>();
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " -> " + p.getNome());
		}
		System.out.print("Insira o código da pessoa que desexa alterar: ");
			int cod = ent.nextInt();
			ent.nextLine();
		System.out.print("Insira o nome atualizado: ");
			String nomeAtt = ent.nextLine();
		PreparedStatement stmt2 = conexao.prepareStatement(sql2);
			stmt2.setString(1, nomeAtt);
			stmt2.setInt(2, cod);
			stmt2.execute();
		System.out.println("Nome atualizado com sucesso!");
		stmt1.close();
		stmt2.close();
		conexao.close();
		ent.close();
	}
}
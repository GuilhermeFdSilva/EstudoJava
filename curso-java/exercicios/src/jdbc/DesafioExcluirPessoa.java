package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner ent = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String pesquisaSQL = "SELECT * FROM pessoas WHERE nome LIKE ?";
		String ExcluirSQL = "DELETE FROM pessoas WHERE codigo = ?";
		ex: do {
			System.out.print("Qual nome deseja excluir: ");
			String pesquisa = ent.next();
			PreparedStatement stmtP = conexao.prepareStatement(pesquisaSQL);
			stmtP.setString(1, pesquisa + "%");
			ResultSet resultado = stmtP.executeQuery();
			if (resultado.next()) {
				List<Pessoa> pessoas = new ArrayList<>();
				while (resultado.next()) {
					int codigo = resultado.getInt("codigo");
					String nome = resultado.getString("nome");
					pessoas.add(new Pessoa(codigo, nome));
				}
				for (Pessoa p : pessoas) {
					System.out.println(p.getCodigo() + " -> " + p.getNome());
				}
				System.out.print("Digite o coódigo da pessoa que deseja excluir: ");
				int codigo = ent.nextInt();
				for (Pessoa p : pessoas) {
						if (codigo == p.getCodigo()) {
							System.out.println("Confirmar exclusão de: " + p.getCodigo() + " -> " + p.getNome());
							System.out.println("S/n");
							String confirma = ent.next();
							confirma.toLowerCase();
							if ("s".equals(confirma)) {
								PreparedStatement stmtE = conexao.prepareStatement(ExcluirSQL);
								stmtE.setInt(1, codigo);
								stmtE.execute();
								System.out.println("Pessoa excluida com sucesso!");
								break ex;
							} else {
								System.out.println("Nada feito!");
								break ex;
							}
						} else {
							System.out.println("Pessoa não encontrada!");
							break ex;
						}
				}
			} else {
				System.out.println("Pessoa não encontrada!");
				continue;
			}
		} while (true);
		conexao.close();
		ent.close();
	}
}

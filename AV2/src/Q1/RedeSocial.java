package Q1;

import java.util.ArrayList;

public class RedeSocial {
	
	String dataCriacao, nomeUsuario, dataNascimento, senha;

	public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
		super();
		this.dataCriacao = dataCriacao;
		this.nomeUsuario = nomeUsuario;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	ArrayList<Publicacao> publicacoes = new ArrayList<> (); 
	
	

}

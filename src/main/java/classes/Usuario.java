package classes;

import java.util.Objects;

public class Usuario {
	
	private String nome;
	private String sobreNome;
	private String email;
	private String usuario;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome, senha, sobreNome, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha) && Objects.equals(sobreNome, other.sobreNome)
				&& Objects.equals(usuario, other.usuario);
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sobreNome=" + sobreNome + ", email=" + email + ", usuario=" + usuario
				+ ", senha=" + senha + "]";
	}
	
	
	
}

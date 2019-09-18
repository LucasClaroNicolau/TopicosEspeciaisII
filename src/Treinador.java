public class Treinador {
	
	private String nome;
	private String cidade;
	private Integer nivel;
	private Boolean mestreGinasio;
	private Integer qntInsignia;
			
	public Treinador(String nome, String cidade, Integer nivel, Boolean mestreGinasio, Integer qntInsignia) {
		this.nome = nome;
		this.cidade = cidade;
		this.nivel = nivel;
		this.mestreGinasio = mestreGinasio;
		this.qntInsignia = qntInsignia;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public Integer getNivel() {
		return nivel;
	}
	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	public Boolean getMestreGinasio() {
		return mestreGinasio;
	}
	
	public void setMestreGinasio(Boolean mestreGinasio) {
		this.mestreGinasio = mestreGinasio;
	}
	
	public Integer getQntInsignia() {
		return qntInsignia;
	}
	
	public void setQntInsignia(Integer qntInsignia) {
		this.qntInsignia = qntInsignia;
	}
	
}
import java.util.ArrayList;
import java.util.List;

public class Pokemon {

	private String nome;
	private String cp;
	private Integer ataque;
	private Integer defesa;
	private Integer vida;
	private Boolean temEvolucao;
	
	public Pokemon(String nome, String cp, Integer ataque, Integer defesa, Integer vida, Boolean temEvolucao) {
		this.nome = nome;
		this.cp = cp;
		this.ataque = ataque;
		this.defesa = defesa;
		this.vida = vida;
		this.temEvolucao = temEvolucao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCp() {
		return cp;
	}
	
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	public Integer getAtaque() {
		return ataque;
	}
	
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	
	public Integer getDefesa() {
		return defesa;
	}
	
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	
	public Integer getVida() {
		return vida;
	}
	
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	
	public Boolean getTemEvolucao() {
		return temEvolucao;
	}
	
	public void setTemEvolucao(Boolean temEvolucao) {
		this.temEvolucao = temEvolucao;
	}
	
}

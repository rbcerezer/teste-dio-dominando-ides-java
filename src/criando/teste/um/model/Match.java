package criando.teste.um.model;

import java.util.Objects;

public class Match {

	private String nome;
	private String olhos;
	private Integer altura;
	private Integer idade;

	public Match(String nome, String olhos, Integer altura, Integer idade) {
		super();
		this.nome = nome;
		this.olhos = olhos;
		this.altura = altura;
		this.idade = idade;
	}

	public Match() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, idade, nome, olhos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		return Objects.equals(altura, other.altura) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && Objects.equals(olhos, other.olhos);
	}

	@Override
	public String toString() {
		return "Match [nome=" + nome + ", olhos=" + olhos + ", altura=" + altura + ", idade=" + idade + "]";
	}

	/*
	 * public Match (String nome, String olhos, Integer altura, Integer idade) {
	 * this.nome = nome; this.olhos = olhos; this.altura = altura; this.idade =
	 * idade; }
	 */

}

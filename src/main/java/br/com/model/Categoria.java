package br.com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Categoria() {}
	
	public Categoria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Categoria{")
				.append("id=").append(id)
				.append(", nome=").append(nome)
				.append('}');
		return sb.toString();
	}
}

package infinitystore.com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
	private String nome;
	private String sobrenome;
	private String nomeDeUsuario;
	private String senha;
	private List<String> interesses = new ArrayList<String>();
	private List<String> favoritos = new ArrayList<String>();
        private List<String> carrinho = new ArrayList<String>();
	
	public Usuario(String nome, String sobrenome, String nomeDeUsuario, String senha) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nomeDeUsuario = nomeDeUsuario;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void addInteresse(String categoria) {
                interesses.add(categoria);
	}
        
        public List<String> getInteresse(){
            return this.interesses;
        }
	
	public void addFavorito(String produto) {
		favoritos.add(produto);
	}
        
        public List<String> getFavoritos(){
            return this.favoritos;
        }
        
        public void removeFavorito(int indice){
            favoritos.remove(indice);
        }
        
        public void addCarrinho(String produto){
            carrinho.add(produto);
        }
        
        public List<String> getCarrinho(){
            return this.carrinho;
        }
        
        public void removeProduto(int indice){
            carrinho.remove(indice);
        }
}

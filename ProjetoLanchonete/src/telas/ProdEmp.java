package telas;

public class ProdEmp {
	
	private String nome, cod;
	private int qtd, diaProd, mesProd, anoProd, dia, mes, ano;
	private double preco;
	
	public ProdEmp(int pqtd, String pnome, int pdiaProd, int pmesProd, int panoProd, double ppreco, String pcod, int pdia, int pmes, int pano){
		qtd = pqtd;
		nome = pnome;
		diaProd = pdiaProd;
		mesProd = pmesProd;
		anoProd = panoProd;
		preco = ppreco;
		cod = pcod;
		dia = pdia;
		mes = pmes;
		ano = pano;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getDiaProd() {
		return diaProd;
	}

	public void setDiaProd(int diaProd) {
		this.diaProd = diaProd;
	}

	public int getMesProd() {
		return mesProd;
	}

	public void setMesProd(int mesProd) {
		this.mesProd = mesProd;
	}

	public int getAnoProd() {
		return anoProd;
	}

	public void setAnoProd(int anoProd) {
		this.anoProd = anoProd;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}

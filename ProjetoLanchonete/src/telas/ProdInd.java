package telas;

public class ProdInd {
	
	private String nome, marca, cod;
	private int qtd, diaEnt, mesEnt, anoEnt, dia, mes, ano;
	private float preco;
	
	public ProdInd(int pdiaEnt, int pmesEnt, int panoEnt, int pqtd, String pnome, String pmarca, int pdia, int pmes, int pano, String pcod, float ppreco){
		diaEnt = pdiaEnt;
		mesEnt = pmesEnt;
		anoEnt = panoEnt;
		qtd = pqtd;
		nome = pnome;
		marca = pmarca;
		dia = pdia;
		mes = pmes;
		ano = pano;
		cod = pcod;
		preco = ppreco;
	}
	
	public int getDiaEnt(){
		return diaEnt;
	}
	
	public void setDiaEnt(int pdiaEnt){
		this.diaEnt = pdiaEnt;
	}
	
	public int getMesEnt(){
		return mesEnt;
	}
	
	public void setMesEnt(int pmesEnt){
		this.mesEnt = pmesEnt;
	}
	
	public int getAnoEnt(){
		return anoEnt;
	}
	
	public void setAnoEnt(int panoEnt){
		this.anoEnt = panoEnt;
	}
	
	public int getQtd(){
		return qtd;
	}
	
	public void setQtd(int pqtd){
		this.qtd = pqtd;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String pnome){
		this.nome = pnome;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setMarca(String pmarca){
		this.marca = pmarca;
	}
	
	public int getDia(){
		return dia;
	}
	
	public void setDia(int pdia){
		this.dia = pdia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public void setMes(int pmes){
		this.mes = pmes;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setAno(int pano){
		this.ano = pano;
	}
	
	public String getCod(){
		return cod;
	}
	
	public void setCod(String pcod){
		this.cod = pcod;
	}
	
	public float getPreco(){
		return preco;
	}
	
	public void setPreco(float ppreco){
		this.preco = ppreco;
	}
}

package telas;

public class Empresa2 {
	private String nome, nomeFant, cnpj, dono, city, end, cep, bairro, tel, site, uf;
	private int num;
	
	public Empresa2(String pnome, String pnomeFant, String pcnpj, String puf, String pdono, String pcity, String pend, int pnum, String pcep, String pbairro, String ptel, String psite ){
		nome = pnome;
		nomeFant = pnomeFant;
		cnpj = pcnpj;
		uf = puf;
		dono = pdono;
		city = pcity;
		end = pend;
		num = pnum;
		cep = pcep;
		bairro = pbairro;
		tel = ptel;
		site = psite;
		
	}
	
	public String getNome(){
		return nome;
	}
	
	public String setNome(String pnome){
		this.nome = pnome;
		return pnome;
	}
	
	public String getNomeFant(){
		return nomeFant;
	}
	
	public void setNomeFant(String pnomeFant){
		this.nomeFant = pnomeFant;
	}
	
	public String getCnpj(){
		return cnpj;
	}
	
	public void setCnpj(String pcnpj){
		this.cnpj = pcnpj;
	}
	
	public String getUf(){
		return uf;
	}
	
	public void setUf(String puf){
		this.uf = puf;
	}
	
	public String getDono(){
		return dono;
	}
	
	public void setDono(String pdono){
		dono = pdono;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String pcity){
		city = pcity;
	}
	
	public String getEnd(){
		return end;
	}
	
	public void setEnd(String pend){
		end= pend;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int pnum){
		num = pnum;
	}
	
	public String getCep(){
		return cep;
	}
	
	public void setCep(String pcep){
		cep = pcep;
	}
	
	public String getBairro(){
		return bairro;
	}
	
	public void setBairro(String pbairro){
		bairro = pbairro;
	}
	
	public String getTel(){
		return tel;
	}
	
	public void setTel(String ptel){
		tel = ptel;
	}
	
	public String getSite(){
		return site;
	}
	
	public void setSite(String psite){
		site = psite;
	}
	
	
	
	
	
	
	
	
	
	
}

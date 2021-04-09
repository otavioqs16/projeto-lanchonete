package telas;

public class Fornecedor {
	
	private String razao, nome, cnpj, numContrato, dono, city, uf, cep, end, bairro, tel, site, prodForn;
	private int num;
	
	public Fornecedor(String prazao, String pnome, String pcnpj, String pnumContrato, String pdono, String pcity, String puf, String pcep, String pend, int pnum, String pbairro, String ptel, String psite, String pprodForn){
		razao = prazao;
		nome = pnome;
		cnpj = pcnpj;
		numContrato = pnumContrato;
		dono = pdono;
		city = pcity;
		uf = puf;
		cep = pcep;
		end = pend;
		num = pnum;
		bairro = pbairro;
		tel = ptel;
		site = psite;
		prodForn = pprodForn;
	}
	
	public String getRazao(){
		return razao;
	}
	
	public void setRazao(String prazao){
		razao = prazao;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String pnome){
		nome = pnome;
	}
	
	public String getCnpj(){
		return cnpj;
	}
	
	public void setCnpj(String pcnpj){
		cnpj = pcnpj;
	}
	
	public String getNumContrato(){
		return numContrato;
	}
	
	public void setNumContrato(String pnumContrato){
		numContrato = pnumContrato;
	}
	
	public String getDono(){
		return dono;
	}
	
	public void setDono(String pdono){
		dono = pdono;
	}
	
	public String getCidade(){
		return city;
	}
	
	public void setCidade(String pcity){
		city = pcity;
	}
	
	public String getUf(){
		return uf;
	}
	
	public void setUf(String puf){
		uf = puf;
	}
	
	public String getCep(){
		return cep;
	}
	
	public void setCep(String pcep){
		cep = pcep;
	}
	
	public String getEnd(){
		return end;
	}
	
	public void setEnd(String pend){
		end = pend;
	}
	
	public int getNum(){
		return num;
	}
	
	public void setNum(int pnum){
		num = pnum;
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
	
	public String getProdForn(){
		return prodForn;
	}
	
	public void setProdForn(String pprodForn){
		prodForn = pprodForn;
	}
}

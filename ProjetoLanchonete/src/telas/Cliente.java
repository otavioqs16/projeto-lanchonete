package telas;

public class Cliente {

	private String nome, cpf, cidade, uf, cep, end, bairro, tel, endCom, bairroCom, telCom;
	private int num, numCom;
	
	public Cliente(String pnome, String pcpf, String pcidade, String puf, String pcep, String pend, int pnum, String pbairro, String ptel, String pendCom, int pnumCom, String pbairroCom, String ptelCom){
		nome = pnome;
		cpf = pcpf;
		cidade = pcidade;
		uf = puf;
		cep = pcep;
		end = pend;
		num = pnum;
		bairro = pbairro;
		tel = ptel;
		endCom = pendCom;
		numCom = pnumCom;
		bairroCom = pbairroCom;
		telCom = ptelCom;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String setNome(String pnome){
		this.nome = pnome;
		return pnome;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String setCpf(String pcpf){
		this.cpf = pcpf;
		return pcpf;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public String setCidade(String pcidade){
		this.cidade = pcidade;
		return pcidade;
	}
	
	public String getUf(){
		return uf;
	}
	
	public String setUf(Object puf){
		this.uf = (String) puf;
		return (String) puf;
	}
	
	public String getCep(){
		return cep;
	}
	
	public String setCep(String pcep){
		this.cep = pcep;
		return pcep;
	}
	
	public String getEnd(){
		return end;
	}
	
	public String setEnd(String pend){
		this.end = pend;
		return pend;
	}
	
	public int getNum(){
		return num;
	}
	
	public int setNum(int pnum){
		this.num = pnum;
		return pnum;
	}
	
	public String getBairro(){
		return bairro;
	}
	
	public String setBairro(String pbairro){
		this.bairro = pbairro;
		return pbairro;
	}
	
	public String getTel(){
		return tel;
	}
	
	public String setTel(String ptel){
		this.tel = ptel;
		return ptel;
	}
	
	public String getEndCom(){
		return endCom;
	}
	
	public String setEndCom(String pendCom){
		this.endCom = pendCom;
		return pendCom;
	}
	
	public int getNumCom(){
		return numCom;
	}
	
	public void setNumCom(int pnumCom){
		this.numCom = pnumCom;
	}
	
	public String getBairroCom(){
		return bairroCom;
	}
	
	public String setBairroCom(String pbairroCom){
		this.bairroCom = pbairroCom;
		return pbairroCom;
	}
	
	public String getTelCom(){
		return telCom;
	}
	
	public String setTelCom(String ptelCom){
		this.telCom = ptelCom;
		return ptelCom;
	}
}

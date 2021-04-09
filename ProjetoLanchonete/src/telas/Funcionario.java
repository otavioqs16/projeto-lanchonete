package telas;

public class Funcionario {
	
	private int dia, mes, ano, num;
	private String nome, cidade, cpf, cep, end, bairro, ag, conta, cargo, sal, tel, uf;
	
	public Funcionario(int pdia, int pmes, int pano, String pnome, String pcidade, String pcpf, String pcep, String pend, int pnum, String pbairro, String pag, String pconta, String pcargo, String psal, String ptel, String puf){
		dia = pdia;
		mes = pmes;
		ano = pano;
		nome = pnome;
		cidade = pcidade;
		cpf = pcpf;
		cep = pcep;
		tel = ptel;
		uf = puf;
		end = pend;
		num = pnum;
		bairro = pbairro;
		ag = pag;
		conta = pconta;
		cargo = pcargo;
		sal = psal;
	}
	
	public int getDia(){
		return dia;
	}
	
	public void setDia(int pdia){
		dia = pdia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public void setMes(int pmes){
		mes = pmes;
	}
	
	public int getAno(){
		return ano;
	}
	
	public void setAno(int pano){
		ano = pano;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String pnome){
		nome = pnome;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String pcidade){
		cidade = pcidade;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String pcpf){
		cpf = pcpf;
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
	
	public String getAg(){
		return ag;
	}
	
	public void setAg(String pag){
		ag = pag;
	}
	
	public String getConta(){
		return conta;
	}
	
	public void setConta(String pconta){
		conta = pconta;
	}
	
	public String getCargo(){
		return cargo;
	}
	
	public void setCargo(String pcargo){
		cargo = pcargo;
	}
	
	public String getSal(){
		return sal;
	}
	
	public void setSal(String psal){
		sal = psal;
	}
	
	public String getTel(){
		return tel;
	}
	
	public void setTel(String ptel){
		tel = ptel;
	}
	
	public String getUf(){
		return uf;
	}
	
	public void setUf(String puf){
		uf = puf;
	}
	
}

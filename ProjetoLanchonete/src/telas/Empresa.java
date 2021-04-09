package telas;

public class Empresa {
	
	private String nome, nomeFant, dono, city, end, bairro, site, cnpj, cep, tel;
	private int  num;
	
	public Empresa(String pnome, String pnomeFant, String pcnpj, String pdono, String pcity, String pend, int pnum, String pcep, String pbairro, String ptel, String psite){
		nome = pnome;
		nomeFant = pnomeFant;
		cnpj = pcnpj;
		dono = pdono;
		city = pcity;
		end = pend;
		num = pnum;
		cep = pcep;
		bairro = pbairro;
		tel = ptel;
		site = psite;
	}
	
}

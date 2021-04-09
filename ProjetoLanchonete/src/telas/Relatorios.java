package telas;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Relatorios extends JFrame{
	
	public Menu janMeAbriu;
	
	public Relatorios(Menu meAbriu){
		this.setSize(600, 400);
		this.setTitle("Relatório de Venda");
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		
		criaComponentes();
		criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
	}
	
	private void criaAcoes(){
		
	}
}

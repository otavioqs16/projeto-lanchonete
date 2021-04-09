package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EscolherControle extends JFrame{
	
	public Menu janMeAbriu;
	
	private JButton prodEmp, prodInd, voltar;
	
	public EscolherControle(Menu meAbriu){
		this.setSize(400, 300);
		this.setTitle("Escolher Controle");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		
		criaComponentes();
		criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
		prodInd = new JButton("Controle Produtos Industriais");
		prodInd.setBounds(80, 60, 240, 30);
		add(prodInd);
		
		prodEmp = new JButton("Controle Produtos Empresa");
		prodEmp.setBounds(80, 115, 240, 30);
		add(prodEmp);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(145, 200, 100, 25);
		add(voltar);
		
		this.getContentPane().setBackground(janMeAbriu.cores[janMeAbriu.list.getSelectedIndex()]);
		
	}
	
	private void criaAcoes(){
		
		prodInd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ControleEstoque controle = new ControleEstoque(EscolherControle.this);
				EscolherControle.this.dispose();
				
			}
		});
		
		prodEmp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ControleProdEmp controleEmp = new ControleProdEmp(EscolherControle.this);
				EscolherControle.this.dispose();
				
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EscolherControle.this.dispose();
				janMeAbriu.setVisible(true);
				
			}
		});
	}
	
}

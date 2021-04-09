package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class QtdInd extends JFrame{

	public RegistroVenda janMeAbriu;
	int linhaSelec;
	private JLabel qtd, nome, prod, cod, codprod;
	private JTextField txtQtd;
	private JButton concluir, voltar;
	
	public QtdInd(RegistroVenda meAbriu, int plinhaSelec){
		this.setSize(350, 200);
		this.setTitle("Quantidade");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		linhaSelec = plinhaSelec;
		janMeAbriu = meAbriu;
		
		
		criaComponentes();
		criaAcoes();
		
		this.setVisible(true);
		
		
	}
	
	private void criaComponentes(){
		nome = new JLabel("Produto:");
		nome.setBounds(10, 10, 50, 25);
		add(nome);
		
		prod = new JLabel(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getNome());
		prod.setBounds(60, 10, 200, 25);
		add(prod);
		
		cod = new JLabel("Disponibilidade:");
		cod.setBounds(180, 10, 90, 25);
		add(cod);
		
		codprod = new JLabel(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getQtd() + "");
		codprod.setBounds(280, 10, 110, 25);
		add(codprod);
		
		qtd = new JLabel("Quantidade");
		qtd.setBounds(10, 40, 100, 25);
		add(qtd);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(10, 60, 40, 25);
		add(txtQtd);
		
		concluir = new JButton("Concluir");
		concluir.setBounds(180, 100, 100, 25);
		add(concluir);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(70, 100, 100, 25);
		add(voltar);
				
	}
	
	private void criaAcoes(){
		
		concluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String qtd = txtQtd.getText();
				int intqtd = Integer.parseInt(qtd);
				
				int conta = 0;
				
				if(intqtd <= janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getQtd()){
				conta = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getQtd() - intqtd;
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setQtd(conta);
				
				JOptionPane.showMessageDialog(null, "Concluído!");
				} else{
					JOptionPane.showMessageDialog(null, "Limite de quantidade ultrapassado");
					txtQtd.setText(null);
				}
				
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				QtdInd.this.dispose();
				RegistroVenda regis = new RegistroVenda(janMeAbriu.janMeAbriu);
			}
		});
		
	}
	
}

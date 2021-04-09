package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RelVenda extends JFrame{

	JTable tabela;
	JScrollPane barraRol;
	DefaultTableModel modelo;
	JButton voltar;
	
	public RegistroVenda janMeAbriu;
	
	public RelVenda(RegistroVenda meAbriu){
	this.setSize(800, 600);
	this.setTitle("Relatório Venda Produtos Industriais");
	this.setLocationRelativeTo(null);
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
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Dia Ent.");
		modelo.addColumn("Mes Ent.");
		modelo.addColumn("Ano Ent.");
		modelo.addColumn("Qtd");
		modelo.addColumn("Produto");
		modelo.addColumn("Marca");
		modelo.addColumn("Dia Val.");
		modelo.addColumn("Mes Val.");
		modelo.addColumn("Ano Val.");
		modelo.addColumn("Cod");
		modelo.addColumn("Preço");
		
		String[] linha;
		for(int i = 0; i < janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.size(); i++){
			linha = new String[11];
			linha[0] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDiaEnt() + "";
			linha[1] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMesEnt() + "";
			linha[2] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAnoEnt() + "";
			linha[3] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getQtd() + "";
			linha[4] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getNome();
			linha[5] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMarca();
			linha[6] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDia() + "";
			linha[7] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMes() + "";
			linha[8] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAno() + "";
			linha[9] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getCod();
			linha[10] = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getPreco() + "";
			modelo.addRow(linha);
			
		}
		
		tabela = new JTable(modelo);
		
		barraRol = new JScrollPane(tabela);
		barraRol.setBounds(10, 10, 750, 400);
		this.add(barraRol);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(300, 500, 100, 25);
		add(voltar);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
	}
	
	private void criaAcoes(){
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RelVenda.this.dispose();
				RegistroVenda regis = new RegistroVenda(janMeAbriu.janMeAbriu);
				
			}
		});
	}
}

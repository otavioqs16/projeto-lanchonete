package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistroVenda extends JFrame{
	
	public Registro janMeAbriu;
	
	private JTable tabela;
	private JScrollPane barraRol;
	private DefaultTableModel modelo;
	private JButton voltar, venda, rel;
	
	public RegistroVenda(Registro meAbriu){
		this.setSize(800, 600);
		this.setTitle("Registro Venda Produto Industrial");
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
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroProdInd.size(); i++){
			linha = new String[11];
			linha[0] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDiaEnt() + "";
			linha[1] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMesEnt() + "";
			linha[2] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAnoEnt() + "";
			linha[3] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getQtd() + "";
			linha[4] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getNome();
			linha[5] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMarca();
			linha[6] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDia() + "";
			linha[7] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMes() + "";
			linha[8] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAno() + "";
			linha[9] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getCod();
			linha[10] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getPreco() + "";
			modelo.addRow(linha);
			
		}
		
		tabela = new JTable(modelo);
		
		barraRol = new JScrollPane(tabela);
		barraRol.setBounds(10, 10, 750, 400);
		this.add(barraRol);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(260, 500, 100, 25);
		add(voltar);
		
		venda = new JButton("Vender");
		venda.setBounds(370, 500, 100, 25);
		add(venda);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
		
	}
	
	private void criaAcoes(){
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RegistroVenda.this.dispose();
				Registro escolher = new Registro(janMeAbriu.janMeAbriu);
				
			}
		});
		
		venda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelec = -1;
				linhaSelec = tabela.getSelectedRow();
				
				QtdInd qtd = new QtdInd(RegistroVenda.this, linhaSelec);
				RegistroVenda.this.dispose();
			}
		});
		
	}
}
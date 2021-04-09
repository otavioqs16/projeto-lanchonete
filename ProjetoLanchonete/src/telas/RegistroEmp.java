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

public class RegistroEmp extends JFrame{

	private JTable tabela;
	private JScrollPane barraRol;
	private DefaultTableModel modelo;
	private JButton voltar, venda, rel;
	
	public Registro janMeAbriu;
	
	public RegistroEmp(Registro meAbriu){
		this.setSize(800, 600);
		this.setTitle("Registro Venda Produto Empresa");
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
		
		modelo.addColumn("Qtd");
		modelo.addColumn("Produto");
		modelo.addColumn("Dia Prod.");
		modelo.addColumn("Mês Prod.");
		modelo.addColumn("Ano Prod.");
		modelo.addColumn("Preço");
		modelo.addColumn("Cod");
		modelo.addColumn("Dia Val.");
		modelo.addColumn("Mês Val.");
		modelo.addColumn("Ano Val.");
		
		String[] linha;
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroProdEmp.size(); i++){
			linha = new String[10];
			linha[0] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getQtd() + "";
			linha[1] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getNome();
			linha[2] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getDiaProd() + "";
			linha[3] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getMesProd() + "";
			linha[4] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getAnoProd() + "";
			linha[5] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getPreco() + "";
			linha[6] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getCod() + "";
			linha[7] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getDia() + "";
			linha[8] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getMes() + "";
			linha[9] = janMeAbriu.janMeAbriu.cadastroProdEmp.get(i).getAno() + "";
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
				RegistroEmp.this.dispose();
				EscolherControle controle = new EscolherControle(janMeAbriu.janMeAbriu);
				
			}
		});
		
		venda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelec = -1;
				linhaSelec = tabela.getSelectedRow();
				
				QtdEmp qtd = new QtdEmp(RegistroEmp.this, linhaSelec);
				RegistroEmp.this.dispose();
				
				
			}
		});
		
	}
}


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

public class ControleEstoque extends JFrame{
	
	public EscolherControle janMeAbriu;
	
	private JTable tabela;
	private JScrollPane barraRol;
	private ArrayList<ProdInd> prodIndus;
	private ArrayList<ProdEmp> prodEmpre;
	private DefaultTableModel modelo;
	private JButton voltar, excluir;
	
	public ControleEstoque(EscolherControle meAbriu){
		this.setSize(800, 600);
		this.setTitle("Controle Produtos Industriais");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		//prodIndus = new ArrayList<ProdInd>();
		//prodIndus.add(new ProdInd());
		
		
		janMeAbriu = meAbriu;
		
		for ( int i = 0; i < janMeAbriu.janMeAbriu.cadastroProdInd.size(); i++) {
			int diaEnt = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDiaEnt();
			int mesEnt = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMesEnt();
			int anoEnt = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAnoEnt();
			int qtd = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getQtd();
			String nome = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getNome();
			String marca = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMarca();
			int dia = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getDia();
			int mes = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMes();
			int ano = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getAno();
			String cod = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getCod();
			float preco = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getPreco();
			
		}
		
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
		voltar.setBounds(300, 500, 100, 25);
		add(voltar);
		
		excluir = new JButton("Excluir");
		excluir.setBounds(410, 500, 100, 25);
		add(excluir);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
		
	}
	
	private void criaAcoes(){
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ControleEstoque.this.dispose();
				EscolherControle escolher = new EscolherControle(janMeAbriu.janMeAbriu);
				
			}
		});
		
		excluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelec = -1;
				linhaSelec = tabela.getSelectedRow();
				
				janMeAbriu.janMeAbriu.cadastroProdInd.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
				
			}
		});
		
		
	}
}

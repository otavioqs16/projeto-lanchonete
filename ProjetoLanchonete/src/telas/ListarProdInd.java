package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarProdInd extends JFrame{
	
	public CdProdInd janMeAbriu;
	
	private JTable tabela;
	private JScrollPane barraRol;
	private DefaultTableModel modelo;
	private JButton btnEditar,btnVoltar;
	
	public ListarProdInd(CdProdInd meAbriu){
		this.setSize(700, 400);
		this.setTitle("Listar Produtos Industriais");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		
		this.criaComponentes();
		this.criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("Marca");
		modelo.addColumn("Código");
		
		
		String[] linha;
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroProdInd.size(); i++){
			linha = new String[3];
			linha[0] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getNome();
			linha[1] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getMarca();
			linha[2] = janMeAbriu.janMeAbriu.cadastroProdInd.get(i).getCod();
			modelo.addRow(linha);
		}
		
		tabela = new JTable(modelo);
		
		barraRol = new JScrollPane(tabela);
		barraRol.setBounds(10, 10, 650, 200);
		add(barraRol);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(350, 300, 100, 25);
		add(btnEditar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(240, 300, 100, 25);
		add(btnVoltar);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
	}
	
	private void criaAcoes(){
		btnEditar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int linhaSelec = -1;
				linhaSelec = tabela.getSelectedRow();
				
				EditarProdInd editar = new EditarProdInd(ListarProdInd.this, linhaSelec);
				ListarProdInd.this.dispose();
				
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarProdInd.this.dispose();
				janMeAbriu.setVisible(true);
				
			}
		});
		
		
	}
}

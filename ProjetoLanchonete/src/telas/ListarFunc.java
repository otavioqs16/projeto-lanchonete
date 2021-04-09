package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarFunc extends JFrame{
	
	public CadastroFuncionario janMeAbriu;
	
	private JTable tabela;
	private JScrollPane barraRol;
	private DefaultTableModel modelo;
	private JButton btnEditar,btnVoltar;
	
	public ListarFunc(CadastroFuncionario meAbriu){
		this.setSize(700, 400);
		this.setTitle("Listar Funcionário");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		

		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroFuncionario.size(); i++){
			int dia = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getDia();
			int mes = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getMes();
			int ano = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getAno();
			String nome = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getNome();
			String city = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCidade();
			String cpf = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCpf();
			String cep = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCep();
			String end = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getEnd();
			int num = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getNum();
			String bairro = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getBairro();
			String ag = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getAg();
			String conta = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getConta();
			String cargo = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCargo();
			String sal = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getSal();
			
			
		}
		
		
		this.criaComponentes();
		this.criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("CPF");
		modelo.addColumn("Cargo");
		
		String[] linha;
		
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroFuncionario.size(); i++){
			linha = new String[3];
			linha[0] = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getNome();
			linha[1] = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCpf();
			linha[2] = janMeAbriu.janMeAbriu.cadastroFuncionario.get(i).getCargo();
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
				
				EditarFunc editar = new EditarFunc(ListarFunc.this, linhaSelec);
				ListarFunc.this.dispose();
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarFunc.this.dispose();
				janMeAbriu.setVisible(true);
				
			}
		});
		
		
	}
}

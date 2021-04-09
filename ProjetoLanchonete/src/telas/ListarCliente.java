package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarCliente extends JFrame{
	
	public CadastroCliente janMeAbriu;
	
	private JTable tabela;
	private JScrollPane barraRol;
	private DefaultTableModel modelo;
	private JButton btnEditar,btnVoltar;
	
	public ListarCliente(CadastroCliente meAbriu){
		this.setSize(700, 400);
		this.setTitle("Listar Cliente");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroCliente.size(); i++){
			String nome = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getNome();
			String cpf = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getCpf();
			String cidade = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getCidade();
			String uf = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getUf();
			String cep = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getCep();
			String end = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getEnd();
			int num = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getNum();
			String bairro = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getBairro();
			String tel = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getTel();
			String endCom = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getEndCom();
			int numCom = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getNumCom();
			String bairroCom = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getBairroCom();
			String telCom = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getTelCom();
			
		}
		
		
		this.criaComponentes();
		this.criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Nome");
		modelo.addColumn("CPF");
		modelo.addColumn("Telefone");
		
		
		String[] linha;
		for(int i = 0; i < janMeAbriu.janMeAbriu.cadastroCliente.size(); i++){
			linha = new String[3];
			linha[0] = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getNome();
			linha[1] = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getCpf();
			linha[2] = janMeAbriu.janMeAbriu.cadastroCliente.get(i).getTel();
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
				
				EditarCliente editar = new EditarCliente(ListarCliente.this, linhaSelec);
				ListarCliente.this.dispose();
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarCliente.this.dispose();
				janMeAbriu.setVisible(true);
				
			}
		});
		
		
	}
}

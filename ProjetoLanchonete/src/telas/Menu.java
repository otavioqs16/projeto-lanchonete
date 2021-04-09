package telas;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Menu extends JFrame{
	
	Font fonte = new Font("Dialog", Font.PLAIN, 16);
	Font desc = new Font("Dialgo", Font.PLAIN, 9);
	Font logo = new Font("Dialogo", Font.PLAIN, 12);
	Font sof = new Font("Dialogo", Font.PLAIN, 9);
	
	public JLabel lblInt, lblDesc, lblEsc, lblLogo, lblSof;
	public JRadioButton cdEmp, cdForn, cdClie, cdFunc, cdProdInd, cdProdEmp, cntEst, relVend;
	public ButtonGroup grupo;
	public JButton sair, emp, cliente, forn, func, prodInd, prodEmp, estoque, venda;
	public JList list;
	private static String[] cor = {"Cinza", "Branco", "Cyan", "Vermelho", "Amarelo", "Verde"};
	public static Color[] cores = {Color.LIGHT_GRAY, Color.WHITE, Color.cyan, Color.red, Color.yellow, Color.green};
	
	public ArrayList<Cliente> cadastroCliente = new ArrayList<Cliente>();
	public ArrayList<Funcionario> cadastroFuncionario = new ArrayList<Funcionario>();
	public ArrayList<Empresa2> cadastroEmpresa = new ArrayList<Empresa2>();
	public ArrayList<ProdEmp> cadastroProdEmp = new ArrayList<ProdEmp>();
	public ArrayList<ProdInd> cadastroProdInd = new ArrayList<ProdInd>();
	public ArrayList<Fornecedor> cadastroFornecedor = new ArrayList<Fornecedor>();
	
	public Menu(){
		this.setSize(800, 600);
		this.setTitle("Janela Menu");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		criaComponentes();
		criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		lblInt = new JLabel("LANCHONETE NO CÉU TEM PÃO");
		lblInt.setFont(fonte);
		lblInt.setBounds(285, 10, 500, 25);
		this.add(lblInt);
		
		lblDesc = new JLabel("  DIDI APROVES");
		lblDesc.setFont(desc);
		lblDesc.setBounds(370, 40, 500, 25);
		this.add(lblDesc);
		
		lblLogo = new JLabel("TAMANDUANOIADO");
		lblLogo.setFont(logo);
		lblLogo.setBounds(10, 500, 300, 25);
		this.add(lblLogo);
		
		lblSof = new JLabel("     S O F T W A R E S");
		lblSof.setFont(sof);
		lblSof.setBounds(10, 515, 300, 25);
		this.add(lblSof);
		
		emp = new JButton("Cadastro Empresa");
		emp.setBounds(290, 80, 240, 30);
		this.add(emp);
		
		cliente = new JButton("Cadastro Cliente");
		cliente.setBounds(290, 130, 240, 30);
		this.add(cliente);
		
		forn = new JButton("Cadastro Fornecedor");
		forn.setBounds(290, 180, 240, 30);
		this.add(forn);
		
		func = new JButton("Cadastro Funcionário");
		func.setBounds(290, 230, 240, 30);
		this.add(func);
		
		prodInd = new JButton("Cadastro Produtos Industrializados");
		prodInd.setBounds(290, 280, 240, 30);
		this.add(prodInd);
		
		prodEmp = new JButton("Cadastro Produtos Empresa");
		prodEmp.setBounds(290, 330, 240, 30);
		this.add(prodEmp);
		
		estoque = new JButton("Controle Estoque");
		estoque.setBounds(290, 380, 240, 30);
		this.add(estoque);
		
		venda =  new JButton("Registro de venda");
		venda.setBounds(290, 430, 240, 30);
		this.add(venda);
		
		sair = new JButton("Sair");
		sair.setBounds(360, 500, 100, 25);
		this.add(sair);
		
		
		lblEsc = new JLabel("Escolha a cor de fundo");
		lblEsc.setBounds(650, 425, 200, 25);
		this.add(lblEsc);
		
		list = new JList(cor);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.add(new JScrollPane(list));
		list.setBounds(650, 450, 130, 110);
		this.add(list);
		
		list.addListSelectionListener(new ListSelectionListener(){

					@Override
					public void valueChanged(ListSelectionEvent e) {
						
						getContentPane().setBackground(cores[list.getSelectedIndex()]);
					}
					
				}
		);
		
	}
	
	
	private void criaAcoes(){
		
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Menu.this.dispose();
				
			}
		});
		
		emp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroEmpresa empresa = new CadastroEmpresa(Menu.this);
				Menu.this.setVisible(false);
			}
		});
		
		cliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroCliente cliente = new CadastroCliente(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		func.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFuncionario funcionario = new CadastroFuncionario(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		forn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFornecedor fornecedor = new CadastroFornecedor(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		prodEmp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CdProdEmp prodemp = new CdProdEmp(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		prodInd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CdProdInd prodind = new CdProdInd(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		estoque.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EscolherControle controle = new EscolherControle(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
		venda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Registro relvenda = new Registro(Menu.this);
				Menu.this.setVisible(false);
				
			}
		});
		
	}
	
	
	
	
	
}
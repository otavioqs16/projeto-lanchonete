package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CdProdEmp extends JFrame{
	
	public Menu janMeAbriu;
	
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	
	private ArrayList<Integer>	listDiaProd = new ArrayList<Integer>();
	private ArrayList<Integer>	listMesProd = new ArrayList<Integer>();
	private ArrayList<Integer>	listAnoProd = new ArrayList<Integer>();
	
	private JLabel title, qtd, dataVal, preco, codigo, nome, dataProd;
	private JTextField txtQtd, txtPreco, txtCodigo, txtNome;
	private JButton btnSalvar, btnVoltar,btnListar;
	private JComboBox dia, mes, ano, diaProd, mesProd, anoProd;
	
	public CdProdEmp(Menu meAbriu){
		this.setSize(800, 600);
		this.setTitle("Cadastro Produtos Empresa");
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
		
		title = new JLabel("CADASTRO DOS PRODUTOS PRODUZIDOS NA EMPRESA");
		title.setBounds(200, 10, 400, 25);
		this.add(title);
		
		qtd = new JLabel("Quantidade");
		qtd.setBounds(10, 60, 200, 25);
		this.add(qtd);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(10, 80, 40, 25);
		this.add(txtQtd);
		
		nome = new JLabel("Nome do produto");
		nome.setBounds(150, 60, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(150, 80, 200, 25);
		this.add(txtNome);
		
		dataProd = new JLabel("Data de produção");
		dataProd.setBounds(10, 110, 200, 25);
		this.add(dataProd);
		
		for(int i = 1; i < 32; i++){
			listDiaProd.add(i);
		}
		
		diaProd = new JComboBox(listDiaProd.toArray());
		diaProd.setBounds(10, 130, 50, 25);
		this.add(diaProd);
		
		
		for(int i = 1; i < 13; i++){
			listMesProd.add(i);
		}
		
		mesProd = new JComboBox(listMesProd.toArray());
		mesProd.setBounds(80, 130, 60, 25);
		this.add(mesProd);
		
		for(int i = 2017; i < 2031; i++){
			listAnoProd.add(i);
		}
		
		anoProd = new JComboBox(listAnoProd.toArray());
		anoProd.setBounds(160, 130, 80, 25);
		this.add(anoProd);
		
		preco = new JLabel("Preço (R$)");
		preco.setBounds(10, 170, 200, 25);
		this.add(preco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(10, 190, 60, 25);
		this.add(txtPreco);
		
		codigo = new JLabel("Código");
		codigo.setBounds(10, 220, 200, 25);
		this.add(codigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(10, 240, 120, 25);
		this.add(txtCodigo);
		
		dataVal = new JLabel("Data de validade");
		dataVal.setBounds(10, 270, 200, 25);
		this.add(dataVal);
		
		for(int i = 1; i < 32; i++){
			listDia.add(i);
		}
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 290, 50, 25);
		this.add(dia);
		
		for(int i = 1; i < 13; i++){
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 290, 60, 25);
		this.add(mes);
		
		for(int i = 2017; i < 2031; i++){
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 290, 80, 25);
		this.add(ano);
	
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(220, 450, 100, 25);
		this.add(btnVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(340, 450, 100, 25);
		this.add(btnSalvar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(460, 450, 100, 25);
		this.add(btnListar);
		
		this.getContentPane().setBackground(janMeAbriu.cores[janMeAbriu.list.getSelectedIndex()]);
	}
	
	private void criaAcoes(){
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CdProdEmp.this.dispose();
				janMeAbriu.setVisible(true);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String qtd = txtQtd.getText();
				int intQtd = Integer.parseInt(qtd);
				String nome = txtNome.getText();
				int diaProdd = diaProd.getSelectedIndex();
				int mesProdd = mesProd.getSelectedIndex();
				int anoProdd = (int)anoProd.getSelectedItem();
				String preco = txtPreco.getText();
				double precoq = Double.parseDouble(preco);
				String cod = txtCodigo.getText();
				int diaa = dia.getSelectedIndex();
				int mess = mes.getSelectedIndex();
				int anoo = (int) ano.getSelectedItem();
				
				ProdEmp produtoEmp = new ProdEmp(intQtd, nome, diaProdd, mesProdd, anoProdd, precoq, cod, diaa, mess, anoo);
				janMeAbriu.cadastroProdEmp.add(produtoEmp);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				txtQtd.setText(null);
				txtNome.setText(null);
				diaProd.setSelectedItem(null);
				mesProd.setSelectedItem(null);
				anoProd.setSelectedItem(null);
				txtPreco.setText(null);
				txtCodigo.setText(null);
				dia.setSelectedItem(null);
				mes.setSelectedItem(null);
				ano.setSelectedItem(null);
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarProdEmp listar = new ListarProdEmp(CdProdEmp.this);
				CdProdEmp.this.setVisible(false);
				
			}
		});
		
}
	
}

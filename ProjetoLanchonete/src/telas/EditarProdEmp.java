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

public class EditarProdEmp extends JFrame{
	
	public ListarProdEmp janMeAbriu;
	
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	
	private ArrayList<Integer>	listDiaProd = new ArrayList<Integer>();
	private ArrayList<Integer>	listMesProd = new ArrayList<Integer>();
	private ArrayList<Integer>	listAnoProd = new ArrayList<Integer>();
	
	private JLabel title, qtd, dataVal, preco, codigo, nome, dataProd;
	private JTextField txtQtd, txtPreco, txtCodigo, txtNome;
	private JButton btnSalvar, btnVoltar,btnExcluir;
	private JComboBox dia, mes, ano, diaProd, mesProd, anoProd;
	int linhaSelec;
	
	
	public EditarProdEmp(ListarProdEmp meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Produtos Empresa");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		linhaSelec = plinhaSelec;
		janMeAbriu = meAbriu;
		this.criaComponentes();
		this.criaAcoes();
		
		this.setVisible(true);
		
	}
	
	private void criaComponentes(){
		
		qtd = new JLabel("Quantidade");
		qtd.setBounds(10, 60, 200, 25);
		this.add(qtd);
		
		txtQtd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getQtd() + "");
		txtQtd.setBounds(10, 80, 40, 25);
		this.add(txtQtd);
		
		nome = new JLabel("Nome do produto");
		nome.setBounds(150, 60, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getNome());
		txtNome.setBounds(150, 80, 200, 25);
		this.add(txtNome);
		
		dataProd = new JLabel("Data de produção");
		dataProd.setBounds(10, 110, 200, 25);
		this.add(dataProd);
		
		int diaSelecProd = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getDiaProd();
		int posDiaProd = 0;
		
		for(int i = 1; i < 32; i++){
			if(i == diaSelecProd){
				posDiaProd = i;
			}
			listDiaProd.add(i);
		}
		
		diaProd = new JComboBox(listDiaProd.toArray());
		diaProd.setBounds(10, 130, 50, 25);
		diaProd.setSelectedIndex(posDiaProd);
		this.add(diaProd);
		
		int mesSelecProd = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getMesProd();
		int posMesProd = 0;
		
		for(int i = 1; i < 13; i++){
			if(i == mesSelecProd){
				posMesProd = i;
			}
			listMesProd.add(i);
		}
		
		mesProd = new JComboBox(listMesProd.toArray());
		mesProd.setBounds(80, 130, 60, 25);
		mesProd.setSelectedIndex(posMesProd);
		this.add(mesProd);
		
		int anoSelecProd = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getAnoProd();
		int posAnoProd = 0;
		
		for(int i = 2017; i < 2031; i++){
			if(i == anoSelecProd){
				posAnoProd = i;
			}
			listAnoProd.add(i);
		}
		
		anoProd = new JComboBox(listAnoProd.toArray());
		anoProd.setBounds(160, 130, 80, 25);
		anoProd.setSelectedItem(posAnoProd);
		this.add(anoProd);
		
		preco = new JLabel("Preço (R$)");
		preco.setBounds(10, 170, 200, 25);
		this.add(preco);
		
		txtPreco = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getPreco() + "");
		txtPreco.setBounds(10, 190, 60, 25);
		this.add(txtPreco);
		
		codigo = new JLabel("Código");
		codigo.setBounds(10, 220, 200, 25);
		this.add(codigo);
		
		txtCodigo = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getCod());
		txtCodigo.setBounds(10, 240, 120, 25);
		this.add(txtCodigo);
		
		dataVal = new JLabel("Data de validade");
		dataVal.setBounds(10, 270, 200, 25);
		this.add(dataVal);
		
		int diaSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getDia();
		int posDia = 0;
		
		for(int i = 1; i < 32; i++){
			if(i == diaSelec){
				posDia = i;
			}
			listDia.add(i);
		}
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 290, 50, 25);
		dia.setSelectedIndex(posDia);
		this.add(dia);
		
		int mesSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getMes();
		int posMes = 0;
		
		for(int i = 1; i < 13; i++){
			if(i == mesSelec){
				posMes = i;
			}
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 290, 60, 25);
		mes.setSelectedIndex(posMes);
		this.add(mes);
		
		int anoSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).getAno();
		int posAno = 0;
		
		for(int i = 2017; i < 2031; i++){
			if(i == anoSelec){
				posAno = i;
			}
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 290, 80, 25);
		ano.setSelectedItem(posAno);
		this.add(ano);
	
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(140, 400, 100, 25);
		add(btnVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(250, 400, 100, 25);
		add(btnSalvar);
		
		btnExcluir = new JButton("Exlcuir");
		btnExcluir.setBounds(360, 400, 100, 25);
		add(btnExcluir);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
	}
	
	private void criaAcoes(){
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EditarProdEmp.this.dispose();
				ListarProdEmp listar = new ListarProdEmp(janMeAbriu.janMeAbriu);
				
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
				int anoo = (int)ano.getSelectedItem();
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setQtd(intQtd);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setDiaProd(diaProdd);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setMesProd(mesProdd);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setAnoProd(anoProdd);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setPreco(precoq);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setCod(cod);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setDia(diaa);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setMes(mess);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.get(linhaSelec).setAno(anoo);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdEmp.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				

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
	}
}

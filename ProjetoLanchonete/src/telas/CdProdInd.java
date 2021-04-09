package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CdProdInd extends JFrame{
	
	public Menu janMeAbriu;
	
	private JLabel title, qtd, codBar, preco, entEst, dataVal, nome, marca;
	private JTextField txtQtd, txtCodBar, txtPreco, txtNome, txtMarca;
	private JComboBox diaEnt, mesEnt, anoEnt, dia, mes, ano;
	private JButton btnSalvar, btnVoltar, btnListar;
	
	private ArrayList<Integer> listDiaEnt = new ArrayList<Integer>();
	private ArrayList<Integer> listMesEnt = new ArrayList<Integer>();
	private ArrayList<Integer> listAnoEnt = new ArrayList<Integer>();
	
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	
	public CdProdInd(Menu meAbriu){
		this.setSize(800, 600);
		this.setTitle("Cadastro Produtos Industrializados");
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
		
		title = new JLabel("CADASTRO DOS PRODUTOS INDUSTRIALIZADOS");
		title.setBounds(240, 10, 400, 25);
		this.add(title);
		
		entEst = new JLabel("Data de entrada no estoque");
		entEst.setBounds(10, 60, 200, 25);
		this.add(entEst);
		
		for(int i = 1; i < 32; i++){
			listDiaEnt.add(i);
		}
		
		diaEnt = new JComboBox(listDiaEnt.toArray());
		diaEnt.setBounds(10, 85, 50, 25);
		this.add(diaEnt);
		
		for(int i = 1; i < 13; i++){
			listMesEnt.add(i);
		}
		
		mesEnt = new JComboBox(listMesEnt.toArray());
		mesEnt.setBounds(80, 85, 60, 25);
		this.add(mesEnt);
		
		for(int i = 2017; i < 2021; i++){
			listAnoEnt.add(i);
		}
		
		anoEnt = new JComboBox(listAnoEnt.toArray());
		anoEnt.setBounds(160, 85, 80, 25);
		this.add(anoEnt);
		
		qtd = new JLabel("Quantidade");
		qtd.setBounds(10, 120, 200, 25);
		this.add(qtd);
		
		txtQtd = new JTextField();
		txtQtd.setBounds(10, 140, 40, 25);
		this.add(txtQtd);
		
		nome = new JLabel("Nome do produto");
		nome.setBounds(120, 120, 120, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(120, 140, 200, 25);
		this.add(txtNome);
		
		marca = new JLabel("Marca");
		marca.setBounds(400, 120, 200, 25);
		this.add(marca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(400, 140, 200, 25);
		this.add(txtMarca);
		
		dataVal = new JLabel("Data de validade");
		dataVal.setBounds(10, 175, 200, 25);
		this.add(dataVal);
		
		for(int i = 1; i < 32; i++){
			listDia.add(i);
		}
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 200, 50, 25);
		this.add(dia);
		
		for(int i = 1; i < 13; i++){
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 200, 60, 25);
		this.add(mes);
		
		for(int i = 2017; i < 2031; i++){
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 200, 80, 25);
		this.add(ano);
		
		codBar = new JLabel("Código de barras");
		codBar.setBounds(10, 235, 200, 25);
		this.add(codBar);
		
		txtCodBar = new JTextField();
		txtCodBar.setBounds(10, 255, 120, 25);
		this.add(txtCodBar);
		
		preco = new JLabel("Preço unitário (R$)");
		preco.setBounds(10, 295, 200, 25);
		this.add(preco);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(10, 315, 60, 25);
		this.add(txtPreco);
		
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
				CdProdInd.this.dispose();
				janMeAbriu.setVisible(true);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int diaEnter = diaEnt.getSelectedIndex();
				int mesEnter = mesEnt.getSelectedIndex();
				int anoEnter = (int)anoEnt.getSelectedItem();
				String qtd = txtQtd.getText();
				int intQtd = Integer.parseInt(qtd);
				String nome = txtNome.getText();
				String marca = txtMarca.getText();
				int diaa = dia.getSelectedIndex();
				int mess = mes.getSelectedIndex();
				int anoo = ano.getSelectedIndex();
				String cod = txtCodBar.getText();
				String preco = txtPreco.getText();
				float floatpreco = Float.parseFloat(preco);
				
				ProdInd produtoInd = new ProdInd(diaEnter, mesEnter, anoEnter, intQtd, nome, marca, diaa, mess, anoo, cod, floatpreco);
				janMeAbriu.cadastroProdInd.add(produtoInd);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				diaEnt.setSelectedItem(null);
				mesEnt.setSelectedItem(null);
				anoEnt.setSelectedItem(null);
				txtQtd.setText(null);
				txtNome.setText(null);
				txtMarca.setText(null);
				dia.setSelectedItem(null);
				mes.setSelectedItem(null);
				ano.setSelectedItem(null);
				txtCodBar.setText(null);
				txtPreco.setText(null);
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarProdInd listar = new ListarProdInd(CdProdInd.this);
				CdProdInd.this.setVisible(false);
				
			}
		});
		
	}
}

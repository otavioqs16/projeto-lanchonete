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

public class EditarProdInd extends JFrame{
	
	public ListarProdInd janMeAbriu;
	
	private JLabel title, qtd, codBar, preco, entEst, dataVal, nome, marca;
	private JTextField txtQtd, txtCodBar, txtPreco, txtNome, txtMarca;
	private JComboBox diaEnt, mesEnt, anoEnt, dia, mes, ano;
	private JButton btnSalvar, btnVoltar, btnExcluir;
	
	private ArrayList<Integer> listDiaEnt = new ArrayList<Integer>();
	private ArrayList<Integer> listMesEnt = new ArrayList<Integer>();
	private ArrayList<Integer> listAnoEnt = new ArrayList<Integer>();
	
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	int linhaSelec;
	
	
	public EditarProdInd(ListarProdInd meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Produtos Industriais");
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
		
		entEst = new JLabel("Data de entrada no estoque");
		entEst.setBounds(10, 10, 200, 25);
		this.add(entEst);
		
		int diaEntSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getDiaEnt();
		int posDiaSelec = 0;
		
		for(int i = 1; i < 32; i++){
			if(i == diaEntSelec){
				posDiaSelec = i;
			}
			listDiaEnt.add(i);
		}
		
		diaEnt = new JComboBox(listDiaEnt.toArray());
		diaEnt.setBounds(10, 35, 50, 25);
		diaEnt.setSelectedIndex(posDiaSelec);
		this.add(diaEnt);
		
		int mesEntSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getMesEnt();
		int posMesSelec = 0;
		
		for(int i = 1; i < 13; i++){
			if(i == mesEntSelec){
				posMesSelec = i;
			}
			listMesEnt.add(i);
		}
		
		mesEnt = new JComboBox(listMesEnt.toArray());
		mesEnt.setBounds(80, 35, 60, 25);
		mesEnt.setSelectedIndex(posMesSelec);
		this.add(mesEnt);
		
		int anoEntSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getAnoEnt();
		int posAnoSelec = 0;
		
		for(int i = 2017; i < 2021; i++){
			if(i == anoEntSelec){
				posAnoSelec = i;
			}
			listAnoEnt.add(i);
		}
		
		anoEnt = new JComboBox(listAnoEnt.toArray());
		anoEnt.setBounds(160, 35, 80, 25);
		anoEnt.setSelectedItem(posAnoSelec);
		this.add(anoEnt);
		
		qtd = new JLabel("Quantidade");
		qtd.setBounds(10, 80, 200, 25);
		this.add(qtd);
		
		txtQtd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getQtd() + "");
		txtQtd.setBounds(10, 100, 40, 25);
		this.add(txtQtd);
		
		nome = new JLabel("Nome do produto");
		nome.setBounds(120, 80, 120, 25);
		this.add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getNome());
		txtNome.setBounds(120, 100, 200, 25);
		this.add(txtNome);
		
		marca = new JLabel("Marca");
		marca.setBounds(400, 80, 200, 25);
		this.add(marca);
		
		txtMarca = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getMarca());
		txtMarca.setBounds(400, 100, 200, 25);
		this.add(txtMarca);
		
		dataVal = new JLabel("Data de validade");
		dataVal.setBounds(10, 130, 200, 25);
		this.add(dataVal);
		
		int diaSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getDia();
		int posDia = 0;
		
		for(int i = 1; i < 32; i++){
			if(i == diaSelec){
				posDia = i;
			}
			listDia.add(i);
		}
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 155, 50, 25);
		dia.setSelectedIndex(posDia);
		this.add(dia);
		
		int mesSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getMes();
		int posMes = 0;
		
		for(int i = 1; i < 13; i++){
			if(i == mesSelec){
				posMes = i;
			}
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 155, 60, 25);
		mes.setSelectedIndex(posMes);
		this.add(mes);
		
		int anoSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getAno();
		int posAno = 0;
		
		for(int i = 2017; i < 2031; i++){
			if(i == anoSelec){
				posAno = i;
			}
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 155, 80, 25);
		ano.setSelectedItem(posAno);
		this.add(ano);
		
		codBar = new JLabel("Código de barras");
		codBar.setBounds(10, 180, 200, 25);
		this.add(codBar);
		
		txtCodBar = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getCod());
		txtCodBar.setBounds(10, 200, 120, 25);
		this.add(txtCodBar);
		
		preco = new JLabel("Preço unitário (R$)");
		preco.setBounds(10, 230, 200, 25);
		this.add(preco);
		
		txtPreco = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).getPreco() + "");
		txtPreco.setBounds(10, 250, 60, 25);
		this.add(txtPreco);
	
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
				EditarProdInd.this.dispose();
				ListarProdInd listar = new ListarProdInd(janMeAbriu.janMeAbriu);
				
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int diaEnter = diaEnt.getSelectedIndex();
				int mesEnter = mesEnt.getSelectedIndex();
				int anoEnter = (int) anoEnt.getSelectedItem();
				String qtd = txtQtd.getText();
				int intQtd = Integer.parseInt(qtd);
				String nome = txtNome.getText();
				String marca = txtMarca.getText();
				int diaa = dia.getSelectedIndex();
				int mess = mes.getSelectedIndex();
				int anoo = (int) ano.getSelectedItem();
				String cod = txtCodBar.getText();
				String preco = txtPreco.getText();
				float floatpreco = Float.parseFloat(preco);
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setDiaEnt(diaEnter);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setMesEnt(mesEnter);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setAnoEnt(anoEnter);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setQtd(intQtd);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setMarca(marca);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setDia(diaa);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setMes(mess);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setAno(anoo);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setCod(cod);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.get(linhaSelec).setPreco(floatpreco);
				
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroProdInd.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
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
	}
}

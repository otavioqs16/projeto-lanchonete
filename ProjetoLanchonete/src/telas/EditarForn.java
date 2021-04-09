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

public class EditarForn extends JFrame{
	
	public ListarForn janMeAbriu;
	
	private int linhaSelec;
	private JLabel title, ufs, razao, nome, cnpj, dono, end, num, bairro, city, cep, prod, numContrato, tel, site;
	private JComboBox uf;
	private JTextField txtRazao, txtNome, txtCnpj, txtDono, txtEnd, txtNum, txtBairro, txtCity, txtCep, txtProd, txtNumContrato, txtTel, txtSite;
	private JButton btnVoltar, btnSalvar, btnExcluir;
	
	public EditarForn(ListarForn meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Fornecedor");
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
		
		razao = new JLabel("Razão social");
		razao.setBounds(10, 10, 200, 25);
		this.add(razao);
		
		txtRazao = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getRazao());
		txtRazao.setBounds(10, 30, 250, 25);
		this.add(txtRazao);
		
		nome = new JLabel("Nome fantasia");
		nome.setBounds(10, 60, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getNome());
		txtNome.setBounds(10, 80, 250, 25);
		this.add(txtNome);
		
		cnpj = new JLabel("CNPJ");
		cnpj.setBounds(10, 110, 110, 25);
		this.add(cnpj);
		
		txtCnpj = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getCnpj());
		txtCnpj.setBounds(10, 130, 110, 25);
		this.add(txtCnpj);
		
		numContrato = new JLabel("Nº Contrato");
		numContrato.setBounds(180, 110, 200, 25);
		this.add(numContrato);
		
		txtNumContrato = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getNumContrato());
		txtNumContrato.setBounds(180, 130, 110, 25);
		this.add(txtNumContrato);
		
		dono = new JLabel("Nome proprietário");
		dono.setBounds(10, 160, 250, 25);
		this.add(dono);
		
		txtDono = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getDono());
		txtDono.setBounds(10, 180, 250, 25);
		this.add(txtDono);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 210, 200, 25);
		this.add(city);
		
		txtCity = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getCidade());
		txtCity.setBounds(10, 230, 200, 25);
		this.add(txtCity);
		
		ufs = new JLabel("UF");
		ufs.setBounds(220, 210, 50, 25);
		this.add(ufs);
		
		String[] estados = {janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getUf(), "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 230, 50, 25);
		this.add(uf);
		
		cep = new JLabel("CEP");
		cep.setBounds(290, 210, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getCep());
		txtCep.setBounds(290, 230, 80, 25);
		this.add(txtCep);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 260, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getEnd());
		txtEnd.setBounds(10, 280, 250, 25);
		this.add(txtEnd);
		
		num = new JLabel("Nº");
		num.setBounds(280, 260, 50, 25);
		this.add(num);
		
		txtNum = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getNum() + "");
		txtNum.setBounds(280, 280, 50, 25);
		this.add(txtNum);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 260, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getBairro());
		txtBairro.setBounds(350, 280, 150, 25);
		this.add(txtBairro);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 310, 200, 25);
		this.add(tel);
		
		txtTel = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getTel());
		txtTel.setBounds(10, 330, 80, 25);
		this.add(txtTel);
		
		prod = new JLabel("Produtos fornecidos");
		prod.setBounds(10, 360, 200, 25);
		this.add(prod);
		
		txtProd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getProdForn());
		txtProd.setBounds(10, 380, 700, 25);
		this.add(txtProd);
		
		site = new JLabel("Site");
		site.setBounds(120, 310, 200, 25);
		this.add(site);
		
		txtSite = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).getSite());
		txtSite.setBounds(120, 330, 250, 25);
		this.add(txtSite);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(140, 425, 100, 25);
		add(btnVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(250, 425, 100, 25);
		add(btnSalvar);
		
		btnExcluir = new JButton("Exlcuir");
		btnExcluir.setBounds(360, 425, 100, 25);
		add(btnExcluir);
		
		this.getContentPane().setBackground(janMeAbriu.janMeAbriu.janMeAbriu.cores[janMeAbriu.janMeAbriu.janMeAbriu.list.getSelectedIndex()]);
	}
	
	private void criaAcoes(){
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EditarForn.this.dispose();
				ListarForn listar = new ListarForn(janMeAbriu.janMeAbriu);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String razao = txtRazao.getText();
				String nome = txtNome.getText();
				String cnpj = txtCnpj.getText();
				String numContrato = txtNumContrato.getText();
				String dono = txtDono.getText();
				String cidade = txtCity.getText();
				String uff = (String) uf.getSelectedItem();
				String cep = txtCep.getText();
				String end = txtEnd.getText();
				String num = txtNum.getText();
				int intnum = Integer.parseInt(num);
				String bairro = txtBairro.getText();
				String tel = txtTel.getText();
				String site = txtSite.getText();
				String prodForn = txtProd.getText();
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setRazao(razao);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setCnpj(cnpj);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setNumContrato(numContrato);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setDono(dono);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setCidade(cidade);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setUf(uff);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setCep(cep);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setEnd(end);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setNum(intnum);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setBairro(bairro);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setTel(tel);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setSite(site);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.get(linhaSelec).setProdForn(prodForn);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFornecedor.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
				txtRazao.setText(null);
				txtNome.setText(null);
				txtCnpj.setText(null);
				txtNumContrato.setText(null);
				txtDono.setText(null);
				txtCity.setText(null);
				uf.setSelectedItem(null);
				txtCep.setText(null);
				txtEnd.setText(null);
				txtNum.setText(null);
				txtBairro.setText(null);
				txtTel.setText(null);
				txtSite.setText(null);
				txtProd.setText(null);
			}
		});
	}
}

package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroFornecedor extends JFrame {
	public Menu janMeAbriu;

	private JLabel title, ufs, razao, nome, cnpj, dono, end, num, bairro, city, cep, prod, numContrato, tel, site;
	private JComboBox uf;
	private JTextField txtRazao, txtNome, txtCnpj, txtDono, txtEnd, txtNum, txtBairro, txtCity, txtCep, txtProd, txtNumContrato, txtTel, txtSite;
	private JButton btnVoltar, btnSalvar, btnListar;
	
	public CadastroFornecedor(Menu meAbriu) {
		this.setSize(800, 600);
		this.setTitle("Cadastro Fornecedor");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());

		janMeAbriu = meAbriu;

		criaComponentes();
		criaAcoes();

		this.setVisible(true);

	}

	private void criaComponentes() {
		title = new JLabel("CADASTRO DE FORNECEDOR");
		title.setBounds(300, 10, 200, 25);
		this.add(title);
		
		razao = new JLabel("Razão social");
		razao.setBounds(10, 50, 200, 25);
		this.add(razao);
		
		txtRazao = new JTextField();
		txtRazao.setBounds(10, 70, 250, 25);
		this.add(txtRazao);
		
		nome = new JLabel("Nome fantasia");
		nome.setBounds(10, 100, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 120, 250, 25);
		this.add(txtNome);
		
		cnpj = new JLabel("CNPJ");
		cnpj.setBounds(10, 150, 110, 25);
		this.add(cnpj);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(10, 170, 110, 25);
		this.add(txtCnpj);
		
		numContrato = new JLabel("Nº Contrato");
		numContrato.setBounds(180, 150, 200, 25);
		this.add(numContrato);
		
		txtNumContrato = new JTextField();
		txtNumContrato.setBounds(180, 170, 110, 25);
		this.add(txtNumContrato);
		
		dono = new JLabel("Nome proprietário");
		dono.setBounds(10, 200, 250, 25);
		this.add(dono);
		
		txtDono = new JTextField();
		txtDono.setBounds(10, 220, 250, 25);
		this.add(txtDono);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 250, 200, 25);
		this.add(city);
		
		txtCity = new JTextField();
		txtCity.setBounds(10, 270, 200, 25);
		this.add(txtCity);
		
		ufs = new JLabel("UF");
		ufs.setBounds(220, 250, 50, 25);
		this.add(ufs);
		
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 270, 50, 25);
		this.add(uf);
		
		cep = new JLabel("CEP");
		cep.setBounds(290, 250, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField();
		txtCep.setBounds(290, 270, 80, 25);
		this.add(txtCep);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 300, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField();
		txtEnd.setBounds(10, 320, 250, 25);
		this.add(txtEnd);
		
		num = new JLabel("Nº");
		num.setBounds(280, 300, 50, 25);
		this.add(num);
		
		txtNum = new JTextField();
		txtNum.setBounds(280, 320, 50, 25);
		this.add(txtNum);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 300, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(350, 320, 150, 25);
		this.add(txtBairro);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 350, 200, 25);
		this.add(tel);
		
		txtTel = new JTextField();
		txtTel.setBounds(10, 370, 80, 25);
		this.add(txtTel);
		
		prod = new JLabel("Produtos fornecidos");
		prod.setBounds(10, 400, 200, 25);
		this.add(prod);
		
		txtProd = new JTextField();
		txtProd.setBounds(10, 420, 700, 25);
		this.add(txtProd);
		
		site = new JLabel("Site");
		site.setBounds(120, 350, 200, 25);
		this.add(site);
		
		txtSite = new JTextField();
		txtSite.setBounds(120, 370, 250, 25);
		this.add(txtSite);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(220, 470, 100, 25);
		this.add(btnVoltar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(340, 470, 100, 25);
		this.add(btnSalvar);
		
		btnListar = new JButton("Listar");
		btnListar.setBounds(460, 470, 100, 25);
		this.add(btnListar);
		
		this.getContentPane().setBackground(janMeAbriu.cores[janMeAbriu.list.getSelectedIndex()]);
		
		
	}

	private void criaAcoes() {
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroFornecedor.this.dispose();
				janMeAbriu.setVisible(true);
				
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
				
				Fornecedor coca = new Fornecedor(razao, nome, cnpj, numContrato, dono, cidade, uff, cep, end, intnum, bairro, tel, site, prodForn);
				janMeAbriu.cadastroFornecedor.add(coca);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
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
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarForn listar = new ListarForn(CadastroFornecedor.this);
				CadastroFornecedor.this.setVisible(false);
			}
		});
	}

}

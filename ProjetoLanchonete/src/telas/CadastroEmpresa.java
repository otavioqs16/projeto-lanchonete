package telas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import telas.Menu;

public class CadastroEmpresa extends JFrame{
	
	private JLabel title, cnpj, nome, nomeFant, tel, nomeDono, site, end,cep, num, bairro, ufc, city;
	private JTextField txtCnpj, txtNome, txtNomeFant, txtTel, txtNomeDono, txtCep, txtSite, txtCity, txtBairro, txtEnd, txtNum;
	private JButton btnVoltar, btnSalvar, btnListar;
	private JComboBox uf;
	
	public Menu janMeAbriu;
	
	public CadastroEmpresa(Menu meAbriu){
		this.setSize(800, 600);
		this.setTitle("Cadastro de Empresa");
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
		
		title = new JLabel("CADASTRO DA EMPRESA");
		title.setBounds(300, 10, 200, 25);
		this.add(title);
		
		nome = new JLabel("Razão Social");
		nome.setBounds(10, 60, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 80, 250, 25);
		this.add(txtNome);
		
		nomeFant = new JLabel("Nome Fantasia");
		nomeFant.setBounds(10, 110, 200, 25);
		this.add(nomeFant);
		
		txtNomeFant = new JTextField();
		txtNomeFant.setBounds(10, 130, 250, 25);
		this.add(txtNomeFant);
		
		cnpj = new JLabel("CNPJ");
		cnpj.setBounds(10, 160, 200, 25);
		this.add(cnpj);
		
		txtCnpj = new JTextField();
		txtCnpj.setBounds(10, 180, 110, 25);
		this.add(txtCnpj);
		
		nomeDono = new JLabel("Nome proprietário");
		nomeDono.setBounds(10, 210, 200, 25);
		this.add(nomeDono);
		
		txtNomeDono = new JTextField();
		txtNomeDono.setBounds(10, 230, 250, 25);
		this.add(txtNomeDono);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 260, 200, 25);
		this.add(city);
		
		txtCity = new JTextField();
		txtCity.setBounds(10, 280, 200, 25);
		this.add(txtCity);
		
		ufc = new JLabel("UF");
		ufc.setBounds(220, 260, 40, 25);
		this.add(ufc);
		
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 280, 50, 25);
		this.add(uf);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 310, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField();
		txtEnd.setBounds(10, 330, 250, 25);
		this.add(txtEnd);
		
		cep = new JLabel("CEP");
		cep.setBounds(290, 260, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField();
		txtCep.setBounds(290, 280, 80, 25);
		this.add(txtCep);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 310, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(350, 330, 150, 25);
		this.add(txtBairro);
		
		num = new JLabel("Nº");
		num.setBounds(280, 310, 200, 25);
		this.add(num);
		
		txtNum = new JTextField();
		txtNum.setBounds(280, 330, 50, 25);
		this.add(txtNum);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 360, 200, 25);
		this.add(tel);
		
		txtTel = new JTextField();
		txtTel.setBounds(10, 380, 80, 25);
		this.add(txtTel);
		
		site = new JLabel("Site");
		site.setBounds(10, 410, 200, 25);
		this.add(site);
		
		txtSite = new JTextField();
		txtSite.setBounds(10, 430, 250, 25);
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
	
	private void criaAcoes(){
		
		btnVoltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastroEmpresa.this.dispose();
				janMeAbriu.setVisible(true);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String nomeFant = txtNomeFant.getText();
				String cnpj = txtCnpj.getText();
				String dono = txtNomeDono.getText();
				String city = txtCity.getText();
				String end = txtEnd.getText();
				String cep = txtCep.getText();
				String bairro = txtBairro.getText();
				String uff = (String) uf.getSelectedItem();
				
				String num = txtNum.getText();
				int intNum = Integer.parseInt(num);
				String tel = txtTel.getText();
				String site = txtSite.getText();
				
				Empresa2 emp = new Empresa2(nome, nomeFant, cnpj, uff , dono, city, end, intNum, cep, bairro, tel, site);
				janMeAbriu.cadastroEmpresa.add(emp);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				txtNome.setText(null);
				txtNomeFant.setText(null);
				txtCnpj.setText(null);
				txtNomeDono.setText(null);
				txtCity.setText(null);
				txtEnd.setText(null);
				txtCep.setText(null);
				txtBairro.setText(null);
				uf.setSelectedItem(null);
				txtNum.setText(null);
				txtTel.setText(null);
				txtSite.setText(null);
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarEmpresa listar = new ListarEmpresa(CadastroEmpresa.this);
				CadastroEmpresa.this.setVisible(false);
				
			}
		});
		
	}
	
	
	
}

package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame {
	public Menu janMeAbriu;
	private JLabel nome,cpf,end, num, tel, endCom, telCom, title, numEmp,bairro, city, ufc, cep, bairroCom;
	private JTextField txtNome, txtCpf, txtEnd, txtNum, txtTel, txtCity, txtCep,txtBairro, txtEndCom, txtTelCom, txtNumEmp, txtBairroCom;
	private JButton btnSalvar, btnVoltar, btnEditar, btnExcluir, btnListar;
	private JComboBox uf;
	
	public CadastroCliente(Menu meAbriu){
		this.setSize(800, 600);
		this.setTitle("Cadastro Cliente");
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("imagem/lanchonete.png");
		this.setIconImage(img.getImage());
		
		janMeAbriu = meAbriu;
		this.criaComponentes();
		this.criaAcoes();
		
		this.setVisible(true);
	}
	
	private void criaComponentes(){
		
		title = new JLabel("CADASTRO DE CLIENTES");
		title.setBounds(300, 10, 200, 25);
		this.add(title);
		
		nome = new JLabel("Nome");
		nome.setBounds(10, 40, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 60, 250, 25);
		this.add(txtNome);
		
		cpf = new JLabel("CPF");
		cpf.setBounds(10, 90, 200, 25);
		this.add(cpf);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 140, 200, 25);
		this.add(city);
		
		txtCity = new JTextField();
		txtCity.setBounds(10, 160, 200, 25);
		this.add(txtCity);
		
		ufc = new JLabel("UF");
		ufc.setBounds(220, 140, 40, 25);
		this.add(ufc);
		
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 160, 50, 25);
		this.add(uf);
		
		cep = new JLabel("CEP");
		cep.setBounds(280, 140, 100, 25);
		this.add(cep);
		
		txtCep = new JTextField();
		txtCep.setBounds(280, 160, 80, 25);
		this.add(txtCep);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(10, 110, 110, 25);
		this.add(txtCpf);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 190, 200, 25);
		this.add(end);
		
		num = new JLabel("Nº");
		num.setBounds(280, 190, 200, 25);
		this.add(num);
		
		txtNum = new JTextField();
		txtNum.setBounds(280, 210, 50, 25);
		this.add(txtNum);
		
		txtEnd = new JTextField();
		txtEnd.setBounds(10, 210, 250, 25);
		this.add(txtEnd);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 190, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(350, 210, 150, 25);
		this.add(txtBairro);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 230, 200, 25);
		this.add(tel);
		
		txtTel = new JTextField();
		txtTel.setBounds(10, 250, 80, 25);
		this.add(txtTel);
		
		endCom = new JLabel("Endereço comercial");
		endCom.setBounds(10, 280, 200, 25);
		this.add(endCom);
		
		numEmp = new JLabel("Nº");
		numEmp.setBounds(280, 280, 200, 25);
		this.add(numEmp);
		
		txtNumEmp = new JTextField();
		txtNumEmp.setBounds(280, 300, 50, 25);
		this.add(txtNumEmp);
		
		txtEndCom = new JTextField();
		txtEndCom.setBounds(10, 300, 250, 25);
		this.add(txtEndCom);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 280, 200, 25);
		this.add(bairro);
		
		txtBairroCom = new JTextField();
		txtBairroCom.setBounds(350, 300, 150, 25);
		this.add(txtBairroCom);
		
		telCom = new JLabel("Telefone comercial");
		telCom.setBounds(10, 330, 200, 25);
		this.add(telCom);
		
		txtTelCom = new JTextField();
		txtTelCom.setBounds(10, 350, 80, 25);
		this.add(txtTelCom);
		
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
				CadastroCliente.this.dispose();
				janMeAbriu.setVisible(true);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String cidade = txtCity.getText();
				String uff = (String) uf.getSelectedItem();
				String cep = txtCep.getText();
				String end = txtEnd.getText();
				String num = txtNum.getText();
				int intNum = Integer.parseInt(num);
				String bairro = txtBairro.getText();
				String tel = txtTel.getText();
				String endCom = txtEndCom.getText();
				String numCom = txtNumEmp.getText();
				int intNumCom = Integer.parseInt(numCom);
				String bairroCom = txtBairroCom.getText();
				String telCom = txtTelCom.getText();
				
				Cliente robson = new Cliente(nome, cpf, cidade, uff, cep, end, intNum, bairro, tel, endCom, intNumCom, bairroCom, telCom);
				janMeAbriu.cadastroCliente.add(robson);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				txtNome.setText(null);
				txtCpf.setText(null);
				txtCity.setText(null);
				uf.setSelectedItem(null);
				txtCep.setText(null);
				txtEnd.setText(null);
				txtNum.setText(null);
				txtBairro.setText(null);
				txtTel.setText(null);
				txtEndCom.setText(null);
				txtNumEmp.setText(null);
				txtBairroCom.setText(null);
				txtTelCom.setText(null);
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ListarCliente listar = new ListarCliente(CadastroCliente.this);
				CadastroCliente.this.setVisible(false);
				
			}
		});
		
		
	}
}

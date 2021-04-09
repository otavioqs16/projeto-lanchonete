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

public class CadastroFuncionario extends JFrame{
	
	private JLabel title,ufc, dataEnt, nome, cpf, end, tel, contaBan, ag, conta, sal, num, bairro, city, cep, cargo;
	private JTextField txtNome, txtCpf, txtEnd, txtTel, txtAg, txtConta, txtSal, txtNum, txtBairro, txtCity, txtCep, txtCargo;
	private JButton btnVoltar, btnSalvar,btnListar;
	private JComboBox dia, mes, ano, uf;
	
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	
	public Menu janMeAbriu;
	
	public CadastroFuncionario(Menu meAbriu){
		this.setSize(800, 600);
		this.setTitle("Cadastro Funcionário");
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
		
		title = new JLabel("CADASTRO DE FUNCIONÁRIOS");
		title.setBounds(300, 10, 200, 25);
		this.add(title);
		
		dataEnt = new JLabel("Data de entrada na empresa");
		dataEnt.setBounds(10, 50, 200, 25);
		this.add(dataEnt);
		
		for(int i = 1; i < 32; i++){
			listDia.add(i);
		}
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 80, 50, 25);
		this.add(dia);
		
		for(int i = 1; i < 13; i++){
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 80, 60, 25);
		this.add(mes);
		
		for(int i = 2010; i < 2031; i++){
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 80, 80, 25);
		this.add(ano);
		
		nome = new JLabel("Nome");
		nome.setBounds(10, 120, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 140, 250, 25);
		this.add(txtNome);
		
		city = new JLabel("Cidade");
		city.setBounds(280, 120, 200, 25);
		this.add(city);
		
		txtCity = new JTextField();
		txtCity.setBounds(280, 140, 200, 25);
		this.add(txtCity);
		
		cep = new JLabel("CEP");
		cep.setBounds(280, 170, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField();
		txtCep.setBounds(280, 190, 80, 25);
		this.add(txtCep);
		
		cpf = new JLabel("CPF");
		cpf.setBounds(10, 170, 200, 25);
		this.add(cpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(10, 190, 110, 25);
		this.add(txtCpf);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 220, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField();
		txtEnd.setBounds(10, 240, 250, 25);
		this.add(txtEnd);
		
		num = new JLabel("Nº");
		num.setBounds(270, 220, 200, 25);
		this.add(num);
		
		txtNum = new JTextField();
		txtNum.setBounds(270, 240, 50, 25);
		this.add(txtNum);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 220, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(350, 240, 150, 25);
		this.add(txtBairro);
		
		contaBan = new JLabel("Conta Bancária");
		contaBan.setBounds(10, 270, 200, 25);
		this.add(contaBan);
		
		ag = new JLabel("Agência");
		ag.setBounds(10, 295, 80, 25);
		this.add(ag);
		
		txtAg = new JTextField();
		txtAg.setBounds(10, 315, 50, 25);
		this.add(txtAg);
		
		conta = new JLabel("Conta");
		conta.setBounds(80, 295, 200, 25);
		this.add(conta);
		
		txtConta = new JTextField();
		txtConta.setBounds(80, 315, 100, 25);
		this.add(txtConta);
		
		cargo = new JLabel("Cargo");
		cargo.setBounds(10, 345, 200, 25);
		this.add(cargo);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(10, 365, 150, 25);
		this.add(txtCargo);
		
		sal = new JLabel("Salário(R$)");
		sal.setBounds(200, 345, 200, 25);
		this.add(sal);
		
		tel = new JLabel("Telefone");
		tel.setBounds(300, 345, 100, 25);
		add(tel);
		
		txtTel = new JTextField();
		txtTel.setBounds(300, 365, 80, 25);
		add(txtTel);
		
		txtSal = new JTextField();
		txtSal.setBounds(200, 365, 60, 25);
		this.add(txtSal);
		
		ufc = new JLabel("UF");
		ufc.setBounds(400, 170, 50, 25);
		add(ufc);
		
		String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(400, 190, 50, 25);
		this.add(uf);
		
		
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
				CadastroFuncionario.this.dispose();
				janMeAbriu.setVisible(true);
				
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int diaa = dia.getSelectedIndex();
				int mess = mes.getSelectedIndex();
				int anoo = ano.getSelectedIndex();
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String cidade = txtCity.getText();
				String cep = txtCep.getText();
				String end = txtEnd.getText();
				String num = txtNum.getText();
				int intnum = Integer.parseInt(num);
				String bairro = txtBairro.getText();
				String ag = txtAg.getText();
				String conta = txtConta.getText();
				String cargo = txtCargo.getText();
				String sal = txtSal.getText();
				String tel = txtTel.getText();
				String uff = (String) uf.getSelectedItem();
				
				Funcionario walter = new Funcionario(diaa, mess, anoo, nome, cpf, cidade, cep, end, intnum, bairro, ag, conta, cargo, sal,tel, uff);
				janMeAbriu.cadastroFuncionario.add(walter);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				dia.setSelectedItem(null);
				mes.setSelectedItem(null);
				ano.setSelectedItem(null);
				txtNome.setText(null);
				txtCpf.setText(null);
				txtCity.setText(null);
				txtCep.setText(null);
				txtEnd.setText(null);
				txtNum.setText(null);
				txtBairro.setText(null);
				txtAg.setText(null);
				txtConta.setText(null);
				txtCargo.setText(null);
				txtSal.setText(null);
				txtTel.setText(null);
				uf.setSelectedItem(null);
				
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ListarFunc listar = new ListarFunc(CadastroFuncionario.this);
				CadastroFuncionario.this.setVisible(false);
				
			}
		});
	}
}

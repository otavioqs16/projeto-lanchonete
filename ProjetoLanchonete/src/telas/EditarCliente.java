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

public class EditarCliente extends JFrame{
	
	public ListarCliente janMeAbriu;
	
	private JLabel nome,cpf,end, num, tel, endCom, telCom, title, numEmp,bairro, city, ufc, cep, bairroCom;
	private JTextField txtNome, txtCpf, txtEnd, txtNum, txtTel, txtCity, txtCep,txtBairro, txtEndCom, txtTelCom, txtNumEmp, txtBairroCom;
	private int linhaSelec;
	private JComboBox uf;
	private JButton btnVoltar, btnSalvar, btnExcluir;
	
	public EditarCliente(ListarCliente meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Cliente");
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
		
		nome = new JLabel("Nome");
		nome.setBounds(10, 10, 200, 25);
		add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getNome());
		txtNome.setBounds(10, 30, 250, 25);
		add(txtNome);
		
		cpf = new JLabel("CPF");
		cpf.setBounds(10, 60, 200, 25);
		add(cpf);
		
		txtCpf = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getCpf());
		txtCpf.setBounds(10, 80, 110, 25);
		add(txtCpf);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 110, 200, 25);
		add(city);
		
		txtCity = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getCidade());
		txtCity.setBounds(10, 130, 200, 25);
		add(txtCity);
		
		ufc = new JLabel("UF");
		ufc.setBounds(220, 110, 50, 25);
		add(ufc);
		
		String[] estados = {(String)janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getUf(),"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 130, 50, 25);
		this.add(uf);
		
		cep = new JLabel("CEP");
		cep.setBounds(280, 110, 80, 25);
		add(cep);
		
		txtCep = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getCep());
		txtCep.setBounds(280, 130, 80, 25);
		add(txtCep);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 160, 200, 25);
		add(end);
		
		txtEnd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getEnd());
		txtEnd.setBounds(10, 180, 250, 25);
		add(txtEnd);
		
		num = new JLabel("Nº");
		num.setBounds(280, 160, 100, 25);
		add(num);
		
		txtNum = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getNum() + "");
		txtNum.setBounds(280, 180, 50, 25);
		add(txtNum);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 160, 200, 25);
		add(bairro);
		
		txtBairro = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getBairro());
		txtBairro.setBounds(350, 180, 150, 25);
		add(txtBairro);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 210, 200, 25);
		add(tel);
		
		txtTel = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getTel());
		txtTel.setBounds(10, 230, 80, 25);
		add(txtTel);
		
		endCom = new JLabel("Endereço comercial");
		endCom.setBounds(10, 260, 200, 25);
		add(endCom);
		
		txtEndCom = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getEndCom());
		txtEndCom.setBounds(10, 280, 250, 25);
		add(txtEndCom);
		
		numEmp = new JLabel("Nº");
		numEmp.setBounds(280, 260, 80, 25);
		add(numEmp);
		
		txtNumEmp = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getNumCom() + "");
		txtNumEmp.setBounds(280, 280, 50, 25);
		add(txtNumEmp);
		
		bairroCom = new JLabel("Bairro");
		bairroCom.setBounds(350, 260, 200, 25);
		add(bairroCom);
		
		txtBairroCom = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getBairroCom());
		txtBairroCom.setBounds(350, 280, 150, 25);
		add(txtBairroCom);
		
		telCom = new JLabel("Telefone comercial");
		telCom.setBounds(10, 310, 200, 25);
		add(telCom);
		
		txtTelCom = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).getTelCom());
		txtTelCom.setBounds(10, 330, 80, 25);
		add(txtTelCom);
		
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
				EditarCliente.this.dispose();
				ListarCliente listar = new ListarCliente(janMeAbriu.janMeAbriu);
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
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setCpf(cpf);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setCidade(cidade);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setUf(uff);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setCep(cep);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setEnd(end);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setNum(intNum);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setBairro(bairro);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setTel(tel);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setEndCom(endCom);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setNumCom(intNumCom);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setBairroCom(bairroCom);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.get(linhaSelec).setTelCom(telCom);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroCliente.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
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
	}
}

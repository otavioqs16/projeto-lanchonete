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

public class EditarFunc extends JFrame{
	
	public ListarFunc janMeAbriu;
	
	private JLabel title, dataEnt, nome, cpf, end, tel, contaBan, ag, conta, sal, num, bairro, city, cep, cargo, ufc;
	private JTextField txtNome, txtCpf, txtEnd, txtTel, txtAg, txtConta, txtSal, txtNum, txtBairro, txtCity, txtCep, txtCargo;
	private JComboBox dia, mes, ano;
	private int linhaSelec;
	private JComboBox uf;
	private JButton btnVoltar, btnSalvar, btnExcluir;
	private ArrayList<Integer> listDia = new ArrayList<Integer>();
	private ArrayList<Integer> listMes = new ArrayList<Integer>();
	private ArrayList<Integer> listAno = new ArrayList<Integer>();
	
	
	public EditarFunc(ListarFunc meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Funcionário");
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
		
		dataEnt = new JLabel("Data de entrada na empresa");
		dataEnt.setBounds(10, 10, 200, 25);
		this.add(dataEnt);
		
		int diaSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getDia();
		int posDia = 0;
		
		for(int i = 1; i < 32; i++){
			if ( i == diaSelec ) {
				posDia = i;
			}
			listDia.add(i);
		}
		
		/*
		 if ( ufSelec.equals( uf[i] ) {
		 	
		 }
		 */
		
		dia = new JComboBox(listDia.toArray());
		dia.setBounds(10, 30, 50, 25);
		dia.setSelectedIndex(posDia);
		this.add(dia);
		
		int mesSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getMes();
		int posMes = 0;
		for(int i = 1; i < 13; i++){
			if(i == mesSelec){
				posMes = i;
			}
			listMes.add(i);
		}
		
		mes = new JComboBox(listMes.toArray());
		mes.setBounds(80, 30, 60, 25);
		mes.setSelectedIndex(posMes);
		this.add(mes);
		
		int anoSelec = janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getAno();
		int posAno = 0;
		
		for(int i = 2010; i < 2031; i++){
			if(i == anoSelec){
				posAno = i;
			}
			listAno.add(i);
		}
		
		ano = new JComboBox(listAno.toArray());
		ano.setBounds(160, 30, 80, 25);
		ano.setSelectedIndex(posAno);
		this.add(ano);
		
		nome = new JLabel("Nome");
		nome.setBounds(10, 60, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getNome());
		txtNome.setBounds(10, 80, 250, 25);
		this.add(txtNome);
		
		city = new JLabel("Cidade");
		city.setBounds(280, 60, 200, 25);
		this.add(city);
		
		txtCity = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getCidade());
		txtCity.setBounds(280, 80, 200, 25);
		this.add(txtCity);
		
		cep = new JLabel("CEP");
		cep.setBounds(280, 110, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getCep());
		txtCep.setBounds(280, 130, 80, 25);
		this.add(txtCep);
		
		cpf = new JLabel("CPF");
		cpf.setBounds(10, 110, 200, 25);
		this.add(cpf);
		
		txtCpf = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getCpf());
		txtCpf.setBounds(10, 130, 110, 25);
		this.add(txtCpf);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 160, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getEnd());
		txtEnd.setBounds(10, 180, 250, 25);
		this.add(txtEnd);
		
		num = new JLabel("Nº");
		num.setBounds(270, 160, 200, 25);
		this.add(num);
		
		txtNum = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getNum() + "");
		txtNum.setBounds(270, 180, 50, 25);
		this.add(txtNum);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 160, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getBairro());
		txtBairro.setBounds(350, 180, 150, 25);
		this.add(txtBairro);
		
		contaBan = new JLabel("Conta Bancária");
		contaBan.setBounds(10, 210, 200, 25);
		this.add(contaBan);
		
		ag = new JLabel("Agência");
		ag.setBounds(10, 235, 80, 25);
		this.add(ag);
		
		txtAg = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getAg());
		txtAg.setBounds(10, 255, 50, 25);
		this.add(txtAg);
		
		conta = new JLabel("Conta");
		conta.setBounds(80, 235, 200, 25);
		this.add(conta);
		
		txtConta = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getConta());
		txtConta.setBounds(80, 255, 100, 25);
		this.add(txtConta);
		
		cargo = new JLabel("Cargo");
		cargo.setBounds(10, 285, 200, 25);
		this.add(cargo);
		
		txtCargo = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getCargo());
		txtCargo.setBounds(10, 315, 150, 25);
		this.add(txtCargo);
		
		sal = new JLabel("Salário(R$)");
		sal.setBounds(200, 285, 200, 25);
		this.add(sal);
		
		txtSal = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getSal());
		txtSal.setBounds(200, 315, 60, 25);
		this.add(txtSal);
		
		tel = new JLabel("Telefone");
		tel.setBounds(300, 285, 100, 25);
		add(tel);
		
		txtTel = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getTel());
		txtTel.setBounds(300, 315, 80, 25);
		add(txtTel);
		
		ufc = new JLabel("UF");
		ufc.setBounds(400, 110, 50, 25);
		add(ufc);
		
		String[] estados = {janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).getUf(), "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(400, 130, 50, 25);
		this.add(uf);
		
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
				EditarFunc.this.dispose();
				ListarFunc listar = new ListarFunc(janMeAbriu.janMeAbriu);
				
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
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setDia(diaa);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setMes(mess);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setAno(anoo);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setCpf(cpf);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setCidade(cidade);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setCep(cep);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setEnd(end);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setNum(intnum);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setBairro(bairro);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setAg(ag);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setConta(conta);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setCargo(cargo);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setSal(sal);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setTel(tel);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.get(linhaSelec).setUf(uff);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroFuncionario.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
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
	}
}

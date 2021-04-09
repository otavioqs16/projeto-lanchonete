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

public class EditarEmpresa extends JFrame{
	
	public ListarEmpresa janMeAbriu;
	
	private JLabel cnpj, nome, nomeFant, tel, nomeDono, site, end,cep, num, bairro, ufc, city;
	private JTextField txtCnpj, txtNome, txtNomeFant, txtTel, txtNomeDono, txtCep, txtSite, txtCity, txtBairro, txtEnd, txtNum;
	private int linhaSelec;
	private JComboBox uf;
	private JButton btnVoltar, btnSalvar, btnExcluir;
	
	public EditarEmpresa(ListarEmpresa meAbriu, int plinhaSelec){
		this.setSize(600, 500);
		this.setTitle("Editar Empresa");
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
		
		nome = new JLabel("Razão Social");
		nome.setBounds(10, 10, 200, 25);
		this.add(nome);
		
		txtNome = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getNome());
		txtNome.setBounds(10, 30, 250, 25);
		this.add(txtNome);
		
		nomeFant = new JLabel("Nome Fantasia");
		nomeFant.setBounds(10, 60, 200, 25);
		this.add(nomeFant);
		
		txtNomeFant = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getNomeFant());
		txtNomeFant.setBounds(10, 80, 250, 25);
		this.add(txtNomeFant);
		
		cnpj = new JLabel("CNPJ");
		cnpj.setBounds(10, 110, 200, 25);
		this.add(cnpj);
		
		txtCnpj = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getCnpj());
		txtCnpj.setBounds(10, 130, 110, 25);
		this.add(txtCnpj);
		
		nomeDono = new JLabel("Nome proprietário");
		nomeDono.setBounds(10, 160, 200, 25);
		this.add(nomeDono);
		
		txtNomeDono = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getDono());
		txtNomeDono.setBounds(10, 180, 250, 25);
		this.add(txtNomeDono);
		
		city = new JLabel("Cidade");
		city.setBounds(10, 210, 200, 25);
		this.add(city);
		
		txtCity = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getCity());
		txtCity.setBounds(10, 230, 200, 25);
		this.add(txtCity);
		
		ufc = new JLabel("UF");
		ufc.setBounds(220, 210, 40, 25);
		this.add(ufc);
		
		String[] estados = {janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getUf(),"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
		uf = new JComboBox(estados);
		uf.setBounds(220, 230, 50, 25);
		this.add(uf);
		
		end = new JLabel("Endereço");
		end.setBounds(10, 260, 200, 25);
		this.add(end);
		
		txtEnd = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getEnd());
		txtEnd.setBounds(10, 280, 250, 25);
		this.add(txtEnd);
		
		cep = new JLabel("CEP");
		cep.setBounds(290, 210, 200, 25);
		this.add(cep);
		
		txtCep = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getCep());
		txtCep.setBounds(290, 230, 80, 25);
		this.add(txtCep);
		
		bairro = new JLabel("Bairro");
		bairro.setBounds(350, 260, 200, 25);
		this.add(bairro);
		
		txtBairro = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getBairro());
		txtBairro.setBounds(350, 280, 150, 25);
		this.add(txtBairro);
		
		num = new JLabel("Nº");
		num.setBounds(280, 260, 200, 25);
		this.add(num);
		
		txtNum = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getNum() + "");
		txtNum.setBounds(280, 280, 50, 25);
		this.add(txtNum);
		
		tel = new JLabel("Telefone");
		tel.setBounds(10, 310, 200, 25);
		this.add(tel);
		
		txtTel = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getTel());
		txtTel.setBounds(10, 330, 80, 25);
		this.add(txtTel);
		
		site = new JLabel("Site");
		site.setBounds(100, 310, 200, 25);
		this.add(site);
		
		txtSite = new JTextField(janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).getSite());
		txtSite.setBounds(100, 330, 250, 25);
		this.add(txtSite);
		
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
				EditarEmpresa.this.dispose();
				ListarEmpresa listar = new ListarEmpresa(janMeAbriu.janMeAbriu);
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
				
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setNome(nome);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setNomeFant(nomeFant);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setCnpj(cnpj);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setDono(dono);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setCity(city);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setEnd(end);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setCep(cep);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setBairro(bairro);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setUf(uff);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setNum(intNum);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setTel(tel);
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.get(linhaSelec).setSite(site);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
				
				
			}
		});
		
		
		
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				janMeAbriu.janMeAbriu.janMeAbriu.cadastroEmpresa.remove(linhaSelec);
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
				
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
	}
}

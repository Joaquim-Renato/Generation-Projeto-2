package Projeto;
import java.util.Scanner;

 public class Cadastro extends LojaOnline{
	
		private String pagamento;
		private String ID;
		
	boolean confirmarCadastro() {
	
	Scanner ler = new Scanner (System.in);
	boolean cadastrar;
	int pergunta; 
	int pergunta2;
		
		
		
		
		
		
		System.out.println("Deseja se cadastrar ?: |1|Sim|2|N�o ");
		pergunta = ler.nextInt();
	
	
		
		if(pergunta == 1) {
		
			cadastrar = true;
		
		}else {
			
			System.out.println("Cliente n�o desejou se cadastrar");
			cadastrar = false;
		}
		
	return cadastrar;
	
	
}
	
	void cadastrando(){
		
		Scanner ler = new Scanner(System.in);
			if (this.confirmarCadastro() == true) {
			System.out.println("Digite o usu�rio: ");
			String usuario1 = ler.nextLine();
			this.setUsuario(usuario1);
			
			System.out.println("Digite a senha: ");
			String senha1 = ler.nextLine();
			this.setSenha(senha1);
			
	
			System.out.println("Usuario: " + this.getUsuario());
			System.out.println("Senha: "+ this.getSenha());
			System.out.println("Bem vindo!");
			}

		
	
	}
		  
		  
		 












	public String getPagamento() {
		return pagamento;
	}









	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}




	
	
}


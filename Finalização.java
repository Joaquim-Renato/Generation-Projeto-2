package Projeto;

public class Finaliza��o {
	
	public static void main(String[] args) {
		Cadastro c = new Cadastro();
		Pagamento p = new Pagamento();
		
		
		if (c.confirmarCadastro() == true) {
			c.cadastrando();
			c.Concluido();
			
		}else {
			System.out.println("Cliente n�o aceitou");
		}
		
		System.out.println("Usu�rio: "+c.getUsuario());
		System.out.println("Senha: "+c.getSenha());
			
		}
		
	}
	
	
	
	


package Projeto;

import java.util.Scanner;

public class Pagamento extends LojaOnline{
	
	Scanner ler = new Scanner(System.in);
	Cadastro c = new Cadastro();
	
	
	
	boolean Logar() {
		
		String Senha;
		String usuario;
		
		System.out.println("Digite seu usuario: ");
		usuario = ler.nextLine();
		System.out.println("Digite sua senha para confirmar a compra: ");
		Senha = ler.nextLine();
		
				
		if (Senha == c.getSenha() && usuario == c.getUsuario()) {
			
			System.out.println("Voc� est� logado!Pode prosseguir com suas compras...");
		}else {
			
			System.out.println("Usu�rio ou senha incorreto.Digite novamente.");
		}
		
		return true;
	}



	

}

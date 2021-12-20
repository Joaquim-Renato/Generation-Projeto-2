package Projeto;


	
	import java.util.Scanner;

	import javax.swing.JOptionPane;

	public class Compra extends LojaOnline {

		void FazendoPagamento() {
			
			// ATRIBUTOS
			
			String dataValidade;
			String cpf;
			String nome;
			String sobrenome;
			String email;
			String whatsapp;
			String cep;
			String endere�o;
			
			int cartao = 1, boleto = 2, pix = 3;
			int formaPagamento = 0, numeroCartao1, numeroCartao2, numeroCartao3, numeroCartao4, codigoSeguranca;
			
			// INTERA��O
			
			Scanner ler = new Scanner(System.in);
			
		
			Pagamento p = new Pagamento();
			
			
			
			
			System.out.println(
			
					"==========================" + "\n       Generation Outlet\n          Pagamento"+"\n==========================");
			System.out.println("=   Agora vamos para a parte final, ok?   =");
		
			System.out.println("Para escolher uma forma de pagamento, por favor:");
			System.out.println("Selecione |1| para CART�O:");
			System.out.println("Selecione |2| para BOLETO:");
			System.out.println("Selecione |3| para PIX:");
			formaPagamento = ler.nextInt();
			System.out.println();
			
			// PAGAMENTO CART�O
			
			if (formaPagamento == cartao) {
				
				System.out.println("Vamos te encaminhar para as informa��es sobre o cart�o!");
				System.out.println();
				System.out.println("Insira os primeiros 4 n�meros do cart�o:");
				numeroCartao1 = ler.nextInt();
				System.out.println("Insira os pr�ximos 4 n�meros do cart�o:");
				numeroCartao2 = ler.nextInt();
				System.out.println("Insira os pr�ximos 4 n�meros do cart�o:");
				numeroCartao3 = ler.nextInt();
				System.out.println("Insira os 4 �ltimos n�meros do cart�o:");
				numeroCartao4 = ler.nextInt();
				System.out.println("Insira a data de validade (m�s/ano):");
				dataValidade = ler.next();
				System.out.println("Insira o c�digo de seguran�a:");
				codigoSeguranca = ler.nextInt();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("O n�mero do seu cart�o �:");
				System.out.println(numeroCartao1 + " - " + numeroCartao2 + " - " + numeroCartao3 + " - " + numeroCartao4);
				System.out.println("Data de validade: " + dataValidade);
				System.out.println("C�digo de seguran�a: " + codigoSeguranca);
				System.out.println();
				System.out.println("Aguarde a confirma��o do pagamento...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("Pagamento processado e aprovado!");
			}
			
			// PAGAMENTO BOLETO

			if (formaPagamento == boleto) {

				System.out.println("Devido �s novas regulamenta��es, agora � necess�rio solicitar o CPF ao gerar o boleto/QR Code.");
				System.out.println("Isso tornar� o ambiente de compra mais seguro!");
				System.out.println();
				System.out.println("Digite o seu CPF:");
				cpf = ler.next();
				System.out.println("Digite seu primeiro nome:");
				nome = ler.next();
				System.out.println("Digite seu sobrenome:");
				sobrenome = ler.next();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("CPF: " + cpf + "\nNome: " + nome + " " + sobrenome);
				System.out.println();
				System.out.println("Digite o seu email para recebimento do boleto:");
				email = ler.next();
				System.out.println();
				System.out.println("Sua compra foi efetuada com sucesso!");
				System.out.println("Valor: " /*, <TOTAL>*/);
				System.out.println("O boleto ser� enviado ao email: " + email);
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("Boleto gerado com sucesso!");
				System.out.println("Enviamos para o seu email (Confira tamb�m a sua caixa de Spam!)");
				System.out.println("O prazo de vencimento do pagamento � de 2 dias �teis");
				
			}
			
			// PAGAMENTO PIX
			
			if (formaPagamento == pix) {

				System.out.println("Devido �s novas regulamenta��es, agora � necess�rio solicitar o CPF ao gerar o boleto/QR Code.");
				System.out.println("Isso tornar� o ambiente de compra mais seguro!");
				System.out.println();
				System.out.println("Digite o seu CPF:");
				cpf = ler.next();
				System.out.println("Digite seu primeiro nome:");
				nome = ler.next();
				System.out.println("Digite seu sobrenome:");
				sobrenome = ler.next();
				System.out.println("Digite o seu n�mero de telefone para recebimento do c�digo PIX:");
				whatsapp = ler.next();
				System.out.println();
				System.out.println("Confirmando...");
				System.out.println();
				System.out.println("CPF: " + cpf + "\nNome: " + nome + " " + sobrenome + "\nTelefone: " + whatsapp);
				
				System.out.println();
				System.out.println("...");
				
				System.out.println();
				System.out.println("...");
			
				System.out.println();
				System.out.println("QR Code enviado via WhatsApp!");
				System.out.println("O prazo de vencimento do pagamento � de 2 dias �teis");

			}
			
		
			System.out.println("Obrigado por comprar conosco!");
			
			// ENTREGA
	        
	        System.out.println();
	        System.out.println("Muito bem! Agora vamos para a parte de entrega, ok?");
	        System.out.println();
	        System.out.println("Digite o seu CEP:");
	        cep = ler.next();
	        System.out.println("Digite o seu endere�o:");
	        endere�o = ler.nextLine();
	        System.out.println();
			System.out.println("Confirmando...");
			System.out.println();
	        System.out.println("O seu pedido ser� enviado para o CEP: " + cep);        
	        System.out.println("Endere�o: " + endere�o);
	        System.out.println();
	        this.Concluido();
	        
		}

		@Override
		void Concluido() {
			System.out.println("Parab�ns! Frete gratis para a primeira compra :");
	        System.out.println("O pedido ser� enviado para o seu endere�o em at� 5 dias �teis");
	        System.out.println("Volte sempre!");
			
		}
		
	}

	




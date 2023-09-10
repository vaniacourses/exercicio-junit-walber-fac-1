package carrinho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;


public class CarrinhoTest {
	
	Produto livro1;
	Produto livro2;
	Produto livro3;
	Carrinho carrinho;
	
	@BeforeEach
	public void inicializa() {
		livro1 = new Produto("Teste de Software", 100.00);
		livro2 = new Produto("Teste", 50.00);
		livro3 = new Produto("Software", 60.00);
	};
		
		@Test
		public void testCriaCarrinhoo() {
			Carrinho cart = new Carrinho();
			cart.addItem(livro1);
			cart.addItem(livro2);
			cart.addItem(livro3);
			int num = cart.getQtdeItems();
			
			Assertions.assertEquals(3, num);
			
		}
		
	

}


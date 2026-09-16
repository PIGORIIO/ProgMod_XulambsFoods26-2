import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {
    
    @Test
    public void naoAdicionaPizzaEmPedidoFechado(){
        //Arrange
        Pedido pedido = new Pedido();
        pedido.adicionarPizza(new Pizza());
        pedido.fecharPedido();

        //Act
        int quantidade = pedido.adicionarPizza(new Pizza());
    
        //Assert
        assertEquals(1, quantidade);
    }

    @Test 
    public void ContaApagarComUmaPizza(){
        Pedido pedido = new Pedido();
        pedido.adicionarPizza(new Pizza());

        double papel = pedido.precoAPagar();

        assertEquals(29, papel, 0.01);


    }

    @Test 
    public void ContaApagarComMaisPizza(){
        Pedido pedido = new Pedido();
        Pizza comIngredientes = new Pizza(2);
        pedido.adicionarPizza(comIngredientes);

        double preco = pedido.precoAPagar();

        assertEquals(39, preco, 0.01);


    }


}

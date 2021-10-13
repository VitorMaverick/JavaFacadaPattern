package cenarioPedido;



import cenarioPedido.pedido.GeraPedido;
import cenarioPedido.pedido.GeraPedidoHandler;
import cenarioPedido.pedido.acoes.CriarPedidoNoBanco;
import cenarioPedido.pedido.acoes.EnviarPedidoPorEmail;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco()));
		handler.executar(gerador);
	}

}

package cenarioPedido.pedido.acoes;


import cenarioPedido.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
	}

}

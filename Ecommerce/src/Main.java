import controller.Pedido;
import model.Produto;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setIdProduto(UUID.randomUUID().toString());
        p.setNome("TV 4K LG 50'");
        p.setQuantidade(500);
        p.setValorUnitario(1500.99);

        String idPedido = UUID.randomUUID().toString();
        String idCliente = UUID.randomUUID().toString();
        Pedido pedido = new Pedido(idPedido,idCliente,p,0,5);

        System.out.println("Dados do pedido");
        System.out.println("Produto:"+p.getNome());
        System.out.println("Cliente:"+pedido.getIdCliente());
        System.out.println("Valor total do pedido"+pedido.getValorTotal());
    }
}

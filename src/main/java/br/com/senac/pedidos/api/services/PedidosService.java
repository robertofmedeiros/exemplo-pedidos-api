package br.com.senac.pedidos.api.services;

import br.com.senac.pedidos.api.dtos.pedidos.PedidosRequest;
import br.com.senac.pedidos.api.dtos.pedidos.PedidosResponse;
import br.com.senac.pedidos.api.entitys.Pedidos;
import br.com.senac.pedidos.api.repositorys.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    public PedidosResponse criarPedido(PedidosRequest pedido) {
        Pedidos result = pedidosRepository.save(this.pedidosRequestToPedidos(pedido));

        return this.pedidosToPedidosResponse(result);
    }

    public List<PedidosResponse> listarPedidos() {
        List<PedidosResponse> result = pedidosRepository.findAll()
                .stream()
                .map(this::pedidosToPedidosResponse)
                .toList();

        return result;
    }

    private Pedidos pedidosRequestToPedidos(PedidosRequest in){
        Pedidos out = new Pedidos();
        out.setNomeCliente(in.getNomeCliente());
        out.setValorTotal(in.getValorTotal());
        out.setValorItens(in.getValorItens());

        return out;
    }

    private PedidosResponse pedidosToPedidosResponse(Pedidos in){
        PedidosResponse out = new PedidosResponse();
        out.setCodigoPedido(in.getCodigoPedido());
        out.setId(in.getId());
        out.setNomeCliente(in.getNomeCliente());
        out.setValorTotal(in.getValorTotal());
        out.setValorItens(in.getValorItens());

        return out;
    }
}

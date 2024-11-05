package br.com.senac.pedidos.api.controllers;

import br.com.senac.pedidos.api.dtos.pedidos.PedidosRequest;
import br.com.senac.pedidos.api.dtos.pedidos.PedidosResponse;
import br.com.senac.pedidos.api.services.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @PostMapping("/")
    public ResponseEntity<?> criarPedido(@RequestBody PedidosRequest pedidosRequest) {
        return ResponseEntity.status(201).body(pedidosService.criarPedido(pedidosRequest));
    }
    @GetMapping("/")
    public ResponseEntity<?> listarPedido() {
        List<PedidosResponse> result = pedidosService.listarPedidos();
        int statusCode = result.isEmpty() ? 204 : 200;

        return ResponseEntity.status(statusCode).body(result);
    }

}

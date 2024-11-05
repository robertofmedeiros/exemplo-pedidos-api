package br.com.senac.pedidos.api.dtos.pedidos;

public class PedidosResponse {
    private Long id;

    private String codigoPedido;

    private String nomeCliente;

    private Double valorItens;

    private Double valorTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValorItens() {
        return valorItens;
    }

    public void setValorItens(Double valorItens) {
        this.valorItens = valorItens;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

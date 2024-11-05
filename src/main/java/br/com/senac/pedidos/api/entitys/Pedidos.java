package br.com.senac.pedidos.api.entitys;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigoPedido = "PED" + UUID.randomUUID().toString();

    @Column(nullable = false)
    private String nomeCliente;

    @Column(nullable = false)
    private Double valorItens;

    @Column(nullable = false)
    private Double valorTotal;

    @OneToMany(mappedBy = "pedido")
    private List<PedidosPagamentos> pagamentos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<PedidosPagamentos> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<PedidosPagamentos> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
}

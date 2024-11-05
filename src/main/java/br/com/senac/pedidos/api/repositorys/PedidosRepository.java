package br.com.senac.pedidos.api.repositorys;

import br.com.senac.pedidos.api.entitys.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long> {
}

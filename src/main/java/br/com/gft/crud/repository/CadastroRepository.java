package br.com.gft.crud.repository;

import br.com.gft.crud.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Cadastro,Long> {
}

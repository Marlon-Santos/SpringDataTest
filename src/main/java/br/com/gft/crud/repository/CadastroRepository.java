package br.com.gft.crud.repository;

import br.com.gft.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<User,Long> {
}

package gomesmatheus.com.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gomesmatheus.com.github.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}

package Reto3.Reto3.repositorios;

import Reto3.Reto3.entidades.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository<Client, Integer> {
}

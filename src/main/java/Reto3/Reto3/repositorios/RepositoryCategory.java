package Reto3.Reto3.repositorios;

import Reto3.Reto3.entidades.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategory extends JpaRepository<Category, Integer> {
}

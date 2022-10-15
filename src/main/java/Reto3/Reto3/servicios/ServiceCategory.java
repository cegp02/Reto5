package Reto3.Reto3.servicios;

import Reto3.Reto3.entidades.Category;
import Reto3.Reto3.repositorios.RepositoryCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategory {
    @Autowired
    private RepositoryCategory rc;

    public List<Category> allCategory(){
        return  rc.findAll();
    }

    public Category saveCategory(Category cat){
        return rc.save(cat);
    }

    public Category updateCategory(Category cat){
        return  rc.save(cat);
    }

    public void deleteCategory(Category cat){
        rc.delete(cat);
    }

    public Category findCategoryById(Integer doc){
        return  rc.findById(doc).get();
    }

    public void deleteCategoryById(Integer doc){
        rc.deleteById(doc);
    }

}

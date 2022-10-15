package Reto3.Reto3.controladores;

import Reto3.Reto3.entidades.Category;
import Reto3.Reto3.servicios.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class ControllerCategory {
    @Autowired
    private ServiceCategory sc;

    @GetMapping("/all")
    public List<Category> getCategoryAll(){
        return sc.allCategory();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED) //Status Code 201.
    public Category insertCategory(@RequestBody Category cat) {
        return sc.saveCategory(cat);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestBody Category cat){
        return sc.updateCategory(cat);
    }

    @DeleteMapping
    public void deleteCategory(@RequestBody Category cat){
        sc.deleteCategory(cat);
    }

    @GetMapping("/{doc}")
    public Category findCategoryById(@PathVariable("doc")int doc){
        return sc.findCategoryById(doc);
    }

    @DeleteMapping("/{doc}")
    public void deleteCategoryById(@PathVariable("doc") int doc){
        sc.deleteCategoryById(doc);
    }
}

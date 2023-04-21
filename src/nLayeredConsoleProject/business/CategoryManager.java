package nLayeredConsoleProject.business;

import nLayeredConsoleProject.core.logging.Logger;
import nLayeredConsoleProject.dataAccess.CategoryDao;
import nLayeredConsoleProject.entities.Category;

import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Logger> loggers;
    private Category category ;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, Category category, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.category = category;
        this.categories = categories;
    }

    public void add() throws Exception{

        for (Category categories : categories){
            if(categories.getName() == category.getName())
            {
                throw new Exception("aynı isimde kategori mevcut");
            }else {
                categoryDao.addCategory(category);
            }
        }
    }
}

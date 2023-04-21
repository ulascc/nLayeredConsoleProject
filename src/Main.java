import nLayeredConsoleProject.business.CategoryManager;
import nLayeredConsoleProject.business.CourseManager;
import nLayeredConsoleProject.business.InstructorManager;
import nLayeredConsoleProject.core.logging.FileLogger;
import nLayeredConsoleProject.core.logging.Logger;
import nLayeredConsoleProject.core.logging.MailLogger;
import nLayeredConsoleProject.dataAccess.HibernateDatabase;
import nLayeredConsoleProject.dataAccess.JdbcDatabase;
import nLayeredConsoleProject.entities.Category;
import nLayeredConsoleProject.entities.Course;
import nLayeredConsoleProject.entities.Instructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new LinkedList<>();
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        Course course1 = new Course(1,"java", 100);
        Course course2 = new Course(2, "C#", 80);
        Category category1 = new Category(1,"programlama");
        Category category2 = new Category(2, "siber güvenlik");
        Instructor instructor1 = new Instructor(1,"Ulaş");
        Instructor instructor2 = new Instructor(2,"Engin");

        List<Course> courses = new LinkedList<>();
        courses.add(course1);
        List<Category> categories = new LinkedList<>();
        categories.add(category1);
        List<Instructor> instructors = new LinkedList<>();
        instructors.add(instructor1);

       CourseManager courseManager = new CourseManager(new JdbcDatabase(), loggers, course2, courses);
       courseManager.add();
       CategoryManager categoryManager = new CategoryManager(new HibernateDatabase(), loggers, category2, categories);
       categoryManager.add();
       InstructorManager instructorManager = new InstructorManager(new HibernateDatabase(), loggers, instructor2, instructors);
       instructorManager.add();

    }
}
package nLayeredConsoleProject.dataAccess;

import nLayeredConsoleProject.entities.Category;
import nLayeredConsoleProject.entities.Course;
import nLayeredConsoleProject.entities.Instructor;


public class HibernateDatabase implements CategoryDao, CourseDao, InstructorDao{

    @Override
    public void addCourse(Course course) {
        System.out.println("course addes with hibernate");
    }


    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("instructor addes with hibernate");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println("category addes with hibernate");
    }
}

package nLayeredConsoleProject.dataAccess;

import nLayeredConsoleProject.entities.Category;
import nLayeredConsoleProject.entities.Course;
import nLayeredConsoleProject.entities.Instructor;

public class JdbcDatabase implements CategoryDao, CourseDao, InstructorDao{


    @Override
    public void addCategory(Category category) {
        System.out.println("category addes with JDBC");
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println("instructor addes with JDBC");
    }
    @Override
    public void addCourse(Course course) {
        System.out.println("course addes with JDBC");
    }


}

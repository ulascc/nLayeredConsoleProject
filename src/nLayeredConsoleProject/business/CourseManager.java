package nLayeredConsoleProject.business;

import nLayeredConsoleProject.core.logging.Logger;
import nLayeredConsoleProject.dataAccess.CourseDao;
import nLayeredConsoleProject.entities.Course;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private List<Logger> loggers;
    private Course course;
    private List<Course> courses;


    public CourseManager(CourseDao courseDao, List<Logger> loggers, Course course, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.course = course;
        this.courses = courses;
    }

    public void add() throws Exception {

        for (Course courses : courses){
            if(courses.getName() == course.getName() || course.getPrice()<0)
            {
                throw new Exception("bu kurs ismi daha önceden alınmış veya fiyatı 0TL'den az...");
            }else
            {
                courseDao.addCourse(course);
                for (Logger loggers : loggers){
                    loggers.log();
                }
            }
        }

    }

}


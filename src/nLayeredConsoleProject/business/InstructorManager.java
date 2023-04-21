package nLayeredConsoleProject.business;

import nLayeredConsoleProject.core.logging.Logger;
import nLayeredConsoleProject.dataAccess.InstructorDao;
import nLayeredConsoleProject.entities.Course;
import nLayeredConsoleProject.entities.Instructor;

import java.util.List;

public class InstructorManager {

    private InstructorDao instructorDao;
    private List<Logger> loggers;
    private Instructor instructor;
    private List<Instructor> instructors;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers, Instructor instructor, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
        this.instructor = instructor;
        this.instructors = instructors;
    }

    public void add() throws Exception{

        for (Instructor instructors : instructors){
            if (instructors.getName() == instructor.getName()){
                throw new Exception("bu eğitmen zaten var");
            }else{
                instructorDao.addInstructor(instructor);
            }
        }

    }
}

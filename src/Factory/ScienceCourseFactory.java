package Factory;

import Composite.Course;
import Composite.ScienceCourse;

public class ScienceCourseFactory implements CourseFactory {
    public Course createCourse() {
        return new ScienceCourse();
    }
}

package Factory;

import Composite.Course;
import Composite.MathCourse;

public class MathCourseFactory implements CourseFactory {
    public Course createCourse() {
        return new MathCourse();
    }
}


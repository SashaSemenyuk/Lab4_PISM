import Builder.ControlElementBuilder;
import Builder.SystemControlElementBuilder;
import Facade.EducationalAppFacade;
import Factory.MathCourseFactory;
import TemplateMethods.Algorithm1;
import TemplateMethods.Algorithm2;
import Visitor.ProgressVisitor;
import Visitor.StudentProgress;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Algorithm1 algorithm1 = new Algorithm1();
        Algorithm2 algorithm2 = new Algorithm2();
        StudentProgress studentProgress = new StudentProgress();
        ProgressVisitor progressVisitor = new ProgressVisitor();
        MathCourseFactory mathCourseFactory = new MathCourseFactory();
        SystemControlElementBuilder systemControlElementBuilder = new SystemControlElementBuilder();
        ControlElementBuilder controlElementBuilder = new ControlElementBuilder() {
            @Override
            public void buildTest() {

            }

            @Override
            public void buildLesson() {

            }
        };
        EducationalAppFacade educationalAppFacade = new EducationalAppFacade(controlElementBuilder);
    }
}
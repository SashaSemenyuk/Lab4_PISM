package Facade;

import Builder.ControlElementBuilder;

public class EducationalAppFacade {
    private ControlElementBuilder controlElementBuilder;

    public EducationalAppFacade(ControlElementBuilder controlElementBuilder) {
        this.controlElementBuilder = controlElementBuilder;
    }

    public void generateElements() {
        controlElementBuilder.buildTest();
        controlElementBuilder.buildLesson();
    }
}


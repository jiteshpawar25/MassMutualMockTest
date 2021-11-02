package com.automation.steps;

import com.automation.pages.ExercisePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ExercisePageSteps {
    ExercisePage exercisepage = new ExercisePage();

    @Given("^User is on exercise of the application$")
    public void userIsOnExercisePage() {
        exercisepage.verifyuserIsOnExercisePage();
    }

    @When("^User navigates to Value page$")
    public void verifyUserIsonValuePage() {
        exercisepage.navigateToValuePage();
    }
}

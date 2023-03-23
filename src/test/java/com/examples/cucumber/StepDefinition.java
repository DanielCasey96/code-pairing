package com.examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {


    @Given("I have an input of (\\d+) and (\\d+)$")
        public void setUp(int first, int second) {
    }

    @When("I add them$")
        public int addition(int first, int second) {
    }

}

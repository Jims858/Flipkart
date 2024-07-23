package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\java_Nelson\\Assessment01\\src\\test\\resources\\FeatureFile"
							,glue="org.stepdefi")

public class TestRunner {

}

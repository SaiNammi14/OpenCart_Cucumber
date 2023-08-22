package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
               // features= {".//Features/"}, //for all feature files
                //features= {".//Features/Login.feature"},
                features= {".//Features/LoginDDT.feature"},
               //features= {".//Features/LoginDDTExcel.feature"},
                //features= {".//Features/Login.feature",".//Features/AccountRegistration.feature"},//for multiple feature files
                //features="@target/rerun.txt",   // Runs only failures
                glue="stepDefinitions",
                plugin= {"pretty",
                        "html:reports/myreport.html",
                        "json:reports/myreport.json",
                        "rerun:target/rerun.txt",    //Mandatory to capture failures
                },
                dryRun=false,//if it is false then it will do actual test(opening in browser)...if it is true , it will check whether every step has defintion or not in the setpDefifnitions file.
                monochrome=true//to elimnate specl characters/junk from console.
                //tags = "@sanity"	//Scenarios tagged with @sanity,
                //tags = "@sanity and @regression"	//Scenarios tagged with both @sanity and @regression
                //tags = "@sanity or @regression"	 //Scenarios tagged with either @sanity or @regression
                //tags = "@sanity and not @regression", //Scenarios tagged with @sanity but not tagged with @regression

        )

public class TestRunner {

}


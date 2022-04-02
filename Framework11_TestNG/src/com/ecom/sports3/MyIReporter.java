package com.ecom.sports3;
import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class MyIReporter implements IReporter {

    public void generateReport(List<XmlSuite> lstAllXmlSuites,
                               List<ISuite> lstIsuites,
                               String sOutputDirectory)
    {
        //  Iterate on each individual suite used
        for (ISuite oneIsuite : lstIsuites) {

            // Get the suite name
            String suiteName = oneIsuite.getName();

            // Get pass/ fail/ skip results for each suite
            Map<String, ISuiteResult> allSuiteResults = oneIsuite.getResults();
            for (ISuiteResult oneSuiteResult : allSuiteResults.values()) {
                ITestContext testContext = oneSuiteResult.getTestContext();
                System.out.println("Passed tests for this suite  '" + suiteName + "' is:" + testContext.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for this suite  '" + suiteName + "' is:" + testContext.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for this suite '" + suiteName + "' is:" + testContext.getSkippedTests().getAllResults().size());
            }
        }
        System.out.println("Output folder" + sOutputDirectory);
    }
}

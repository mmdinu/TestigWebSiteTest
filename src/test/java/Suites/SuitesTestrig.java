package Suites;


import Tests.*;
import WebAutomation.WebAutomationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({HomePage.class, ServicePage.class, RequirementForm.class, DomainsPage.class, HireQAPage.class, BlogPage.class, WebAutomationTest.class})

public class SuitesTestrig {
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.barclays.lar;

import org.junit.Test;
import static org.junit.Assert.*;

public class GatewayServiceTest {
    @Test public void testAppHasAGreeting() {
        GatewayService classUnderTest = new GatewayService();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}

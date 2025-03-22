package Karate.Demo;

import com.intuit.karate.junit5.Karate;

public class Test {
    @Karate.Test
    Karate testAll() {
        return Karate.run("Test.feature").relativeTo(getClass());
    }
}
package week2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import week2.task1.Task1Test;
import week2.task2.FractionTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Task1Test.class,
        FractionTest.class
})
public class Week2Test {
}

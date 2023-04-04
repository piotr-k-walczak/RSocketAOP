import com.github.piotrkwalczak.rsocket.benchmark.MarkedMessage;
import com.github.piotrkwalczak.rsocket.benchmark.annotation.RSocketLatencyBenchmark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkedMessageTests {

    private static class TestClass {

        @RSocketLatencyBenchmark
        public String someString() {
            return "Some String";
        }
    }

    @Test
    public void someString_shouldReturnMarkedMessage() {
        TestClass testClass = new TestClass();
        assertEquals(testClass.someString() instanceof MarkedMessage<?>);
    }
}

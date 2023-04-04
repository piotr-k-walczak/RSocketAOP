import com.github.piotrkwalczak.rsocket.benchmark.ExampleClass;
import com.github.piotrkwalczak.rsocket.benchmark.Wrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = { ExampleClassTest.ExampleClassTestConfig.class })
public class ExampleClassTest {

    @Autowired
    private ExampleClass exampleClass;

    @Test
    public void testGetValue() {
        String result = (String) exampleClass.getValue();
        assertEquals("Hello, World!", result);
    }

    @Configuration
    @Import(ExampleClass.class)
    static class ExampleClassTestConfig {}
}
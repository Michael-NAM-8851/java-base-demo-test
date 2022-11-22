package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test void shoud_return_20(){
        BaseDemo baseDemo = new BaseDemo();

        int expected = 20;
        assertEquals(expected, baseDemo.sum(15,5));
    }

    @Test void shoud_return_25(){
        BaseDemo baseDemo = new BaseDemo();

        int expected = 25;
        assertEquals(expected, baseDemo.sum(15,10));
    }
}

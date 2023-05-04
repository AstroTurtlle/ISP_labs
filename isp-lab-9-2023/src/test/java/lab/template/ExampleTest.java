package lab.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class ExampleTest {
}

interface A {
    void methodA();
}
class B {
    String attributeB;
    void methodB() {
        // implementation
    }
}
class C extends B implements A {
    int attributeC;
    @Override
    public void methodA() {
        // implementation
    }
    void methodC() {
        // implementation
    }
}
class D {
    B attributeD;

    void methodD() {
        // implementation
    }
}
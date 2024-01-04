package Class;

import Interface.MyInterface;

public abstract class MyAbstractClass implements MyInterface {
    @Override
    public void method1() {
    	System.out.println("Executing method1 in MyAbstractClass");
    }

    @Override
    public void method2() {
    	 System.out.println("Executing method2 in MyAbstractClass");
    }

    // Declare method3 (no implementation here)
    public abstract void method3();
}

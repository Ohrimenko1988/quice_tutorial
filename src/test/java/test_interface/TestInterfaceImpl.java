package test_interface;

import com.google.inject.Singleton;
import test_interface.TestInterface;

@Singleton
public class TestInterfaceImpl implements TestInterface {
  public void doSomething() {
    System.out.println("====>>>> " + getClass().getSimpleName());
  }
}

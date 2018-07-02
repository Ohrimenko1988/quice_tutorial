package test_interface;

import com.google.inject.Inject;
import com.google.inject.Provider;
import test_interface.TestInterface;
import test_interface.TestInterfaceImpl;

public class TestInterfaceImplProvider implements Provider <TestInterface> {
  @Inject private TestInterfaceImpl testInterfaceImpl;
  @Inject private AnotherTestInterfaceImpl anotherTestInterfaceImpl;
  private static final int MY_VARIABLE = Integer.parseInt(System.getProperty("my.variable"));


  public TestInterface get() {
    return testInterfaceResolver();
  }

  private TestInterface testInterfaceResolver(){
    switch(MY_VARIABLE){
      case 1: return testInterfaceImpl;
      case 2: return anotherTestInterfaceImpl;
    }
    return null;
  }



}

import com.google.inject.Inject;
import com.google.inject.Singleton;
import test_interface.TestInterface;

@Singleton
public class MyService {
  private TestInterface testInterface;

  @Inject
  MyService(TestInterface testInterface){
    this.testInterface = testInterface;
  }

  public void doSomething(){
    testInterface.doSomething();
  }


}

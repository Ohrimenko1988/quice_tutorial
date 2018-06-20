import com.google.inject.Singleton;

@Singleton
public class TestInterfaceImpl implements TestInterface {
  public void doSomething() {
    System.out.println("====>>>> " + getClass().getSimpleName());
  }
}

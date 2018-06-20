import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {


  public static void main(String[] args) {

    Injector injector = Guice.createInjector(new BindModule());
    TestInterface testInterface = injector.getInstance(TestInterface.class);


    testInterface.doSomething();



  }





}

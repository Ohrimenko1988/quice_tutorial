import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.Random;

public class Main {
  private MyService myService;

  @Inject
  Main(MyService myService){
    this.myService = myService;
  }

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BindModule());
    //TestInterface testInterface = injector.getInstance(TestInterface.class);
    Main service = injector.getInstance(Main.class);
    RandomIntegerUtilCreatedFactory randomIntegerUtilCreatedFactory = injector
        .getInstance(RandomIntegerUtilCreatedFactory.class);


    service.doSomething();
    System.out.println(System.getProperties().getProperty("my.variable"));

    //////////--------------------------------------------------------------------


    int randomInt = new Random().nextInt(100);
    randomIntegerUtilCreatedFactory.create(randomInt).displayInt();

  }

  public void doSomething(){
    myService.doSomething();
  }

}

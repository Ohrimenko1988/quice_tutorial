import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import random_integer_util.RandomIntegerUtilCreatedFactory;

import java.util.Random;

public class Main {
  private MyService myService;

  @Inject
  Main(MyService myService){
    this.myService = myService;
  }

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BindModule());
    //test_interface.TestInterface testInterface = injector.getInstance(test_interface.TestInterface.class);
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

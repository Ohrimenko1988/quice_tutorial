import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

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


    service.doSomething();
    System.out.println(System.getProperties().getProperty("my.variable"));
  }

  public void doSomething(){
    myService.doSomething();
  }

}

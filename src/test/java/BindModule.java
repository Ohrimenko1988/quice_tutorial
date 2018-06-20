import com.google.inject.AbstractModule;

public class BindModule extends AbstractModule {
  protected void configure() {
    bind(TestInterface.class).to(AnotherTestInterfaceImpl.class);





  }
}

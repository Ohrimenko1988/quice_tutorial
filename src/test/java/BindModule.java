import com.google.inject.AbstractModule;

public class BindModule extends AbstractModule {
  protected void configure() {
    bind(TestInterface.class).toProvider(TestInterfaceImplProvider.class);
    bind(PartOfDescription.class).to(PartOfDescriptionImpl.class);



  }
}

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class BindModule extends AbstractModule {
  protected void configure() {
    bind(TestInterface.class).toProvider(TestInterfaceImplProvider.class);
    bind(PartOfDescription.class).to(PartOfDescriptionImpl.class);

    install(new FactoryModuleBuilder()
        .implement(RandomIntegerUtil.class, RandomIntegerUtilImplementation.class)
        .build(RandomIntegerUtilCreatedFactory.class));



  }
}

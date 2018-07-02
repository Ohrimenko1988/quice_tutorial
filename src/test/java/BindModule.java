import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import part_of_description.PartOfDescription;
import part_of_description.PartOfDescriptionImpl;
import random_integer_util.RandomIntegerUtil;
import random_integer_util.RandomIntegerUtilCreatedFactory;
import random_integer_util.RandomIntegerUtilImplementation;
import test_interface.TestInterface;
import test_interface.TestInterfaceImplProvider;

public class BindModule extends AbstractModule {
  protected void configure() {
    bind(TestInterface.class).toProvider(TestInterfaceImplProvider.class);
    bind(PartOfDescription.class).to(PartOfDescriptionImpl.class);

    install(new FactoryModuleBuilder()
        .implement(RandomIntegerUtil.class, RandomIntegerUtilImplementation.class)
        .build(RandomIntegerUtilCreatedFactory.class));



  }
}

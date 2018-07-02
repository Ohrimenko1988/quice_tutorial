package test_interface;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import part_of_description.PartOfDescription;
import test_interface.TestInterface;

@Singleton
public class AnotherTestInterfaceImpl implements TestInterface {
  private final PartOfDescription partOfDescription;

  @Inject
  AnotherTestInterfaceImpl(PartOfDescription partOfDescription){
    this.partOfDescription = partOfDescription;
  }

  public void doSomething() {
    System.out.println("=========>>>>> " + getClass().getSimpleName() +
        "\nThis is description:\n" + partOfDescription.getDescription());
  }
}

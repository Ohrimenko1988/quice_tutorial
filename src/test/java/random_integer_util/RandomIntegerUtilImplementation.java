package random_integer_util;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import random_integer_util.RandomIntegerUtil;

public class RandomIntegerUtilImplementation implements RandomIntegerUtil {
  private final int numberForDisplaying;

  @Inject
  RandomIntegerUtilImplementation(@Assisted int numberForDisplaying){
    this.numberForDisplaying = numberForDisplaying;
  }



  public void displayInt() {
    System.out.println("===>>> this is number of displaying " + this.numberForDisplaying);
  }
}

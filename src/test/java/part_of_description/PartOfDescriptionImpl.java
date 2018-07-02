package part_of_description;

import com.google.inject.Singleton;
import part_of_description.PartOfDescription;

@Singleton
public class PartOfDescriptionImpl implements PartOfDescription {
  public String getDescription() {
    return "this is description";
  }
}

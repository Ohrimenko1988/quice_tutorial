import com.google.inject.Singleton;

@Singleton
public class PartOfDescriptionImpl implements PartOfDescription {
  public String getDescription() {
    return "this is description";
  }
}

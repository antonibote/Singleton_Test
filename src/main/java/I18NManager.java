import java.util.HashMap;
import java.util.ResourceBundle;


public class I18NManager {

    private static I18NManager instance;

    private HashMap<String, ResourceBundle> translation;

    private I18NManager() {
        translation = new HashMap<>();
    }

    public static I18NManager getInstance() {
        if (instance == null) instance = new I18NManager();
        return instance;
    }
    public String getText(String language, String line) {
        ResourceBundle resourcebundle;
        resourcebundle = ResourceBundle.getBundle(language);
        translation.put(language, resourcebundle);
        return resourcebundle.getString(line);
    }

    public void clear(){
        translation.clear();
        //instance.clear();
    }
}

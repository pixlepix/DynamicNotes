package pixlepix.notes.element;

/**
 * Created by pixlepix on 8/12/15.
 */
public class ElementClassifier {
    
    public static ElementNote getElement(String chunk){
        
        if(chunk.contains("=")){
            return new ElementDefinition();
        }
        
        return new ElementText();
        
    }
    
}
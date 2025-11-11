package Tools;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Search {

    public boolean search(Object foundedObject, Object... objects) {
        for(Object elem: objects) {
            if(elem.equals(foundedObject)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchModern(Object foundedObject, Object... objects) {
        return !Arrays.stream(objects).filter((Object obj) -> obj.equals(foundedObject)).collect(Collectors.toList()).isEmpty();
    }

}

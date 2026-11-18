import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ClassCaller {

    protected HashMap<String, Integer> allMethods = new HashMap<>();

    public ClassCaller() {
        ArrayList<String> temp = readMethodNames(this.getClass());
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            String x = temp.get(i);
            allMethods.put(x, i);
            System.out.println("Placed item: " + x + " -> " + i);
        }
    }

    // Accepts Class<?> so it works for ClassCaller AND any subclass that inherits it
    public static ArrayList<String> readMethodNames(Class<?> targetClass) {
        ArrayList<String> methodNames = new ArrayList<>();

        // 3. Get methods from targetClass and loop through them
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method m : methods) {
            methodNames.add(m.getName());
        }

        return methodNames;
    }

    public static void AskUserToPick(){

    }
}

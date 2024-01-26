public class hashmaps{

    public static void main(String[] args){

        //*-------------------------*
        //*       Setting Up        *
        //*-------------------------*

        import java.util.HashMap
        HashMap<Integer, String> map = new HashMap<>();

 
        //*-------------------------*
        //*     Useful Functions    *
        //*-------------------------*
s
        map.put(2,"second");
        map.get(2);
        map.remove(2);

        int size = map.size();
        boolean isEmpty = map.isEmpty();

        boolean hasKey = map.containsKey(2);
        boolean hasValue = map.containsValue(2);

        //*-------------------------*
        //*        Iteration        *
        //*-------------------------*

        for(int key : map.keySet()){
            System.out.println("Key: " + key);
        }

        for(String val : map.values()){
            System.out.println("Value: " + value);
        }

        for(int i : map.keySet()){
            System.out.println("Key: " + i + ", Value: " + map.get(i));
        }      

        return;
    }
}
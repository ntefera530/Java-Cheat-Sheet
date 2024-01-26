public class arrays{

    public static void main(String[] args){

        //*-------------------------*
        //*       Setting Up        *
        //*-------------------------*

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<Integer>(5);
 

        //*-------------------------*
        //*     Access Elements     *
        //*-------------------------*

        list.get(3);

        //*-------------------------*
        //*        Iteration        *
        //*-------------------------*

        for(int i = 0; i < list2.size(); i++){
            list.add(i);
            list2.add(i);
        }

        for(int val : list2){
            System.out.println(val);
            System.out.println(list2.get(3));
        }

        //*-------------------------*
        //*     Useful Functions    *
        //*-------------------------*

            list.add(4);
            int size = list.size();
            list.clear();
            list.remove(2);
            int value = list.get(2);
            list.set(2,"hello");
            int index = list.indexOf(3); // -1 if not found
            int index = list.lastIndexOf(3); // -1 if not found
            boolean isEmpty = list.isEmpty();
            boolean isFound = list.contains(5);

            //advanced
            boolean isFound list.containsAss(Collection collection);
            list.sort(Comparator comp);
            
        return;
    }
}
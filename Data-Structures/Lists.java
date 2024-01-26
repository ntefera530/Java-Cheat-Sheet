public class lists{

    public static void main(String[] args){

        //*-------------------------*
        //*       Setting Up        *
        //*-------------------------*

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<Integer>(5);
 
        //*-------------------------*
        //*     Useful Functions    *
        //*-------------------------*

            list.get(3);
            list.add(4);             
            list.remove(2);

            int size = list.size();
            list.clear();
            boolean isEmpty = list.isEmpty();

            int value = list.get(2);
            list.set(2,"hello");
            int index = list.indexOf(3); // -1 if not found
            int index = list.lastIndexOf(3); // -1 if not found

            boolean isFound = list.contains(5);

            //advanced
            boolean isFound list.containsAss(Collection collection);
            list.sort(Comparator comp);

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


        return;
    }
}
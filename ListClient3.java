//Zaw Htun, Zain Hassan, Conner Bennett, Aidan Hert, Thompson Ngo
//Team#02
//CS211
//Project#02
//Ch16 Pj03


public class ListClient3 {
    public static void main(String[] args) {
    
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        processList(list);
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        processList(list1);
        System.out.println();
        
        
        System.out.println("list1 is added to list:");
        list.addAll(list1);
        System.out.println(list.toString());
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        processList(list2);
        LinkedList<Integer> list3 = new LinkedList<Integer>();
        processList(list3);
        System.out.println();
        
        System.out.println("list2 is added to list3:");
        list3.addAll(list2);
        System.out.println(list3.toString());
        System.out.println();
        
        
        list1.clear();
        System.out.println("Now the list1 is clear:"+list1.toString());
        list2.clear();
        System.out.println("Now the list2 is clear:"+list2.toString());         

    }

    public static void processList(List list) {
        
        list.add(42);
        list.add(18);
        list.add(27);
        list.add(93);
        System.out.println("The index of integer 18 is "+list.indexOf(18));
        System.out.println("The initial list is "+list.toString());
        System.out.println("is the List empty?"+list.isEmpty());
        System.out.println("Integer 27 in the list? "+list.contains(27));
        list.add(1,81);
        System.out.println("Add integer 81 in index 1: "+list.toString());
        list.remove(2);
        System.out.println("Remove index 2:"+list.toString());
        list.set(2,20);
        System.out.println("Set integer 20 in index 2:"+list.toString());
        
    }
}

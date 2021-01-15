//Zaw Htun, Zain Hassan, Conner Bennett, Aidan Hert, Thompson Ngo
//Team#02
//CS211
//Project#02
//Ch16 Pj03

import java.util.*;

public abstract class AbstractList<E> implements List<E> {
   
   //Zaw Htun
   //Abstract Methods common to both class 
   public abstract int size();
   
   public abstract E get(int index);
   
   public abstract void add(int index, E value);
   
   public abstract void remove(int index);
   
   public abstract void clear();
   
   public abstract void set(int index,E value);

   public abstract Iterator<E> iterator();
   
   //Zain Hassan
   // post: returns true if list is empty, false otherwise
   public boolean isEmpty() {
      int size = size();
      if (size == 0) return true;
      return false;
   }

   //Conner Bennett
   // post: returns true if the given value is contained in the list,
   //       false otherwise
   public boolean contains(E value) {
       int num = indexOf(value);
       if (num >= 0) return true;
       return false;
   }
   
   //Zaw Htun
   // post: appends the given value to the end of the list
   public void add(E value) {
      int size = size();
      add(size, value);
   }

   //Aidan Hert
   // post: appends all values in the given list to the end of this list
   public void addAll(List<E> other) {
      for (E value : other) {
         add(value);
      }
   }

   //Zain Hassan
   // post: creates a comma-separated, bracketed version of the list
   public String toString() {
      int size = size();
      if (size < 1) {
         return "[]";
      }
      Iterator iter = iterator();
      String s = "[" + iter.next();
      while (iter.hasNext()) {
         s += ", ";
         s += iter.next();
      }
      s += "]";
      return s;
   }
   
   //Thompson Ngo   
   // post : returns the position of the first occurrence of the given
   //        value (-1 if not found)
   public int indexOf(E value) {
      int count = 0;
      Iterator iter = iterator();
      while (iter.hasNext()) {
         E item = (E) iter.next();
         if (item.equals(value)) {
            return count;
         }
         count++;
      }
      return -1;
   }

}
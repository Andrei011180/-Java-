import java.util.HashSet;
import java.util.Set;

public class NoteBookMain {
   public static void main(String[] args) {
              NoteBook NoteBook1 = new NoteBook(name: " windows", hd : 500, color: black, ram: 8);
              NoteBook NoteBook2 = new NoteBook(name: " dos", hd : 50, color: black, ram: 1);
              NoteBook NoteBook3 = new NoteBook(name: " lunax", hd : 1000, color: red, ram: 32);
              NoteBook NoteBook4 = new NoteBook(name: " max", hd : 250, color: white, ram: 16);
             
             Set<NoteBook> set = new HashSet<>();
             set.add(NoteBook1);
             set.add(NoteBook2);
             set.add(NoteBook3);
             set.add(NoteBook4);  

             for ( NoteBook Notebook : set ) {
              System.out.println( NoteBook );
              System.out.println();
             }
       }
}

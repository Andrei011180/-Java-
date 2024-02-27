public class NoteBook {
       private String name;
       private int ram;
       private int hd;
       private String color;

       public NoteBook(String name, String color, int ram, int hd) {
              this.name = name;
              this.color = color;
              this.ram = ram;
              this.hd = hd;
       }

       public String getName() {
              return name;
       }

       public String getColor() {
              return color;
       }

       public int getRam() {
              return ram;
       }

       public int getHd() {
              return hd;
       }

       public void setName(String name) {
              this.name = name;
       }

       public void setColor(String color) {
              this.color = color;
       }

       public void setRam(int ram) {
              this.ram = ram;
       }

       public void setHd(int hd) {
              this.hd = hd;
       }

       @Override

       public String toString() {
              return " Операционная система :" + name + " \n" + " Цвет :" + color + "\n" + " ОЗУ :" + ram + "\n"
                            + "ЖД: " + hd;
       }

       @Override
       public boolean equals(Object obj) {
              if (this == obj) {
                     return true;
              }
              if (obj == null || getClass() != obj.getClass()) {
                     return false;
              }
              NoteBook NoteBook = (NoteBook ) obj;
              return name.equals(NoteBook.name)&&ram == NoteBook.ram && color.equals(NoteBook.color);
       }
}
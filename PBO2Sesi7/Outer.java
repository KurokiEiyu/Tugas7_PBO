package PBO2Sesi7;

public class Outer {
    int number=0;

    void outerMethod(){
        class Inner{
            public void print(){
                System.out.println("Mengakses inner class yang ke: " + (++number));
                //apabila ++number diubah menjadi number++ maka output bernilai 0 terlebih dahulu
            }
        }

        Inner inner = new Inner();
        inner.print(); 
    }
}

class OuterAccesss{

    public static void main(String[] args) {
        Outer out = new Outer();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();
    }
}

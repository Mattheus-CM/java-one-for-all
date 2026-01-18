package martins.mattheus.javaoneforall.javacore.ZZAinnerclasses.test;

public class OuterClassesTest01 {
    private String name = "Goku";

    // Nested
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        Inner inner = new OuterClassesTest01().new Inner();

        inner.printOuterClassAttribute();
    }
}



public class a {
    public class Base {
        public Base() {
            System.out.println("constuct defult");
        }
        public Base(int a) {
            System.out.println("construct int");
        }

        public Base(Base b) {
            System.out.println("copy construct");
        }
        public void sperma() {
            System.out.println("Helo work");
        }
    }
    Base b;
    public a() {}

    public void z() {
        b.sperma();
    }
    public a(int x) {
        this.b = new Base(x);
    }

    public static void main(String[] args) {
        Object b = new a();
        //b.z();
    }
}




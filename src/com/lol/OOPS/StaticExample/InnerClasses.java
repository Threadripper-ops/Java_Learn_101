package com.lol.OOPS.StaticExample;
public class InnerClasses {
    static class test{   /// this means class "test" does not depend on the object
                         /// of  the class "InnerClasses" .but it can
                      /// be used by the object of other class.
         String name ; // since the class is static
                         // so internal variables are now automatically static
                       // no need to declare them static individually

        public test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;

        }
    }

    public static void main(String[] args) {
        test a = new test("hello");  // here test in-spite of being static
        test b = new test("world"); // depends on the object of main class
                                          // this is because static class can have instances with
                                          // other static class
        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);

    }
}



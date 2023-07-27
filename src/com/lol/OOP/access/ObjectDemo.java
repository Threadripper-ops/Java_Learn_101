package com.lol.OOP.access;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo( int num,float gpa){
        this.num=num;
        this.gpa=gpa;
    }



    public ObjectDemo() {
        super();
    }

    @Override

    // it gives a random number representation of the object.
    // helps to identify the object uniquely
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num== ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj= new ObjectDemo(34,5.3f);
        ObjectDemo obj1= obj;
        ObjectDemo obj4= new ObjectDemo(34,5.3f);


        if(obj==obj1){ // it compares if the ref variable is pointing to the same obj or not
            System.out.println("obj is equal to obj1");

        }
        System.out.println("hello");
        if (obj.equals(obj4)){
            System.out.println("obj is equal to obj4");
        }


        System.out.println(obj.getClass().arrayType().getName());

//        System.out.println(obj.hashCode());
//        System.out.println(obj1.hashCode());
//        System.out.println(obj.hashCode());


    }

}




package BEng_2_1_NehadTARamaha.week05_NestedClasses_EnumTypes_DeeperInClasses;


class OuterClass{
    public int num1;

    class InnerClass{
        public int num2;
    }

    static class StaticNestedClass{
        public int num3;
    }

    private class PrivateInnerClass{
        int num4= 3;
    }

    public int getNum4(){
        OuterClass myOuter= new OuterClass();
        OuterClass.PrivateInnerClass myPrivateInner= myOuter.new PrivateInnerClass();
        return myPrivateInner.num4;
    }
}

public class NestedClass{
    // ! MAIN SECTION
    public static void main(String[] args){
        // * Inner Class
        OuterClass outerObject= new OuterClass();  // We must create an Outer Class object firtsly
        OuterClass.InnerClass innerObject= outerObject.new InnerClass();
        innerObject.num2= 5;

        // * Static Nested Class
        OuterClass.StaticNestedClass nestedObject= new OuterClass.StaticNestedClass();
        nestedObject.num3= 8;
    }
    // ! MAIN SECTION
}

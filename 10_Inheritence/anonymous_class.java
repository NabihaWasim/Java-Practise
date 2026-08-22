public class anonymous_class {
    void print(){
        System.out.println("Main class.");
    }
    void print1(){
        System.out.println("Main class 1");
    }
    public static void main(String[] args) {
        anonymous_class object=new anonymous_class(){
            @Override
            void print(){
                System.out.println("Anonymous class");
            }
            //it will nor print becuase of not overriden
            void print1(){
                System.out.println("Anonymous class 1");
            }
        }; 
        object.print();
        object.print1();
    }
}

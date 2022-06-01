class OverrideHashcode {
    String s;
    OverrideHashcode(String s){
        this.s=s;
    }
    @Override
    public  int hashCode(){
        System.out.println("Hi I am hashcode Method");
        return 1;
    }

    public void add(){
        System.out.println("Hi I am add Method");
    }
}
class Runner{
    public static void main(String[] args) {
        OverrideHashcode oh = new OverrideHashcode("Hello");
        //System.out.println(oh);
        //System.out.println(oh.hashCode());
        //oh.add();

    }
}
/* When the OverrideHashcode(C) class's object was created using new keyword
the hashCode method was not called,even when accessing a method from
OverrideHashcode(C) class the hashCode method was not called,
only when we print the reference variable hashCode method was called.
 */
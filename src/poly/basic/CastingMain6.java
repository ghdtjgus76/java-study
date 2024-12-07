package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스");
            child.childMethod();
            System.out.println();
        } else {
            System.out.println("Child 인스턴스 아님");
            System.out.println();
        }
    }
}
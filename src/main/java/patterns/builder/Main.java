package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person . Builder ()
                .withName ( "Сергей" )
                .withSurname ( "Сердюк" )
                .withAge ( 39 )
                .withHeight ( 180 )
                .build ();
        System.out.println (person.toString ());

    }
}

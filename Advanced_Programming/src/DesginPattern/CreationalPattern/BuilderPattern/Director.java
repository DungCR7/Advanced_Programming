package DesginPattern.CreationalPattern.BuilderPattern;

public class Director {
    public static void main(String[] args) {

        StudentBuilder studentBuilder = new StudentConcreteBuilder()
                .setFirstName("Bui")
                .setLastName("Van Dung");
        System.out.println(studentBuilder.build());
    }

}

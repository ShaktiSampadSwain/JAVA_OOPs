public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.set_age(21);
        user1.set_name("shakti");


        System.out.println(user1.get_name() + " is " + user1.get_age() + " years old");
    }
}
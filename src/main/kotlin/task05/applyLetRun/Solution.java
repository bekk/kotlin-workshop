package task05.applyLetRun;

public class Solution {

    static User apply() {
        User user = new User("Alice", 30);
        user.setName("Bob");
        return user;
    }

    static int let() {
        Vector vector = new Vector(10, 20);
        return vector.getX() * vector.getY();
    }

    static int run() {
        Vector3 vector = new Vector3(10, 20, 30);
        return vector.getX() * vector.getY() * vector.getZ();
    }

    static int with() {
        Vector4 vector = new Vector4(10, 20, 30, 40);
        return vector.getX() * vector.getY() * vector.getZ() * vector.getW();
    }
}

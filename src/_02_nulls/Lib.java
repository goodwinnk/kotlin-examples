package _02_nulls;

import _01_compact.User;
import com.google.common.collect.Lists;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Lib {
    // This is Java! :)
    public static void main(String[] args) {
        User user = getSpeaker(42);
        System.out.println(user.getAge());
    }


















    public static User getSpeaker(int i) {
        if (i == 42) {
            return null;
        }

        return new User("Null example", "Null example", 50);
    }






    public static ArrayList<User> findSpeakers() {
        return Lists.newArrayList(getSpeaker(3));
    }
}

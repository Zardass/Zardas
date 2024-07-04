package ders19;

import java.util.ArrayList;

public class Praktika1 {
    public static void main(String[] args) {

        ArrayList<String> namesOfFriend = new ArrayList<>();
        namesOfFriend.add("Zerda");
        namesOfFriend.add("Fegan");
        namesOfFriend.add("Sahib");
        namesOfFriend.add("Rahibe");
        System.out.println("before\n" + namesOfFriend);
        System.out.println("after\n" + namesOfFriend.reversed());


    }
}

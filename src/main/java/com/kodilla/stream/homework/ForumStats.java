package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts by users over 40 is: " + averageOver40);

        double averageBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("The average of posts by users under 40 is: " + averageBelow40);
    }
}

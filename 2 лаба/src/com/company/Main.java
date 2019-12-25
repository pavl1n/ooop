package com.company;

import package1.Manager;

public class Main {

    public static void main(String[] args) {
        Manager[]m1 = new Manager[4];
        m1[0] = new Manager("Иванов",32,true);
        m1[1] = new Manager("Николаев", false);
        m1[2] = new Manager("Петров", 24, false);
        m1[3] = new Manager(m1[2]);
        for(int i = 0; i < 4; i++){
            m1[i].print();
        }
        System.out.println("Средний возраст работников " + Manager.Age(m1));
        System.out.println("Работники которые справляются с работой " + Manager.hasRabota(m1));
    }
}
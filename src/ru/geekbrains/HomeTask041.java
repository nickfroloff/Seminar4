// 1. Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список

package ru.geekbrains;


import java.util.LinkedList;
import java.util.logging.Logger;

public class HomeTask041 {
    public static void main(String[] args) {

        String str1 = new String("мама");
        String str2 = new String("мыла");
        String str3 = new String("раму");

        LinkedList<String> startList = new LinkedList<>();
        startList.add(str1);
        startList.add(str2);
        startList.add(str3);

        LinkedList<String> newList = new LinkedList<>();
        for(int i = startList.size()-1; i>=0; i--) {
            newList.add(startList.get(i));
        }

        Logger log = Logger.getAnonymousLogger();
        log.info("Изначальный массив: " + String.valueOf(startList));
        log.info("Новый массив: " + String.valueOf(newList));
    }
}


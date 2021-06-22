package com.fju;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("99595959", "陳小華");
        students.put("001", "陳");
        students.put("002", "陳小");
        students.put("008", "陳小華");
        String name = students.get("001");
        System.out.println(name);
    }
}

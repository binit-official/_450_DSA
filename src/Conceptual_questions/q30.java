package Conceptual_questions;

//You’re given a data type. Print its size in bytes

public class q30 {
    public static int dataTypes(String type) {
        String s=type.toLowerCase();
        if(s.equals("long"))return 8;
        if(s.equals("integer"))return 4;
        if(s.equals("float"))return 4;
        if(s.equals("double"))return 8;
        if(s.equals("character"))return 1;

        return 0;
    }
}

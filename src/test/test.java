package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    /*
    public static void main(String[] args){

        ArrayList<ArrayList<String>> myHand = new ArrayList<ArrayList<String>>();

        ArrayList<String> line1 = new ArrayList<>();    // 1 2 3
        ArrayList<String> line2 = new ArrayList<>();    // 4 5 6
        ArrayList<String> line3 = new ArrayList<>();    // 7 8 9
        ArrayList<String> line4 = new ArrayList<>();    // * 0 #
        for(int i = 3; i > line1.size();) {
            line1.add(null);    // null, null, null
            line2.add(null);    // null, null, null
            line3.add(null);    // null, null, null
        }
        line4.add("LEFT"); line4.add(null); line4.add("RIGHT"); // LEFT, null, RIGHT
        myHand.add(line1);  // 1 2 3
        myHand.add(line2);  // 4 5 6
        myHand.add(line3);  // 7 8 9
        myHand.add(line4);  // * 0 #

        for ( int i = 0; myHand.size() > i; i++){
            if(myHand.get(i).indexOf("LEFT") != -1) {
                System.out.println(myHand.get(i).indexOf("LEFT"));
            }
        }
    }
    */
    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test);
        test.set(0,100);
        System.out.println(test);
        if(test.get(0).equals(3) || test.get(1).equals(3) || test.get(2).equals(3)) {
            System.out.println("RUN");
        }
    }
}
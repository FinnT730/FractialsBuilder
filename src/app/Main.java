package app;

import javax.swing.*;

public class Main {



//    public static int width = 640;
//    public static int height = 480;

    public static int width = 600;
    public static int height = 600;

    private static JFrame fr = new JFrame("Fract");


    private static FractialLoader floader = new FractialLoader();

    public static void main(String[] args) {



        F01 f0 = new F01();
        fr.setSize(width,height);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.add(f0).addMouseListener(floader.mandel);
    }



}

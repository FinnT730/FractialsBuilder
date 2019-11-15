import groovyjarjarasm.asm.AnnotationVisitor;

import javax.swing.*;
import java.awt.event.MouseListener;

public class Main {



//    public static int width = 640;
//    public static int height = 480;

    public static int width = 600;
    public static int height = 600;

    private static JFrame fr = new JFrame("Fract");

    public static void main(String[] args) {



        F01 f0 = new F01();
        fr.setSize(width,height);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.add(f0).addMouseListener(f0);
    }



}

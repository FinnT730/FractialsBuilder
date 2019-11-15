import groovy.transform.Generated

import java.awt.Color
import java.awt.Component
import java.awt.Graphics
import java.awt.color.ColorSpace
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class F01 extends Component implements MouseListener{


    float mag = 2000
    float panX = 0.7
    float panY = 0.6



    def belongsIn(double x, double y) {


        float maxI = 50


        float realC = x
        float imC = y


        for(float i = 0; i < maxI; i++) {
            float ter = realC * realC - imC * imC + x

            float ti = 2 * realC * imC + y

            realC = ter
            imC = ti


            if(realC * imC > 1) {
                return (i / maxI * 100)
            }

        }

//        if(realC * imC < 5)
//            return true



        return 0;
    }


    @VM_keep(retain = true)
    @Override
    void paint(Graphics g) {
        super.paint(g)

//        for(int i = 0; i < Main.width; i++) {
//            for(int j = 0; j < Main.height; j++) {
//            }
//        }




        for(int i = 0; i < Main.width; i++) {
            for(int j = 0; j < Main.height; j++) {
                def isIn = belongsIn(i / mag - panX, j / mag - panY)

                if(isIn == 0) {
                    g.setColor(Color.BLACK)
                    g.fillRect(i,j,1,1)
                } else {
                    g.setColor(new Color(isIn.intValue(),0,new Random().nextInt(60)))
                    g.fillRect(i,j,1,1)
                }
            }
        }

    }

    @Override
    void mouseClicked(MouseEvent e) {
        for(int i = 0; i < 100; i++) {
            mag += 1;
            repaint()
        }
        repaint()
    }

    @Override
    void mousePressed(MouseEvent e) {

    }

    @Override
    void mouseReleased(MouseEvent e) {

    }

    @Override
    void mouseEntered(MouseEvent e) {

    }

    @Override
    void mouseExited(MouseEvent e) {

    }
}

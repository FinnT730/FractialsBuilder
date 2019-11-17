package app


import java.awt.Color
import java.awt.Component
import java.awt.Graphics
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class F01 extends Component implements MouseListener{


    float mag = 2000
    float panX = 0.7
    float panY = 0.6

    /***
     *
     * @param x
     * @param y
     * @return This will return a number that is a Float. You can change this also to a boolean return
     */
    def belongsIn(double x, double y) {


        float maxI = 100


        float realC = x
        float imC = y


        for(float i = 0; i < maxI; i++) {
            float ter = realC * realC - imC * imC + x

            float ti = 2 * realC * imC + y

            realC = ter
            imC = ti


            if(realC * imC > 10) {
                    return (i / maxI * 100)
            }

        }

//        if(realC * imC < 5)
//            return true



        return 0;
    }

    /***
     * This function will paint the Mandelbrot on the canvas. Because of the complex functions, this is not optimized AT all.
     * (The optimization is in the TODO list)
     * @param g
     */
    @VM_keep(retain = true)
    @Override
    void paint(Graphics g) {
        super.paint(g)

//        for(int i = 0; i < app.Main.width; i++) {
//            for(int j = 0; j < app.Main.height; j++) {
//            }
//        }




        for(int i = 0; i < Main.width; i += 1) {
            for(int j = 0; j < Main.height; j += 1) {
                def isIn = belongsIn(i / mag - panX, j / mag - panY)

                if(isIn == 0) {
                    g.setColor(Color.BLACK)
                    g.fillRect(i,j,1,1)
                } else {
                    g.setColor(new Color(isIn.intValue(),100,200))
                    g.fillRect(i,j,1,1)
                }
            }
        }

        g.setColor(Color.WHITE)
//        g.drawString(Main.width / mag / panX + ":" +  Main.height / mag / panY,150,150)

    }

    @Override
    void mouseClicked(MouseEvent e) {
//        for(int i = 0; i < 100; i++) {
//            mag += 1;
//            repaint()
//        }

        System.gc()
        mag += 200
        panX += 0.001f
        panY -= 0.001f


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

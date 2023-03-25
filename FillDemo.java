
import java.time.LocalTime;

import javax.swing.JFrame;
class FillDemo{
    public static void main(String[] args) {
        // for (int i = 1; i < 15; i++) {
        //     // LocalTime t = LocalTime.now();
        //     System.out.println(BahireCalc.toEthiopic("1234"));
        // }
        JFrame jj = new JFrame(BahireCalc.toArabic("፮፼፹፻፮፻፶፯")+"");//፮፼፹፻፮፻፶፯
        jj.setVisible(true);
    }
}
/**
 * @(#)FirstWindow.java
 *
 *
 * @author M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/4
 */


import javax.swing.JFrame;

public class FirstWindow {

    public static void main(String[] args) {

        // membuat objek jendela
        JFrame myWindow = new JFrame();

        // berikan judul pada jendela
        myWindow.setTitle("Windows");

        // tentukan ukuran jendela
        myWindow.setSize(400, 200);

        // tampilkan jendela ke layar
        myWindow.setVisible(true);

    }

}
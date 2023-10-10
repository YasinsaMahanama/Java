import javax.swing.*;
class SampleWindow {
    public static void main(String[] args) {
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(300, 200);  // Can change the size of the window
        myWindow.setTitle("My Window");
        myWindow.setVisible(true);  // myWindow.setVisible(false);-- Can't see the window
    }
}

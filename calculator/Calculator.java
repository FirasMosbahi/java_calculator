/*-------------------importing necessary libraries--------------------*/
import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;

public class Calculator extends Frame{
    public Calculator() {

        /*---------title and size------------------*/
        setTitle("Calculator");
        setSize(900,450);

        /*----------app components------------------*/
        Label l1 = new Label("Numero 1 :");
        Label l2 = new Label("Numero 2 :");
        Label lRes = new Label("Resultat :");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tfRes = new TextField();
        Button add = new Button("ajouter");
        Button res = new Button("Diminuer");

        /*------------ app layout--------------*/
        setLayout(new GridLayout(4,2));

        /*------------ actionListener----------*/
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfRes.setText(Float.toString(Float.parseFloat(tf1.getText()) + Float.parseFloat(tf2.getText())));
            }
        });
        res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tfRes.setText(Float.toString(Float.parseFloat(tf1.getText()) - Float.parseFloat(tf2.getText())));
            }
        });

        /*-------------Window Listener--------------*/
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        /*-----------------App Display---------------*/
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(lRes);
        add(tfRes);
        add(add);
        add(res);

        /*--------------App Configuration-------------*/
        pack();
        setVisible(true);
    }

    /*--------------Main Function-----------------*/
    public static void main(String[] args) {
        new Calculator();
    }
}

package ticTacToeGame;

import javax.swing.*;

public class Main{


    public static void main(String [] args) {

        JFrame window = new JFrame("Tic Tac Toe");
        JButton button = new JButton("Click Me!");

        window.getContentPane().add(button);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setVisible(true);
        window.setLocationRelativeTo(null);


        public void changeIt(){
            button.setText("You clicked me !");
        }



    }


}

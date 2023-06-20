package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import static java.lang.Math.*;

/**
 * Declaration of the calculator buttons
 *
 * @author Jayniel Gagui
 *
 */

public class Calculator {
    double number1 = 0;
    double number2 = 0;
    double result = 0;
    char operation;
    private JButton sevenBtn;
    private JButton fourBtn;
    private JButton fiveBtn;
    private JButton sixBtn;
    private JButton minusBtn;
    private JButton sqrBtn;
    private JButton logBtn;
    private JButton powerBtn;
    private JButton squareBtn;
    private JButton clearBtn;
    private JButton mulBtn;
    private JButton divideBtn;
    private JButton percentageBtn;
    private JButton signBtn;
    private JButton eightBtn;
    private JButton nineBtn;
    private JButton twoBtn;
    private JButton threeBtn;
    private JButton addBtn;
    private JButton oneBtn;
    private JButton zeroBtn;
    private JButton digitBtn;
    private JButton equalBtn;
    private JTextField textField;
    private JPanel Calculator;

    /**
     *
     * Add the functions of the buttons,
     *
     * Switch statement is used for operations that requires two numbers,
     *
     * Operations that use one number have the operation implemented within the button
     *
     */

    public Calculator() {
        zeroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("0"));
            }
        });
        oneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("1"));
            }
        });
        twoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("2"));
            }
        });
        threeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("3"));
            }
        });
        fourBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("4"));
            }
        });
        fiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("5"));
            }
        });
        sixBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("6"));
            }
        });
        sevenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("7"));
            }
        });
        eightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("8"));
            }
        });
        nineBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("9"));
            }
        });
        digitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("."));
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='+';
                textField.setText("");
            }
        });
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='-';
                textField.setText("");
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='*';
                textField.setText("");
            }
        });
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='/';
                textField.setText("");
            }
        });
        sqrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                result = sqrt(number1);
                textField.setText(String.valueOf(result));
            }
        });
        percentageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                result = (number1 / 100);
                textField.setText(String.valueOf(result));
            }
        });
        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                result = (log(number1));
                textField.setText(String.valueOf(result));
            }
        });
        signBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='c';
                textField.setText("");
            }
        });
        powerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                operation ='y';
                textField.setText("");
            }
        });
        squareBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1 = Double.parseDouble(textField.getText());
                result = pow(number1,2);
                textField.setText(String.valueOf(result));
            }
        });
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    switch(operation) {
                        case'+':
                            number2 = Double.parseDouble(textField.getText());
                            result = number1 + number2;
                            break;
                        case'-':
                            number2 = Double.parseDouble(textField.getText());
                            result = number1 - number2;
                            break;
                        case'*':
                            number2 = Double.parseDouble(textField.getText());
                            result = number1 * number2;
                            break;
                        case'/':
                            number2 = Double.parseDouble(textField.getText());
                            result = number1 / number2;
                            if(number2 == 0){
                                textField.setText("Error");
                                result = Double.parseDouble(null);
                            }
                            break;
                        case'y':
                            number2 = Double.parseDouble(textField.getText());
                            result = pow(number1,number2);
                            break;
                        case'c':
                            result = (number1 * -1);
                            break;
                    }
                    textField.setText(String.valueOf(result));
            }
        });
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
    }

    public void test( String button){
        switch (button){
            case "0": zeroBtn.doClick();break;
            case "1": oneBtn.doClick();break;
            case "2": twoBtn.doClick();break;
            case "3": threeBtn.doClick();break;
            case "4": fourBtn.doClick();break;
            case "5": fiveBtn.doClick();break;
            case "6": sixBtn.doClick();break;
            case "7": sevenBtn.doClick();break;
            case "8": eightBtn.doClick();break;
            case "9": nineBtn.doClick();break;
            case "%": percentageBtn.doClick();break;
            case "-/+": signBtn.doClick();break;
            case "AC": clearBtn.doClick();break;
            case "*2": squareBtn.doClick();break;
            case "sqr": sqrBtn.doClick();break;
            case "log": logBtn.doClick();break;
            case ".": digitBtn.doClick();break;
            case "+": addBtn.doClick();break;
            case "-": minusBtn.doClick();break;
            case "*": mulBtn.doClick();break;
            case "/": divideBtn.doClick();break;
            case "**": powerBtn.doClick();break;
            case "=": equalBtn.doClick();break;
            case "txt": System.out.println("The result is: " + textField.getText());break;
            default:System.out.println("invalid input");break;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}




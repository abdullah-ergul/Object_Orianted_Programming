import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EngineerRegistrationForm extends JFrame {

    private JPanel panel1;
    private JTextField textFieldFName;
    private JTextField textFieldSalary;
    private JButton saveButton;
    private JButton loadButton;
    private JPanel mainPanel;

    EngineerRegistrationForm(){
        this.setTitle("Register Student");
        this.setSize(400, 300);
        this.add(panel1);
        setLookAndFeel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullName = textFieldFName.getText();
                double salary = Double.parseDouble(textFieldSalary.getText());

                for(Component component : mainPanel.getComponents()){
                    if (component instanceof JTextField){
                        ((JTextField) component).setText(" ");
                    }
                }


                Engineer engineer = new Engineer(fullName,salary);
                try {
                    SaveLoadManager.save(engineer);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }

            }
        });
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Engineer loaded=SaveLoadManager.load();
                //textFieldSalary.setText(loaded.getFullName());
            }
        });
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }
}

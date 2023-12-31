import javax.swing.*;
import java.io.File;

public class ChooseMusicFile extends JFrame {
    // Constructor
    public ChooseMusicFile() {
        // Initialize the frame (optional settings)
        setTitle("Choose a Music File");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Add a button or menu to trigger file selection (optional)
        JButton chooseButton = new JButton("Select File");
        chooseButton.addActionListener(e -> showFileChooser());
        add(chooseButton);
    }

    private void showFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a Music File");

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String selectedFilePath = selectedFile.getAbsolutePath();
            System.out.println("Selected file path: " + selectedFilePath);

            // Here you can do something with the selected file path
            // For example, pass it to another method or update a label in the UI
        }
    }

    // Optionally, you could include a method to return the selected file path
    // if you need to use it in another class.
}

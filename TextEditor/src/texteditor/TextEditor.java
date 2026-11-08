package texteditor;

public class TextEditor extends javax.swing.JFrame {

    public TextEditor() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Text Editor System");
        setSize(800, 600);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TextEditor().setVisible(true);
        });
    }
}

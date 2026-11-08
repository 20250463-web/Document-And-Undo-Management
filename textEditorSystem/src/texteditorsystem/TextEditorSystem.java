
package texteditorsystem;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TextEditorSystem {

   
    public class TextEditorSystem extends JFrame {

    // NODE FOR STACK
    class Node {
        String text;
        String action;
        Node next;

        Node(String text, String action) {
            this.text = text;
            this.action = action;
            this.next = null;
        }
    }
    }
    
}

import javax.swing.JOptionPane;

public class gui{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your nmae:");

        if(name.equals("bhanu")){
        JOptionPane.showMessageDialog(null,"your name is:"+ name);
    }
    else{
        JOptionPane.showMessageDialog(null,"invalid user");
    }
}
}
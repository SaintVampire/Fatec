package primeiroprog;

import javax.swing.JOptionPane;

public class PrimeiroProg {

    public static void main(String[] args) {
        String strN1, strN2, strResultado;
        float fltN1, fltN2, fltResultado;

        strN1 = JOptionPane.showInputDialog(null, "Digite o primneiro valor: ");
        strN2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");

        fltN1 = Float.parseFloat(strN1);
        fltN2 = Float.parseFloat(strN2);

        fltResultado = fltN1 + fltN2;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + fltResultado);

    }
    /*
        Versão resumida do código acima:
    
        fltN1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primneiro valor: "));
        fltN2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));

        fltResultado = fltN1 + fltN2;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: " + fltResultado);

    }
*/
}

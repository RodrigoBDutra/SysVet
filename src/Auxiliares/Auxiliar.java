package Auxiliares;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Auxiliar {

    public void limparTodosCampos(Container container) {//1 sugestao de limpar campos da tela
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            } else if (component instanceof Container) {
                limparTodosCampos((Container) component);
            }
        }
    }

    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }
        Date date = null;
        try {
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date) formatar.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    // verify email
    public static boolean validarEmail(JTextField txt) {
        if ((txt.getText().contains("@")) && (txt.getText().contains(".")) && (!txt.getText().contains(" "))) {
            String usuario = new String(txt.getText().substring(0, txt.getText().lastIndexOf('@')));
            String dominio = new String(txt.getText().substring(txt.getText().lastIndexOf('@') + 1, txt.getText().length()));
            if ((usuario.length() >= 1) && (!usuario.contains("@")) && (dominio.contains(".")) && (!dominio.contains("@")) && (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {
                txt.setForeground(Color.BLACK);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "E-mail Inválido!");
                txt.requestFocus();
                txt.setForeground(Color.RED);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "E-mail Inválido!");
            txt.requestFocus();
            txt.setForeground(Color.RED);
            return false;
        }
    }

    // verify campo
    public static boolean validarCampo(JTextField txt) {
        if (txt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo selecionado");
            txt.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    // verify cpf
    public static boolean validarCPF(JTextField strCpf) {

        String cpf = "";

        for (int i = 0; i < strCpf.getText().length(); i++) {
            if (strCpf.getText().charAt(i) != '.' && strCpf.getText().charAt(i) != '-') {
                cpf += String.valueOf(strCpf.getText().charAt(i));
            }
        }
        if (cpf.length() != 11 || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666")
                || cpf.equals("777777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")) {
            JOptionPane.showMessageDialog(null, "CPF Inválido!");
            strCpf.requestFocus();
            strCpf.setForeground(Color.RED);
            return false;
        }

        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        for (int nCount = 1; nCount < cpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(cpf.substring(nCount - 1, nCount)).intValue();          //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
            d1 = d1 + (11 - nCount) * digitoCPF;          //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior. 
            d2 = d2 + (12 - nCount) * digitoCPF;
        }       //Primeiro resto da divisão por 11.      
        resto = (d1 % 11);       //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.  
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        d2 += 2 * digito1;       //Segundo resto da divisão por 11. 
        resto = (d2 % 11);       //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.    
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;       //Digito verificador do CPF que está sendo validado.    
        }
        String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());       //Concatenando o primeiro resto com o segundo.    
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);       //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.  

        if (nDigVerific.equals(nDigResult)) {
            strCpf.setForeground(Color.BLACK);
            return true;
        }
        JOptionPane.showMessageDialog(null, "CPF Inválido!");
        strCpf.requestFocus();
        strCpf.setForeground(Color.RED);
        return false;
    }

}

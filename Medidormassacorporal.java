
package medidormassacorporal;
import javax.swing.JOptionPane;

public class Medidormassacorporal {

    
    public static void main(String[] args) {
        String JoptionPane;
       String nome = JOptionPane.showInputDialog(null, " informe o seu nome");
       Double peso = Double.parseDouble(JOptionPane.showInputDialog("informe seu peso"));
       Double altura = Double.parseDouble(JOptionPane.showInputDialog("informe sua altura"));
       Double imc;
       imc = peso/(altura*altura);
       
       if(imc<16.0){
           JOptionPane.showMessageDialog(null, nome =  " voce esta muito abaixo do peso" , "imc", JOptionPane.WARNING_MESSAGE);
       }
       
       if(imc>16.9 && imc<24.9){
           JOptionPane.showMessageDialog(null, nome =  " voce esta com peso normal" , "imc", JOptionPane.WARNING_MESSAGE);
       }
       
       if(imc>24.9 && imc <29.9){
           JOptionPane.showMessageDialog(null, nome =  " voce esta com sobrepeso" , "imc", JOptionPane.WARNING_MESSAGE);
       }
       
       if(imc>29.9 && imc<34.9){
           JOptionPane.showMessageDialog(null, nome =  " voce esta com nivel de obesidade grau 1" , "imc", JOptionPane.WARNING_MESSAGE);
       }
       
       if(imc>34.0 && imc <39.9){
           JOptionPane.showMessageDialog(null, nome =  " voce esta com nivel de obesidade grau 2" , "imc", JOptionPane.WARNING_MESSAGE);
       }
       
       if(imc>39.9){
           JOptionPane.showMessageDialog(null, nome =  " voce esta com nivel de obesidade grau 3" , "imc", JOptionPane.WARNING_MESSAGE);

       }
       
       
       
    }
    
}
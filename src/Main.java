import javax.swing.*;

import static javax.swing.JOptionPane.showConfirmDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LiquidImpl liquid = new LiquidImpl();

        Plant palmenLaura = new Palm("laura", 5);
        Plant cactus = new Cactus("Igge",0.2);
        Plant carnivorus = new CarnivorousPlant("Meatloaf", 0.7);


        System.out.println(liquid.calculateLiquid(palmenLaura));
        System.out.println(liquid.calculateLiquid(cactus));
        System.out.println(liquid.calculateLiquid(carnivorus));

        JOptionPane.showMessageDialog(null, "Vilken planta?");
        String input = JOptionPane.showInputDialog(null, " ");

        if (input.contains("laura"))  {

            JOptionPane.showMessageDialog(null, palmenLaura.toString());
        }
            if(input.contains("cactus"))  {
                JOptionPane.showMessageDialog(null, cactus.toString());
            }
            else if (input.contains("carnivorus"))  {
                JOptionPane.showMessageDialog(null, carnivorus.toString());
            }
        }
        }



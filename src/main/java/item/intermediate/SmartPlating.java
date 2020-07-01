/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.ReinforcedIronPlate;
import item.basic.Rotor;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class SmartPlating extends ItemBase {

  public SmartPlating(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.SMART_PLATING);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultSmartPlate();
        break;
      case "Plastic":
        plasticSmartPlate();
        break;
    }
  }

  public void defaultSmartPlate() {
    double reinforcedIronPlate = num;
    double rotor = num;
    append(ds.format(num) + " Smart Plates / Minute:  " + ds.format(reinforcedIronPlate) + " R.I.P / minute |  " +
        ds.format(rotor) + " Rotors / minute. Requires  " + ds.format(num / 2) + " Assemblers\n\n");
    new ReinforcedIronPlate(reinforcedIronPlate, alternateRecipes, output);
    append("-\n\n");
    new Rotor(rotor, alternateRecipes, output);
  }

  public void plasticSmartPlate() {
    double reinforcedIronPlate = num / 2;
    double rotor = num / 2;
    double plastic = num * (3 / 2.0);
    append(ds.format(num) + " Plastic Smart Plates / Minute:  " + ds.format(reinforcedIronPlate) + " R.I.P / minute |  " +
        ds.format(rotor) + " Rotors / minute |  " + ds.format(plastic) + " Plastic / Minute" +
        ". Requires  " + ds.format(num / 5) + " Manufacturers\n\n");
    new ReinforcedIronPlate(reinforcedIronPlate, alternateRecipes, output);
    append("-\n\n");
    new Rotor(rotor, alternateRecipes, output);
    append("-\n\n");
    new Plastic(plastic, alternateRecipes, output);
  }

}

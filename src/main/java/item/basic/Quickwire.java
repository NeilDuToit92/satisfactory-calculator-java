/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class Quickwire extends ItemBase {

  public Quickwire(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.QUICKWIRE);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultWire();
        break;
      case "Fused":
        fusedWire();
        break;
    }
  }

  public void defaultWire() {
    double CateriumIngots = num / 5;
    append(ds.format(num) + " QuickWire / Minute:  " + ds.format(CateriumIngots) + " Caterium Ingots / minute. "
        + "Requires  " + ds.format(num / 60) + " Constructors\n\n");
    new CateriumIngot(CateriumIngots, alternateRecipes, output);
  }

  public void fusedWire() {
    double CopperIngots = num * (5 / 12.0);
    double CateriumIngots = num * (1 / 12.0);
    append(ds.format(num) + " Fused QuickWire / Minute:  " + ds.format(CopperIngots) + " Copper Ingots / minute |  " +
        ds.format(CateriumIngots) + " Caterium Ingots / minute. Requires  " + ds.format(num / 90) + " Assemblers\n\n");
    new CopperIngot(CopperIngots, alternateRecipes, output);
    append("-\n\n");
    new CateriumIngot(CateriumIngots, alternateRecipes, output);
  }


}

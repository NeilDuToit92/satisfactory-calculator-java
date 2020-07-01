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

public class Wire extends ItemBase {

  public Wire(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.WIRE);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultWire();
        break;
      case "Fused":
        fusedWire();
        break;
      case "Iron":
        ironWire();
        break;
      case "Caterium":
        cateriumWire();
        break;
    }
  }

  public void defaultWire() {
    double CopperIngots = num / 2;
    append(ds.format(num) + " Wire / Minute:  " + ds.format(CopperIngots) + " Copper Ingots / minute. "
        + "Requires  " + ds.format(num / 30) + " Constructors\n\n");
    new CopperIngot(CopperIngots, alternateRecipes, output);
  }

  public void fusedWire() {
    double CopperIngots = num * (4 / 30.0);
    double CateriumIngots = num * (1 / 30.0);
    append(ds.format(num) + " Fused Wire / Minute:  " + ds.format(CopperIngots) + " Copper Ingots / minute |  " +
        ds.format(CateriumIngots) + " Caterium Ingots / minute. Requires  " + ds.format(num / 90) + " Assemblers\n\n");
    new CopperIngot(CopperIngots, alternateRecipes, output);
    new CateriumIngot(CateriumIngots, alternateRecipes, output);
  }

  public void ironWire() {
    double IronIngots = num * (5 / 9.0);
    append(ds.format(num) + " Iron Wire / Minute:  " + ds.format(IronIngots) + " Iron Ingots / minute. "
        + "Requires  " + ds.format(num / 22.5) + " Constructors\n\n");
    new IronIngot(IronIngots, alternateRecipes, output);
  }

  public void cateriumWire() {
    double CateriumIngots = num * (1 / 8.0);
    append(ds.format(num) + " Caterium Wire / Minute:  " + ds.format(CateriumIngots) + " Caterium Ingots / minute. "
        + "Requires  " + ds.format(num / 120) + " Constructors\n\n");
    new CateriumIngot(CateriumIngots, alternateRecipes, output);
  }

}

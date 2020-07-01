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

public class Screw extends ItemBase {

  public Screw(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.SCREW);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultScrew();
        break;
      case "Casted":
        castedScrew();
        break;
      case "Steel":
        steelScrew();
        break;
    }
  }

  public void defaultScrew() {
    double IronRod = num / 4;
    append(ds.format(num) + " Screws/Minute:  " + ds.format(IronRod) + " Iron Rods / minute. Requires  " + ds.format(num / 40) + " Constructors\n\n");
    new IronRod(IronRod, alternateRecipes, output);
  }

  public void castedScrew() {
    double IronIngot = num / 4;
    append(ds.format(num) + " Casted Screws/Minute:  " + ds.format(IronIngot) + " Iron Ingots / minute. Requires  " + ds.format(num / 50) + " Constructors\n\n");
    new IronIngot(IronIngot, alternateRecipes, output);
  }

  public void steelScrew() {
    double SteelBeam = num / 52;
    append(ds.format(num) + " Steel Screws/Minute:  " + ds.format(SteelBeam) + " Steel Beams / minute. Requires  " + ds.format(num / 260) + " Constructors\n\n");
    new SteelBeam(SteelBeam, alternateRecipes, output);
  }


}

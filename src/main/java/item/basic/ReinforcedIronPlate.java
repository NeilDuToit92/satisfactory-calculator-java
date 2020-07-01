/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.Rubber;

import javax.swing.*;
import java.util.Map;

public class ReinforcedIronPlate extends ItemBase {


  public ReinforcedIronPlate(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.RIP);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultRIP();
        break;
      case "Adhered":
        adheredRIP();
        break;
      case "Bolted":
        boltedRIP();
        break;
      case "Stitched":
        stitchedRIP();
        break;
    }
  }

  public void defaultRIP() {
    double IronPlates = num * 6;
    double Screws = num * 12;
    append(ds.format(num) + " R.I.P / Minute:  " + ds.format(IronPlates) + " Iron Plates / minute |  " +
        ds.format(Screws) + " Screws / minute. Requires  " + ds.format(num / 5) + " Assemblers\n\n");
    new IronPlate(IronPlates, alternateRecipes, output);
    append("-\n\n");
    new Screw(Screws, alternateRecipes, output);

  }

  public void adheredRIP() {
    double IronPlates = num * 3;
    double rubber = num;
    append(ds.format(num) + " Adhered R.I.P / Minute:  " + ds.format(IronPlates) + " Iron Plates / minute |  " +
        ds.format(rubber) + " Rubber / minute. Requires  " + ds.format(num / 3.75) + " Assemblers\n\n");
    new IronPlate(IronPlates, alternateRecipes, output);
    append("-\n\n");
    new Rubber(rubber, alternateRecipes, output);

  }

  public void boltedRIP() {
    double IronPlates = num * 6;
    double Screws = num * (50 / 3.0);
    append(ds.format(num) + " Bolted R.I.P / Minute:  " + ds.format(IronPlates) + " Iron Plates / minute |  " +
        ds.format(Screws) + " Screws / minute. Requires  " + ds.format(num / 15) + " Assemblers\n\n");
    new IronPlate(IronPlates, alternateRecipes, output);
    append("-\n\n");
    new Screw(Screws, alternateRecipes, output);
  }

  public void stitchedRIP() {
    double IronPlates = num * (10 / 3.0);
    double Wire = num * (20 / 3.0);
    append(ds.format(num) + " Stitched R.I.P / Minute:  " + ds.format(IronPlates) + " Iron Plates / minute |  " +
        ds.format(Wire) + " Wire / minute. Requires  " + ds.format(num / 5.625) + " Assemblers\n\n");
    new IronPlate(IronPlates, alternateRecipes, output);
    append("-\n\n");
    new Wire(Wire, alternateRecipes, output);
  }


}

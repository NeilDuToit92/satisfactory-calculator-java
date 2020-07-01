/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.IronRod;
import item.basic.ReinforcedIronPlate;
import item.basic.Screw;
import item.basic.SteelPipe;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class ModularFrame extends ItemBase {

  public ModularFrame(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.MODULAR_FRAME);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultModularFrames();
        break;
      case "Bolted":
        boltedModularFrames();
        break;
      case "Steeled":
        steeledModularFrames();
        break;
    }
  }

  public void defaultModularFrames() {
    double reinforcedIronPlates = num * (3 / 2.0);
    double ironRod = num * 6;
    append(ds.format(num) + " Modular Frames / Minute:  " + ds.format(reinforcedIronPlates) + " R.I.P / minute |  " +
        ds.format(ironRod) + " Iron Rods / minute. Requires  " + ds.format(num / 2) + " Assemblers\n\n");

    append("v-Modular Frame Start-v\n\n");
    new textHighlighter("v-Modular Frame Start-v", new Color(15, 162, 169), output);
    new ReinforcedIronPlate(reinforcedIronPlates, alternateRecipes, output);
    append("-----\n\n");
    new IronRod(ironRod, alternateRecipes, output);
    append("^-Modular Frame End-^\n\n");
    new textHighlighter("^-Modular Frame End-^", new Color(15, 162, 169), output);


  }

  public void boltedModularFrames() {
    double reinforcedIronPlates = num * (3 / 2.0);
    double screws = num * 28;
    append(ds.format(num) + " Bolted Modular Frames / Minute:  " + ds.format(reinforcedIronPlates) + " R.I.P / minute |  " +
        ds.format(screws) + " Screws / minute. Requires  " + ds.format(num / 5) + " Assemblers\n\n");
    append("v-Bolted Modular Frame Start-v\n\n");
    new textHighlighter("v-Bolted Modular Frame Start-v", new Color(15, 162, 169), output);
    new ReinforcedIronPlate(reinforcedIronPlates, alternateRecipes, output);
    append("-----\n\n");
    new Screw(screws, alternateRecipes, output);
    append("^-Bolted Modular Frame End-^\n\n");
    new textHighlighter("^-Bolted Modular Frame End-^", new Color(15, 162, 169), output);

  }

  public void steeledModularFrames() {
    double steelPipe = num * (10 / 3.0);
    double reinforcedIronPlate = num * (2 / 3.0);
    append(ds.format(num) + " Steeled Modular Frames / Minute:  " + ds.format(steelPipe) + " Steel Pipes / minute |  " +
        ds.format(reinforcedIronPlate) + " R.I.P / minute. Requires  " + ds.format(num / 3) + " Assemblers\n\n");
    append("v-Steeled Modular Frame Start-v\n\n");
    new textHighlighter("v-Steeled Modular Frame Start-v", new Color(15, 162, 169), output);
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-----\n\n");
    new ReinforcedIronPlate(reinforcedIronPlate, alternateRecipes, output);
    append("^-Steeled Modular Frame End-^\n\n");
    new textHighlighter("^-Steeled Modular Frame End-^", new Color(15, 162, 169), output);
  }

}

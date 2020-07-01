/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.Quickwire;
import item.basic.SteelPipe;
import item.basic.Wire;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class Stator extends ItemBase {

  public Stator(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.STATOR);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultStator();
        break;
      case "Quickwire":
        quickwireStator();
        break;
    }
  }

  public void defaultStator() {
    double steelPipe = num * 3;
    double wire = num * 8;
    append(ds.format(num) + " Stators / Minute:  " + ds.format(steelPipe) + " Steel Pipes / minute |  " +
        ds.format(wire) + " Wire / minute. Requires  " + ds.format(num / 5) + " Assemblers\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-\n\n");
    new Wire(wire, alternateRecipes, output);

  }

  public void quickwireStator() {
    double steelPipe = num * 2;
    double quickWire = num * (15 / 2.0);
    append(ds.format(num) + " Quickwire Stators / Minute:  " + ds.format(steelPipe) + " Steel Pipes / minute |  " +
        ds.format(quickWire) + " Quickwire / minute. Requires  " + ds.format(num / 8) + " Assemblers\n\n");
    new SteelPipe(steelPipe, alternateRecipes, output);
    append("-\n\n");
    new Quickwire(quickWire, alternateRecipes, output);

  }


}

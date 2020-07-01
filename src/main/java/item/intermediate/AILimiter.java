/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.CopperSheet;
import item.basic.Quickwire;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class AILimiter extends ItemBase {
  public AILimiter(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultAILimiter();
  }

  public void defaultAILimiter() {
    double copperSheet = num * 5;
    double quickWire = num * 20;
    append(ds.format(num) + " A.I. Limiters / Minute:  " + ds.format(copperSheet) + " Copper Sheets / minute |  " +
        ds.format(quickWire) + " Quickwire / minute. Requires  " + ds.format(num / 5) + " Assemblers\n");
    append("v\n-\n");
    new CopperSheet(copperSheet, alternateRecipes, output);
    append("-\n\n");
    new Quickwire(quickWire, alternateRecipes, output);

  }

}

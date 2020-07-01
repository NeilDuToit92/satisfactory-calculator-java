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

public class SteelPipe extends ItemBase {

  public SteelPipe(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultSteelPipe();
  }

  public void defaultSteelPipe() {
    double SteelIngots = num * (3 / 2.0);
    append(ds.format(num) + " Steel Pipes / Minute:  " + ds.format(SteelIngots) + " Steel Ingots / minute. Requires  " + ds.format(num / 20) + " Constructors\n\n");
    new SteelIngot(SteelIngots, alternateRecipes, output);
  }

}

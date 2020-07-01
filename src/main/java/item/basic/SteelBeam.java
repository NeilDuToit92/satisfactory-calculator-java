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

public class SteelBeam extends ItemBase {

  public SteelBeam(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultSteelBeam();
  }

  public void defaultSteelBeam() {
    double SteelIngots = num * 4;
    append(ds.format(num) + " Steel Beams / Minute:  " + ds.format(SteelIngots) + " Steel Ingots / minute. Requires  " + ds.format(num / 15) + " Constructors\n\n");
    new SteelIngot(SteelIngots, alternateRecipes, output);
  }

}

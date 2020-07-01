/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class UraniumPellet extends ItemBase {

  public UraniumPellet(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultUraniumPellet();
  }

  public void defaultUraniumPellet() {
    double uranium = num;
    double sulfuricAcid = num * (6 / 5.0);
    append(ds.format(num) + " Uranium Pellets / Minute:  " + ds.format(uranium) + " Raw Uranium / minute |  " +
        ds.format(sulfuricAcid) + " Sulfuric Acid(m3) / minute (takes into account excess from output). Requires  " + ds.format(num / 5) + " Refineries\n\n");
    new SulfuricAcid(sulfuricAcid, alternateRecipes, output);

  }

}

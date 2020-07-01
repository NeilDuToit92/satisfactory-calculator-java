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
public class SulfuricAcid extends ItemBase {

  public SulfuricAcid(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultSulfuricAcid();
  }

  public void defaultSulfuricAcid() {
    double sulfur = num / 2;
    double water = num / 2;
    append(ds.format(num) + " Sulfuric Acid(m3) / Minute:  " + ds.format(sulfur) + " Sulfur / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / 100) + " Refineries\n\n");
  }

}

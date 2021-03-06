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
public class HeavyOilResidue extends ItemBase {

  private double polymerResin = 0;

  public HeavyOilResidue(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultHeavyOilResidue();
  }

  public void defaultHeavyOilResidue() {
    double RawOil = num * (3 / 4.0);
    double PolymerResin = num / 2;
    polymerResin += PolymerResin;
    append(ds.format(num) + " Heavy Oil Residue(m3) / Minute: and  " + ds.format(PolymerResin) +
        " Polymer Resin / Minute:  " + ds.format(RawOil) + " Raw Oil(m3) / minute. Requires  " +
        ds.format(num / 40) + " Refineries\n\n");
  }

  public double getPolymerResin() {
    return polymerResin;
  }


}

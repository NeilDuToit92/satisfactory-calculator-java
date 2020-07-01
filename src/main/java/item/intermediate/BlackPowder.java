/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.CompactedCoal;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class BlackPowder extends ItemBase {

  public BlackPowder(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.BLACK_POWDER);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultBlackPowder();
        break;
      case "Gun Powder":
        gunPowder();
        break;
    }
  }

  public void defaultBlackPowder() {
    double coal = num;
    double sulfur = num * 2;
    append(ds.format(num) + " Black Powder / Minute:  " + ds.format(coal) + " Raw Coal / minute |  " +
        ds.format(sulfur) + " Sulfur / minute. Requires  " + ds.format(num / 7.5) + " Assemblers\n\n");
  }

  public void gunPowder() {
    double sulfur = num / 2;
    double compactedCoal = num / 4;
    append(ds.format(num) + " Gun Powder / Minute:  " + ds.format(sulfur) + " Sulfur / minute |  " +
        ds.format(compactedCoal) + " Compacted Coal / minute. Requires  " + ds.format(num / 15) + " Assemblers\n\n");
    new CompactedCoal(compactedCoal, alternateRecipes, output);

  }


}

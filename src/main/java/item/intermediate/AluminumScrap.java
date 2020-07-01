/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.PetroleumCoke;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class AluminumScrap extends ItemBase {

  public AluminumScrap(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.ALUMINUM_SCRAP);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultAluminumScrap();
        break;
      case "Electrode":
        electrodeAluminumScrap();
        break;
    }
  }

  public void defaultAluminumScrap() {
    double aluminaSolution = num * (4 / 6.0);
    double petroleumCoke = num * (1 / 6.0);
    double water = num * (1 / 6.0);
    append(ds.format(num) + " Aluminum Scrap / Minute: and " + ds.format(water) + " water(m3) / Minute" +
        ":  " + ds.format(aluminaSolution) + " Alumina Solution / minute |  " +
        ds.format(petroleumCoke) + " Petroleum Coke / minute. Requires  " + ds.format(num / 360) + " Refineries\n\n");
    new AluminaSolution(aluminaSolution, alternateRecipes, output);
    new PetroleumCoke(petroleumCoke, alternateRecipes, output);
  }

  public void electrodeAluminumScrap() {
    double aluminaSolution = num * (3 / 5.0);
    double coal = num * (1 / 5.0);
    double water = num * (1 / 5.0);
    append(ds.format(num) + " Aluminum Scrap / Minute: and " + ds.format(water) + " water(m3) / Minute" +
        ":  " + ds.format(aluminaSolution) + " Alumina Solution / minute |  " +
        ds.format(coal) + " Raw Coal / minute. Requires  " + ds.format(num / 360) + " Refineries\n\n");
    new AluminaSolution(aluminaSolution, alternateRecipes, output);
  }

}

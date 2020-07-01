package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class IronIngot extends ItemBase {

  public IronIngot(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.IRON);
    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultIngot();
        break;
      case "Pure":
        pureIngot();
        break;
      case "Alloy":
        alloy();
        break;
    }
  }

  public void defaultIngot() {
    double IronOre = num;
    append(ds.format(num) + " Iron Ingots / Minute:  " + ds.format(IronOre) + " Iron Ore / minute. Requires  " + ds.format(num / 30) + " Smelters\n\n");
  }

  public void pureIngot() {
    double IronOre = num * (7 / 13.0);
    double water = num * (4 / 13.0);
    append(ds.format(num) + " Pure Iron Ingots / Minute:  " + ds.format(IronOre) + " Iron Ore / minute:  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / 65) + " Refineries\n\n");
  }

  public void alloy() {
    double IronOre = num * (2 / 5.0);
    double CopperOre = num * (2 / 5.0);
    append(ds.format(num) + " Alloy Iron Ingots / Minute:  " + ds.format(IronOre) + " Iron Ore / minute |  " +
        ds.format(CopperOre) + " Copper Ore / minute. Requires  " + ds.format(num / 50) + " Foundries\n\n");
  }


}

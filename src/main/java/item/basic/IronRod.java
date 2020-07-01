package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class IronRod extends ItemBase {

  public IronRod(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.IRON_ROD);
    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultRod();
        break;
      case "Steel":
        steelRod();
        break;
    }
  }

  public void defaultRod() {
    double IronIngot = num;
    append(ds.format(num) + " Iron Rods/Minute:  " + ds.format(IronIngot) + " Iron Ingots / minute. Requires  " + ds.format(num / 15) + " Constructors\n\n");
    new IronIngot(num, alternateRecipes, output);
  }

  public void steelRod() {
    double steelIngot = num / 4;
    append(ds.format(num) + " Steel Iron Rods/Minute:  " + ds.format(steelIngot) + " Steel Ingots / minute. Requires  " + ds.format(num / 48) + " Constructors\n\n");
    new SteelIngot(steelIngot, alternateRecipes, output);
  }


}

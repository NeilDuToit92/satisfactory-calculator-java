package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.Plastic;

import javax.swing.*;
import java.util.Map;

public class IronPlate extends ItemBase {

  public IronPlate(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.IRON_PLATE);
    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultIronPlate();
        break;
      case "Coated":
        coatedPlate();
        break;
      case "Steel Coated":
        steelCoatedPlate();
        break;
    }
  }

  public void defaultIronPlate() {
    double IronIngots = num * (3 / 2.0);
    append(ds.format(num) + " Iron Plates / Minute:  " + ds.format(IronIngots) + " Iron Ingots / minute. Requires  " + ds.format(num / 20) + " Constructors\n\n");
    new IronIngot(IronIngots, alternateRecipes, output);
  }

  public void coatedPlate() {
    double IronIngots = num * (10 / 15.0);
    double Plastic = num * (2 / 15.0);
    append(ds.format(num) + " Coated Iron Plates / Minute:  " + ds.format(IronIngots) + " Iron Ingots / minute |  " +
        ds.format(Plastic) + " Plastic / minute. Requires  " + ds.format(num / 75) + " Assemblers\n\n");
    new IronIngot(IronIngots, alternateRecipes, output);
    append("-\n\n");
    new Plastic(Plastic, alternateRecipes, output);
  }

  public void steelCoatedPlate() {
    double SteelIngots = num * (3 / 18.0);
    double Plastic = num * (2 / 18.0);
    append(ds.format(num) + " Steel Coated Iron Plates / Minute:  " + ds.format(SteelIngots) + " Steel Ingots / minute |  " +
        ds.format(Plastic) + " Plastic / minute. Requires  " + ds.format(num / 45) + " Assemblers\n\n");
    new SteelIngot(SteelIngots, alternateRecipes, output);
    append("-\n\n");
    new Plastic(Plastic, alternateRecipes, output);
  }
}

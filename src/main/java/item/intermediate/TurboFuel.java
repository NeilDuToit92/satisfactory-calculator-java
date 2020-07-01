package item.intermediate;

import item.Item;
import item.ItemBase;
import item.basic.CompactedCoal;

import javax.swing.*;
import java.util.Map;

public class TurboFuel extends ItemBase {

  public TurboFuel(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.TURBO_FUEL);
    switch (getAlternateRecipeSelectedItem()) {

      case "Turbofuel":
        turbofuel();
        break;
      case "Heavy Turbofuel":
        heavyTurbofuel();
        break;
    }
  }

  public void turbofuel() {
    double fuel = num * (6 / 5.0);
    double compactedCoal = num * (4 / 5.0);
    append(ds.format(num) + " TurboFuel(m3) / Minute:  " + ds.format(fuel) + " Fuel(m3)" +
        " / minute |  " + ds.format(compactedCoal) + " Compacted Coal / minute. Requires  " + ds.format(num / 18.75) + " Refineries\n\n");
    new Fuel(fuel, alternateRecipes, output);
    new CompactedCoal(compactedCoal, alternateRecipes, output);
  }

  public void heavyTurbofuel() {
    double heavyOilResidue = num * (5 / 4.0);
    double compactedCoal = num;
    append(ds.format(num) + " TurboFuel(m3) / Minute:  " + ds.format(heavyOilResidue) + " Heavy Oil Residue(m3)" +
        " / minute |  " + ds.format(compactedCoal) + " Compacted Coal / minute. Requires  " + ds.format(num / 30) + " Refineries\n\n");
    new HeavyOilResidue(heavyOilResidue, alternateRecipes, output);
    new CompactedCoal(compactedCoal, alternateRecipes, output);
  }


}

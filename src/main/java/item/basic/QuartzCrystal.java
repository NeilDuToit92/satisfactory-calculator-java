package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class QuartzCrystal extends ItemBase {

  public QuartzCrystal(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.QUARTZ_CRYSTAL);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultQuartzCrystal();
        break;
      case "Pure":
        pureQuartzCrystal();
        break;
    }
  }

  public void defaultQuartzCrystal() {
    double RawQuartz = num * (5 / 3.0);
    append(ds.format(num) + " Quartz Crystal / Minute:  " + ds.format(RawQuartz) + " Raw Quartz / minute. Requires  " + ds.format(num / 22.5) + " Constructors\n\n");
  }

  public void pureQuartzCrystal() {
    double RawQuartz = num * (9 / 7.0);
    double water = num * (5 / 7.0);
    append(ds.format(num) + " Pure Quartz Crystal / Minute: " + ds.format(RawQuartz) + " Raw Quartz / minute |  " +
        ds.format(water) + " water(m3) / minute. Requires  " + ds.format(num / 52.5) + " Refineries\n\n");
  }

}

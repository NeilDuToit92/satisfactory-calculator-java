package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class Silica extends ItemBase {

  public Silica(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.SILICA);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultSilica();
        break;
      case "Cheap":
        cheapSilica();
        break;
    }
  }

  public void defaultSilica() {
    double RawQuartz = num * (3 / 5.0);
    append(ds.format(num) + " Silica / Minute:  " + ds.format(RawQuartz) + " Raw Quartz / minute.  " +
        "Requires " + ds.format(num / 37.5) + " Constructors\n\n");
  }

  public void cheapSilica() {
    double RawQuartz = num * (3 / 7.0);
    double Limestone = num * (5 / 7.0);
    append(ds.format(num) + " Cheap Silica / Minute:  " + ds.format(RawQuartz) + " Raw Quartz / minute |  " +
        ds.format(Limestone) + " Limestone / minute. Requires  " + ds.format(num / 26.25) + " Assemblers\n\n");
  }

}

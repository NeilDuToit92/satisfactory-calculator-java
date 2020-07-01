package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.AlcadAluminumSheet;
import item.basic.Wire;
import item.intermediate.Plastic;

import javax.swing.*;
import java.util.Map;

public class Battery extends ItemBase {

  public Battery(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultBattery();
  }

  public void defaultBattery() {
    double alcadSheets = num * (8 / 3.0);
    double wire = num * (16 / 3.0);
    double rawSulfur = num * (20 / 3.0);
    double plastic = num * (8 / 3.0);
    append(ds.format(num) + " Batteries / Minute:  " + ds.format(alcadSheets) + " Alcad Sheets / minute |  " +
        ds.format(wire) + " Wire / minute |  " + ds.format(rawSulfur) + " Sulfur / Minute |  " +
        ds.format(plastic) + " Plastic / minute" +
        ". Requires  " + ds.format(num / 5.625) + " Manufacturers\n\n");
    new AlcadAluminumSheet(alcadSheets, alternateRecipes, output);
    new Wire(wire, alternateRecipes, output);
    new Plastic(plastic, alternateRecipes, output);
  }

}

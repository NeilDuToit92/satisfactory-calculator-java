package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class CopperSheet extends ItemBase {

  public static final int DEFAULT_COPPER_SHEET_COPPER_INGOT = 2;
  public static final int DEFAULT_COPPER_SHEET_AMT_PER_MINUTE = 10;

  public CopperSheet(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.COPPER_SHEET);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultCopperSheet();
      case "Steamed":
        steamedCopperSheet();
    }
  }

  public void defaultCopperSheet() {
    double CopperIngots = num * DEFAULT_COPPER_SHEET_COPPER_INGOT;
    append(ds.format(num) + " Copper Sheets/Minute:  " + ds.format(CopperIngots) + " Copper Ingots / minute.  "
        + "Requires  " + ds.format(num / DEFAULT_COPPER_SHEET_AMT_PER_MINUTE) + " Constructors\n\n");
    new CopperIngot(CopperIngots, alternateRecipes, output);
  }

  public void steamedCopperSheet() {
    double CopperIngots = num;
    double water = num;
    append(ds.format(num) + " Steamed Copper Sheets / Minute:  " + ds.format(CopperIngots) + " Copper Ingots / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / 22.5) + " Refineries\n\n");
    new CopperIngot(CopperIngots, alternateRecipes, output);
  }

}

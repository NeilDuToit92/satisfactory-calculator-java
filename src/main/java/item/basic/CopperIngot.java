package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class CopperIngot extends ItemBase {

  public static final int COPPER_DEFAULT_INGOT_ORE = 1;
  public static final int COPPER_DEFAULT_INGOT_AMT_PER_MINUTE = 30;

  public static final double COPPER_PURE_INGOT_COPPER_ORE = (6 / 15.0);
  public static final double COPPER_PURE_INGOT_WATER = (4 / 15.0);
  public static final double COPPER_PURE_INGOT_AMT_PER_MINUTE = 37.5;

  public static final double COPPER_ALLOY_IRON_ORE = (1 / 4.0);
  public static final double COPPER_ALLOY_COPPER_ORE = (1 / 2.0);
  public static final int COPPER_ALLOY_AMT_PER_MINUTE = 100;

  public CopperIngot(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.COPPER);

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
    double CopperOre = num * COPPER_DEFAULT_INGOT_ORE;
    append(ds.format(num) + " Copper Ingots / Minute:  " + ds.format(CopperOre) + " Copper Ore / minute.  " +
        "Requires " + ds.format(num / COPPER_DEFAULT_INGOT_AMT_PER_MINUTE) + " Smelters\n\n");
  }

  public void pureIngot() {
    double CopperOre = num * COPPER_PURE_INGOT_COPPER_ORE;
    double water = num * COPPER_PURE_INGOT_WATER;
    append(ds.format(num) + " Pure Copper Ingots / Minute:  " + ds.format(CopperOre) + " Copper Ore / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / COPPER_PURE_INGOT_AMT_PER_MINUTE) + " Refineries\n\n");
  }

  public void alloy() {
    double IronOre = num * COPPER_ALLOY_IRON_ORE;
    double CopperOre = num * COPPER_ALLOY_COPPER_ORE;
    append(ds.format(num) + " Alloy Copper Ingots / Minute:  " + ds.format(IronOre) + " Iron Ore / minute |  " +
        ds.format(CopperOre) + " Copper Ore / minute. Requires  " + ds.format(num / COPPER_ALLOY_AMT_PER_MINUTE) + " Foundries\n\n");
  }


}

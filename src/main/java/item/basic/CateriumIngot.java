package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class CateriumIngot extends ItemBase {

  public static final int DEFAULT_CATERIUM_AMT_PER_MINUTE = 15;
  public static final int DEFAULT_CATERIUM_ORE = 3;

  public static final int PURE_CATERIUM_ORE = 2;
  public static final int PURE_CATERIUM_WATER = 2;
  public static final int PURE_CATERIUM_AMT_PER_MINUTE = 12;

  public CateriumIngot(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.CATERIUM);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultCaterium();
        break;
      case "Pure":
        pureCaterium();
        break;
    }
  }

  public void defaultCaterium() {
    double CateriumOre = num * DEFAULT_CATERIUM_ORE;
    append(ds.format(num) + " Caterium Ingots/Minute:  " + ds.format(CateriumOre) + " Caterium Ore / minute. Requires  " + ds.format(num / DEFAULT_CATERIUM_AMT_PER_MINUTE) + " Smelters\n\n");
  }

  public void pureCaterium() {
    double CateriumOre = num * PURE_CATERIUM_ORE;
    double water = num * PURE_CATERIUM_WATER;
    append(ds.format(num) + " Pure Caterium Ingots/Minute:  " + ds.format(CateriumOre) + " Caterium Ore / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / PURE_CATERIUM_AMT_PER_MINUTE) + " Refineries\n\n");
  }


}

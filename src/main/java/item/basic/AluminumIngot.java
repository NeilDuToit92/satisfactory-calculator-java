package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.AluminumScrap;

import javax.swing.*;
import java.util.Map;

public class AluminumIngot extends ItemBase {
  public static final int DEFAULT_ALUMINUM_ALUMINUM_SCRAPS = 3;
  public static final double DEFAULT_ALUMINUM_SILICA = (7 / 4.0);
  public static final int DEFAULT_ALUMINUM_AMT_PRE_MINUTE = 80;

  public static final int PURE_ALUMINUM_ALUMINUM_SCRAPS = 4;
  public static final int PURE_ALUMINUM_AMT_PER_MINUTE = 36;

  public AluminumIngot(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.ALUMINUM_INGOT);

    switch (getAlternateRecipeSelectedItem()) {
      case "Pure":
        pureAluminum();
        break;
      case "Default":
      default:
        defaultAluminum();
        break;
    }
  }

  public void pureAluminum() {
    double aluminumScrap = num * PURE_ALUMINUM_ALUMINUM_SCRAPS;
    append(ds.format(num) + "  Pure Aluminum Ingots / Minute: " + ds.format(aluminumScrap) + "  Aluminum Scrap" +
        " / minute. Requires  " + ds.format(num / PURE_ALUMINUM_AMT_PER_MINUTE) + " Smelters\n\n");
    new AluminumScrap(aluminumScrap, alternateRecipes, output);

  }

  public void defaultAluminum() {
    double aluminumScrap = num * DEFAULT_ALUMINUM_ALUMINUM_SCRAPS;
    double silica = num * DEFAULT_ALUMINUM_SILICA;
    append(ds.format(num) + " Aluminum Ingots / Minute:  " + ds.format(aluminumScrap) + " Aluminum Scrap / minute |  " +
        ds.format(silica) + " Silica / minute. Requires  " + ds.format(num / DEFAULT_ALUMINUM_AMT_PRE_MINUTE) + " Foundries\n\n");
    new AluminumScrap(aluminumScrap, alternateRecipes, output);
  }

}

package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class AlcadAluminumSheet extends ItemBase {

  public static final int DEFAULT_ALCLAD_SHEET_ALUMINIUM_INGOTS = 2;
  public static final double DEFAULT_ALCLAD_SHEET_COPPER_INGOTS = (3 / 4.0);
  public static final int DEFAULT_ALCLAD_SHEET_AMT_PER_MINUTE = 30;

  public AlcadAluminumSheet(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultAlcadSheet();
  }

  public void defaultAlcadSheet() {
    double aluminumIngot = num * DEFAULT_ALCLAD_SHEET_ALUMINIUM_INGOTS;
    double copperIngot = num * DEFAULT_ALCLAD_SHEET_COPPER_INGOTS;
    append(ds.format(num) + " Alcad Aluminum Sheets / Minute:  " + ds.format(aluminumIngot) + " Aluminum Ingots / minute |  " +
        ds.format(copperIngot) + " Copper Ingots / minute. Requires  " + ds.format(num / DEFAULT_ALCLAD_SHEET_AMT_PER_MINUTE) + " Assemblers\n\n");
    new AluminumIngot(aluminumIngot, alternateRecipes, output);
    new CopperIngot(copperIngot, alternateRecipes, output);

  }

}

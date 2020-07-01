package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.HeavyOilResidue;

import javax.swing.*;
import java.util.Map;

public class PetroleumCoke extends ItemBase {

  public PetroleumCoke(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultCoke();
  }

  public void defaultCoke() {
    double HeavyOilResidue = num / 3;
    append(ds.format(num) + " Petroleum Coke / Minute:  " + ds.format(HeavyOilResidue) + " Heavy Oil Residue(m3)" +
        " / minute. Requires  " + ds.format(num / 120) + " Refineries\n\n");
    new HeavyOilResidue(HeavyOilResidue, alternateRecipes, output);
  }
}

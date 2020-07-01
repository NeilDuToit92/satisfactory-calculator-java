package item.basic;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

public class CompactedCoal extends ItemBase {

  public static final int DEFAULT_COMPACTED_COAL_AMT_PER_MINUTE = 25;
  public static final int DEFAULT_COAL_RAW_COAL = 1;
  public static final int DEFAULT_COAL_SULFUR = 1;

  public CompactedCoal(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultCompactedCoal();
  }

  public void defaultCompactedCoal() {
    double RawCoal = num * DEFAULT_COAL_RAW_COAL;
    double Sulfur = num * DEFAULT_COAL_SULFUR;
    append(ds.format(num) + " Compacted Coal/Minute:  " + ds.format(RawCoal) + " Raw Coal / minute. Requires |  " +
        ds.format(Sulfur) + " Sulfur / minute. Requires  " + ds.format(num / DEFAULT_COMPACTED_COAL_AMT_PER_MINUTE) + " Foundries\n\n");
  }


}

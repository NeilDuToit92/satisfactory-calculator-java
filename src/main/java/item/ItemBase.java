package item;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Map;

/**
 * This is the base class for all items to extend
 */
public class ItemBase {
  protected double num;
  protected Map<Item, JComboBox<String>> alternateRecipes;
  protected JTextArea output;
  protected DecimalFormat ds = new DecimalFormat("#.##");
  protected Item item;

  /**
   * Constructor to be used if the item has an alternate recipes drop down
   */
  public ItemBase(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output, Item item) {
    this.num = num;
    this.alternateRecipes = alternateRecipes;
    this.output = output;
    this.item = item;
  }

  /**
   * Constructor to be used if the item does not have an alternate recipes drop down
   */
  public ItemBase(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    this.num = num;
    this.alternateRecipes = alternateRecipes;
    this.output = output;
  }

  protected void append(String data) {
    //Now all output from items to the text area can be handled in a single place.
    //Things like line wrapping can be done here in the future instead of having the panel scroll
    output.append(data);
  }

  /**
   * Get the selected recipe based on alternateRecipeIndex
   */
  protected String getAlternateRecipeSelectedItem() {
    //Use String.valueOf instead of toString()
    return String.valueOf(alternateRecipes.get(item).getSelectedItem());
  }
}

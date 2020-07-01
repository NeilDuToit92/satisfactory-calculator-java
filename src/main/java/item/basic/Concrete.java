package item.basic;

import item.Item;
import item.ItemBase;
import item.intermediate.Rubber;

import javax.swing.*;
import java.util.Map;

public class Concrete extends ItemBase {

  public static final int DEFAULT_CONCRETE_LIMESTONE = 3;
  public static final int DEFAULT_CONCRETE_AMT_PER_MINUTE = 15;

  public static final double RUBBER_CONCRETE_LIMESTONE = (10 / 9.0);
  public static final double RUBBER_CONCRETE_RUBBER = (2 / 9.0);
  public static final int RUBBER_CONCRETE_AMT_PER_MINUTE = 45;

  public static final double WET_CONCRETE_LIMESTONE = (6 / 4.0);
  public static final double WET_CONCRETE_WATER = (5 / 4.0);
  public static final int WET_CONCRETE_AMT_PER_MINUTE = 80;

  public static final double FINE_CONCRETE_LIMESTONE = (12 / 10.0);
  public static final double FINE_CONCRETE_SILICA = (3 / 10.0);
  public static final int FINE_CONCRETE_AMT_PER_MINUTE = 25;

  public Concrete(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.CONCRETE);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultConcrete();
        break;
      case "Rubber":
        rubberConcrete();
        break;
      case "Wet":
        wetConcrete();
        break;
      case "Fine":
        fineConcrete();
        break;
    }
  }

  public void defaultConcrete() {
    double Limestone = num * DEFAULT_CONCRETE_LIMESTONE;
    append(ds.format(num) + " Concrete/Minute:  " + ds.format(Limestone) + " Limestone / minute. Requires  "
        + ds.format(num / DEFAULT_CONCRETE_AMT_PER_MINUTE) + " Constructors\n\n");
  }

  public void rubberConcrete() {
    double Limestone = num * RUBBER_CONCRETE_LIMESTONE;
    double rubber = num * RUBBER_CONCRETE_RUBBER;
    append(ds.format(num) + " Rubber Concrete/Minute:  " + ds.format(Limestone) + " Limestone / minute |   " +
        ds.format(rubber) + " Rubber / minute. Requires   " + ds.format(num / RUBBER_CONCRETE_AMT_PER_MINUTE) + " Assemblers\n\n");
    new Rubber(rubber, alternateRecipes, output);
  }

  public void wetConcrete() {
    double Limestone = num * WET_CONCRETE_LIMESTONE;
    double Water = num * WET_CONCRETE_WATER;
    append(ds.format(num) + " Wet Concrete/Minute:  " + ds.format(Limestone) + " Limestone / minute |  " +
        ds.format(Water) + " Water(m3) / minute. Requires  " + ds.format(num / WET_CONCRETE_AMT_PER_MINUTE) + " Refineries\n\n");
  }

  public void fineConcrete() {
    double Limestone = num * FINE_CONCRETE_LIMESTONE;
    double Silica = num * FINE_CONCRETE_SILICA;
    append(ds.format(num) + " Fine Concrete/Minute:  " + ds.format(Limestone) + " Limestone / minute |  " +
        ds.format(Silica) + " Silica / minute. Requires  " + ds.format(num / FINE_CONCRETE_AMT_PER_MINUTE) + " Assemblers\n\n");
    new Silica(Silica, alternateRecipes, output);
  }


}

package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.Motor;
import item.intermediate.Rubber;
import item.intermediate.SmartPlating;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ModularEngine extends ItemBase {

  public ModularEngine(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultModularEngine();
  }

  public void defaultModularEngine() {
    double motors = num * 2;
    double rubber = num * 15;
    double smartPlating = num * 2;
    append(ds.format(num) + " Modular Engines / Minute:  " + ds.format(motors) + " Motors / minute |  " +
        ds.format(rubber) + " Rubber / minute |  " + ds.format(smartPlating) + " Smart Plating / Minute" +
        ". Requires  " + ds.format(num / 1) + " Manufacturers\n\n");

    append("v-Modular Engine Start-v\n\n");
    new textHighlighter("v-Modular Engine Start-v", Color.ORANGE, output);
    new Motor(motors, alternateRecipes, output);
    append("-----\n\n");
    new Rubber(rubber, alternateRecipes, output);
    append("-----\n\n");
    new SmartPlating(smartPlating, alternateRecipes, output);
    append("^-Modular Engine End-^\n\n");
    new textHighlighter("^-Modular Engine End-^", Color.ORANGE, output);

  }

}

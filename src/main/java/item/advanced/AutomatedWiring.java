package item.advanced;


import item.Item;
import item.ItemBase;
import item.basic.Cable;
import item.basic.Wire;
import item.intermediate.Stator;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class AutomatedWiring extends ItemBase {

  public AutomatedWiring(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.AUTOMATED_WIRING);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultWiring();
        break;
      case "High-Speed":
        highspeedWiring();
        break;
    }
  }

  public void defaultWiring() {
    double stator = num;
    double cable = num * 20;
    append(ds.format(num) + " Automated Wiring / Minute:  " + ds.format(stator) + " Stators / minute |  " +
        ds.format(cable) + " Cable / minute. Requires  " + ds.format(num / 2.5) + " Assemblers\n\n");

    append("v-Automated Wiring Start-v\n\n");
    new textHighlighter("v-Automated Wiring Start-v", new Color(121, 98, 14), output);

    new Stator(stator, alternateRecipes, output);
    append("-----\n\n");
    new Cable(cable, alternateRecipes, output);

    append("^-Automated Wiring End-^\n\n");
    new textHighlighter("^-Automated Wiring End-^", new Color(121, 98, 14), output);
  }

  public void highspeedWiring() {
    double stator = num / 2;
    double wire = num * 10;
    double highspeedConnector = num / 4;
    append(ds.format(num) + " High-Speed Automated Wiring / Minute:  " + ds.format(stator) + " Stators / minute |  " +
        ds.format(wire) + " Wire / minute |  " + ds.format(highspeedConnector) + " High-Speed Connectors / Minute" +
        ". Requires  " + ds.format(num / 7.5) + " Manufacturers\n\n");

    append("v-High-Speed Automated Wiring Start-v\n\n");
    new textHighlighter("v-High-Speed Automated Wiring Start-v", new Color(121, 98, 14), output);

    new Stator(stator, alternateRecipes, output);
    append("-----\n\n");
    new Wire(wire, alternateRecipes, output);

    append("-----\n\n");
    new HighSpeedConnector(highspeedConnector, alternateRecipes, output);

    append("^-High-Speed Automated Wiring End-^\n\n");
    new textHighlighter("^-High-Speed Automated Wiring End-^", new Color(121, 98, 14), output);

  }

}

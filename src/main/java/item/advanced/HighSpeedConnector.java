package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.Cable;
import item.basic.Quickwire;
import item.basic.Silica;
import item.intermediate.CircuitBoard;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class HighSpeedConnector extends ItemBase {

  public HighSpeedConnector(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.HIGH_SPEED_CONNECTOR);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultConnector();
        break;
      case "Silicone":
        siliconeConnector();
        break;
    }
  }

  public void defaultConnector() {
    double quickWire = num * 56;
    double cable = num * 10;
    double circuits = num;
    append(ds.format(num) + " High Speed Connectors / Minute:  " + ds.format(quickWire) + " Quickwire / minute |  " +
        ds.format(cable) + " Cable / minute |  " + ds.format(circuits) + " Circuit Boards / Minute" +
        ". Requires  " + ds.format(num / 3.75) + " Manufacturers\n\n");

    append("v-High-Speed Connector Start-v\n\n");
    new textHighlighter("v-High-Speed Connector Start-v", new Color(66, 197, 60), output);
    new Quickwire(quickWire, alternateRecipes, output);
    append("-----\n\n");
    new Cable(cable, alternateRecipes, output);
    append("-----\n\n");
    new CircuitBoard(circuits, alternateRecipes, output);
    append("^-High-Speed Connector End-^\n\n");
    new textHighlighter("^-High-Speed Connector End-^", new Color(66, 197, 60), output);
  }

  public void siliconeConnector() {
    double quickWire = num * 30;
    double silica = num * (25 / 2.0);
    double circuits = num;
    append(ds.format(num) + " Silicone High Speed Connectors / Minute: " + ds.format(quickWire) + " Quickwire / minute | " +
        ds.format(silica) + " Silica / minute | " + ds.format(circuits) + " Circuit Boards / Minute" +
        ". Requires " + ds.format(num / 3) + " Manufacturers\n\n");
    append("v-Silicone High-Speed Connector Start-v\n\n");
    new textHighlighter("v-Silicone High-Speed Connector Start-v", new Color(66, 197, 60), output);
    new Quickwire(quickWire, alternateRecipes, output);
    append("-----\n\n");
    new Silica(silica, alternateRecipes, output);
    append("-----\n\n");
    new CircuitBoard(circuits, alternateRecipes, output);
    append("^-Silicone High-Speed Connector End-^\n\n");
    new textHighlighter("^-Silicone High-Speed Connector End-^", new Color(66, 197, 60), output);
  }


}

package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.AILimiter;
import item.intermediate.Plastic;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class Supercomputer extends ItemBase {

  public Supercomputer(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultSupercomputer();
  }

  public void defaultSupercomputer() {
    double computers = num * 2;
    double aiLimiters = num * 2;
    double highspeedConnectors = num * 3;
    double plastic = num * 28;
    append(ds.format(num) + " Supercomputers / Minute:  " + ds.format(computers) + " Computers / minute |  " +
        ds.format(aiLimiters) + " AI Limiters / minute |  " + ds.format(highspeedConnectors) + " High-Speed Connectors / Minute |  " +
        ds.format(plastic) + " Plastic / minute" +
        ". Requires  " + ds.format(num / 1.875) + " Manufacturers\n\n");


    append("v-Supercomputers Start-v\n\n");
    new textHighlighter("v-Supercomputers Start-v", Color.magenta, output);

    new Computer(computers, alternateRecipes, output);
    append("-----\n\n");
    new AILimiter(aiLimiters, alternateRecipes, output);
    append("-----\n\n");
    new HighSpeedConnector(highspeedConnectors, alternateRecipes, output);
    append("-----\n\n");
    new Plastic(plastic, alternateRecipes, output);

    append("^-Supercomputers End-^\n\n");
    new textHighlighter("^-Supercomputers End-^", Color.magenta, output);

  }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.advanced;

import item.Item;
import item.ItemBase;
import item.intermediate.AILimiter;
import item.intermediate.Stator;
import master.textHighlighter;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class ElectromagneticControlRod extends ItemBase {

  public ElectromagneticControlRod(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.ELECTROMAGNETIC_CONTROL_ROD);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultControlRod();
        break;
      case "Connection":
        connectionControlRod();
        break;
    }
  }

  public void defaultControlRod() {
    double stators = num * (3 / 2.0);
    double aiLimiters = num;
    append(ds.format(num) + " Electromagnetic Control Rods / Minute:  " + ds.format(stators) + " Stators / minute |  " +
        ds.format(aiLimiters) + " AI Limiters / minute. Requires  " + ds.format(num / 4) + " Assemblers\n\n");

    append("v-Control Rod Start-v\n\n");
    new textHighlighter("v-Control Rod Start-v", new Color(147, 10, 45), output);
    new Stator(stators, alternateRecipes, output);
    append("-----\n\n");
    new AILimiter(aiLimiters, alternateRecipes, output);
    append("^-Control Rod End-^\n\n");
    new textHighlighter("^-Control Rod End-^", new Color(147, 10, 45), output);

  }

  public void connectionControlRod() {
    double stators = num;
    double highspeedConnectors = num * (1 / 2.0);
    append(ds.format(num) + " Electromagnetic Connection Rods / Minute:  " + ds.format(stators) + " Stators / minute |  " +
        ds.format(highspeedConnectors) + " High-Speed Connectors / minute. Requires  " + ds.format(num / 10) + " Assemblers\n\n");

    append("v-Connection Control Rod Start-v\n\n");
    new textHighlighter("v-Connection Control Rod Start-v", new Color(147, 10, 45), output);
    new Stator(stators, alternateRecipes, output);
    append("-----\n\n");
    new HighSpeedConnector(highspeedConnectors, alternateRecipes, output);
    append("^-Connection Control Rod End-^\n\n");
    new textHighlighter("^-Connection Control Rod End-^", new Color(147, 10, 45), output);
  }

}

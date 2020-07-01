/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item.intermediate;

import item.Item;
import item.ItemBase;

import javax.swing.*;
import java.util.Map;

/**
 * @author kiwi0
 */
public class AluminaSolution extends ItemBase {

  public AluminaSolution(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output);
    defaultAluminaSolution();
  }

  public void defaultAluminaSolution() {
    double silica = num / 4;
    double bauxite = num * (7 / 8.0);
    double water = num * (10 / 8.0);
    append(ds.format(num) + " Alumina Solution(m3) / Minute: and  " + ds.format(silica) + " Silica / Minute" +
        ":  " + ds.format(bauxite) + " Bauxite / minute |  " +
        ds.format(water) + " Water(m3) / minute. Requires  " + ds.format(num / 80) + " Refineries\n\n");
  }


}

package item.advanced;

import item.Item;
import item.ItemBase;
import item.basic.Concrete;
import item.basic.Quickwire;
import item.basic.Silica;
import item.intermediate.UraniumPellet;

import javax.swing.*;
import java.util.Map;

public class EncasedUraniumCell extends ItemBase {

  public EncasedUraniumCell(double num, Map<Item, JComboBox<String>> alternateRecipes, JTextArea output) {
    super(num, alternateRecipes, output, Item.URANIUM_CELL);

    switch (getAlternateRecipeSelectedItem()) {
      case "Default":
        defaultUraniumCell();
        break;
      case "Infused":
        infusedUraniumCell();
        break;
    }
  }

  public void infusedUraniumCell() {
    double uraniumPellets = num * (40 / 35.0);
    double sulfur = num * (45 / 35.0);
    double silica = num * (45 / 35.0);
    double quickWire = num * (75 / 35.0);
    append(ds.format(num) + " Infused Uranium Cells / Minute:  " + ds.format(uraniumPellets) + " Uranium Pellets / minute |  " +
        ds.format(sulfur) + " Raw Sulfur / minute |  " + ds.format(silica) + " Silica / Minute |  " +
        ds.format(quickWire) + " Quickwire / minute" +
        ". Requires " + ds.format(num / 17.5) + " Manufacturers\n\n");
    new UraniumPellet(uraniumPellets, alternateRecipes, output);
    new Silica(silica, alternateRecipes, output);
    new Quickwire(quickWire, alternateRecipes, output);
  }

  public void defaultUraniumCell() {
    double uraniumPellets = num * 4;
    double conrete = num * (9 / 10.0);
    append(ds.format(num) + " Uranium Cells / Minute:  " + ds.format(uraniumPellets) + " Uranium Pellets / minute |  " +
        ds.format(conrete) + " Concrete / minute. Requires  " + ds.format(num / 10) + " Assemblers\n\n");
    new UraniumPellet(uraniumPellets, alternateRecipes, output);
    new Concrete(conrete, alternateRecipes, output);

  }

}

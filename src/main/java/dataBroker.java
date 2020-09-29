import processing.core.PApplet;
import processing.data.Table;

import java.util.ArrayList;

public class dataBroker extends PApplet {

    PApplet p;
    Table dnd;
    ArrayList<Data> dataList = new ArrayList<Data>();


    dataBroker(PApplet p) {
        this.p = p;

    }

    void loadData() {
        dnd = p.loadTable("csv-deaths-natural-disasters.csv", "header"); //her bliver dataen lavet om til en array


        for (int i = 1; i < dnd.getRowCount(); i++) {
            for (int k = 1; k < dnd.getColumnCount(); k++) {
                String name = dnd.getString(i, 1);
                int dead = dnd.getInt(i, k);
                int year = dnd.getInt(0, k);

                Data dataObj = new Data(name, dead, year);
                dataList.add(dataObj);
            }
        }


    }

    public int getData(String land, int year) {
        int dea = 0;
        for (Data myObj : dataList) {
            if (year == myObj.year && land.equalsIgnoreCase(myObj.name)) {
                dea = myObj.deaths;
            }
        }
        return dea;
    }

 }





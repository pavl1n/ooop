import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

public class BotanicalGardenTableModel extends AbstractTableModel
{

    private int columnCount = 5;
    private LinkedList<Plant> dataArrayList;


    public BotanicalGardenTableModel()
    {
        dataArrayList = new LinkedList();

    }

    public int getRowCount()
    {
        return dataArrayList.size();
    }

    public int getColumnCount()
    {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Plant rows = dataArrayList.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return rows.getName();
            case 1: return rows.getFamily();
            case 2: return rows.getGenus();
            case 3: return rows.getSpecies();
            case 4: return rows.getAge();
        }
        return "";
    }
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Название";
            case 1:
                return "Семейство";
            case 2:
                return "Вид";
            case 3:
                return "Род";
            case 4:
                return "Возраст";
        }
        return "";
    }

    public void addData(Plant row)
    {
        dataArrayList.add(row);
        Collections.sort(dataArrayList);
    }

    public  LinkedList<Plant> findSimilar(String age)
    {
        LinkedList<Plant>  similarArrayList = new LinkedList();
        for(int i = 0; i < dataArrayList.size(); i++)
        {
            Plant row = dataArrayList.get(i);
            String currBrand = row.getAge();
            if (currBrand.equals(age))
            {
                similarArrayList.add(row);
            }
        }
        return similarArrayList;
    }

    public void clear()
    {
        dataArrayList.clear();
    }

    public void removeRow(int i)
    {
        dataArrayList.remove(i);
    }
}


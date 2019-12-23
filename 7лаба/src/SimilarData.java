import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class SimilarData extends JFrame{
    JTable similarTable;
    BotanicalGardenTableModel model;

    public SimilarData(LinkedList<Plant> similarArrayList)
    {
        super("Растения с одинаковым возрастом");
        setSize(new Dimension(600, 200));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        model = new BotanicalGardenTableModel();
        similarTable = new JTable(model);
        add(new JScrollPane(similarTable), BorderLayout.CENTER);
        for(int i = 0; i <  similarArrayList.size();i++)
        {
            model.addData(similarArrayList.get(i));
        }
    }
}

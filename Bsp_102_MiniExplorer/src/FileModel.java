
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class FileModel extends AbstractListModel {
    private ArrayList<File> files = new ArrayList<File>();
    @Override
    public int getSize() {
        return files.size();
    }

    @Override
    public Object getElementAt(int i) {
        return files.get(i);
    }
    
}

import java.io.File;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

class FileAdapter implements TreeModel{
	private File root; 
	public FileAdapter (File file) {
		root = file;
	}
	
	
	@Override
	public Object getChild(Object parent, int index) {
		
		File files[] = ((File)parent).listFiles(); 
		return files[index]; 
	}
	@Override
	public int getChildCount(Object parent) {
		File files[] = ((File)parent).listFiles();
		if (files== null) {
			return 0; 
		}else{
			return files.length;
		}
	}
	@Override
	public int getIndexOfChild(Object parent, Object child) {
		
		return 0;
	}
	@Override
	public Object getRoot() {
	
		return root;
	}
	@Override
	public boolean isLeaf(Object node) {
		return !((File)node).isDirectory();
	}
	@Override
	public void removeTreeModelListener(TreeModelListener arg0) {
	
		
	}
	
	@Override
	public void addTreeModelListener(TreeModelListener arg0) {}
	
	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {	}
} 

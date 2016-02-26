import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class FileAdapterExample extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		new FileAdapterExample(); 
	}
	
	public FileAdapterExample() { 
		JTree tree;
		FileAdapter treeNode;
		Container content = getContentPane();
			File f = new File("C:");
		treeNode = new FileAdapter(f);
		tree = new JTree(treeNode);
		content.add(new JScrollPane(tree),BorderLayout.CENTER);
		setSize(600, 375);
		setVisible(true);
	}
}


  
 


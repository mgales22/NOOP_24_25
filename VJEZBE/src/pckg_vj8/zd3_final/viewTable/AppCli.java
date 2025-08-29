package pckg_vj8.zd3_final.viewTable;

import javax.swing.SwingUtilities;

public class AppCli {
	
public static void main(String[] args) {
	
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			new AppFrame();
			
		}
	});
}

}

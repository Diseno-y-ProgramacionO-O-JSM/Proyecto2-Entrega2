package Intefaz;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextField;

public class asd {

	public static void enableDefaultValue(final JTextField tf, final String defaultValue) {
		tf.setText(defaultValue);
		tf.setForeground(Color.gray);	
		
		tf.addFocusListener(new FocusAdapter() {
		@Override
		public void focusGained(FocusEvent e) {
			if (tf.getText().equals(defaultValue)) {
				tf.setForeground(Color.black);
				tf.setText("");
			}
			super.focusGained(e);
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (tf.getText().equals("")) {
				tf.setForeground(Color.gray);
				tf.setText(defaultValue);
			}
			super.focusLost(e);
		}
		});
	}
}

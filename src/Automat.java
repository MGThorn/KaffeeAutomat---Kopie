import javax.swing.ImageIcon;

public class Automat {

	private int zustand;
	
	private int wasserStand;
	private int bohnenStand;
	private int milchStand;
	private Window w;

	Automat(){
		wasserStand = 100;
		bohnenStand = 100;
		milchStand = 100;

		zustand = 0;
		
	}

	public void setWindow(Window w){
		this.w = w;
	}


	public void zustandWechseln(char eingabe) {
		switch (zustand) {
		case 0: {
			switch (eingabe) {
			case 'y': {
				zustand = 1;
				w.onButton.setIcon(new ImageIcon(w.on_img));
				w.cup.setVisible(true);		
				w.on = 'n';
			} break;
			case 'n': {
				zustand = 0;
				w.onButton.setIcon(new ImageIcon(w.off_img));	
				w.cup.setVisible(false);
				w.on = 'y';
			} break;
			default:{
				w.on = 'y';
			}
			}
		} break;
		case 1: {
			switch (eingabe) {
			case 'y': {zustand = 2;} break;
			case 'n': {zustand = 1;} break;
			}
		} break;
		case 2: {
			switch (eingabe) {
			case 'y': {zustand = 3;} break;
			case 'n': {zustand = 2;} break;
			}
		} break;
		case 3: {
			switch (eingabe) {
			case '1': {zustand = 4;} break;
			case '2': {zustand = 5;} break;
			case '3': {zustand = 6;} break; 
			}
		} break;
		case 4: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			case '3': {zustand = 7;} break;
			}
		} break;
		case 5: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break; 
			case '3': {zustand = 7;} break;
			}
		} break;
		case 6: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			case '3': {zustand = 7;} break;
			}
		} break;
		case 7: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			}
		} break;
		}
	}
}

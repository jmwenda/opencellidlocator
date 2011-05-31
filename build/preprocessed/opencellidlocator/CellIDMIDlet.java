/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor

/**
 * @author maembe
 */



import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
 
public class CellIDMIDlet extends MIDlet implements CommandListener {
    private Form form;
    private Command exitCommand;
    private String S40_cell_id;   // Series 40 cell id property
    private String S60_cell_id;   // S60 cell id property
 
    public void startApp() {
        form = new Form("Getting Cell ID");
        S40_cell_id = System.getProperty("Cell-ID");
        S60_cell_id = System.getProperty("com.nokia.mid.cellid");
        form.append("Series 40 devices: " + S40_cell_id + "\n");
        form.append("S60 devices: " + S60_cell_id);
        exitCommand = new Command("Exit", Command.EXIT, 1);
        form.setCommandListener(this);
        form.addCommand(exitCommand);
        Display.getDisplay(this).setCurrent(form);
    }
 
    public void pauseApp() {
    }
 
    public void destroyApp(boolean unconditional) {
    }
 
    public void commandAction(Command c, Displayable d) {
        if (c == exitCommand) this.notifyDestroyed();
    }
}

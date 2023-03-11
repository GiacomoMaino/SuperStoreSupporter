package me.gm.sss.core;

import javafx.scene.control.Tab;
import javafx.scene.control.Menu;
import java.util.ArrayList;


public interface PluginInterface {
	
	/* Basic Information Methods */
	String getName();
	String getVersion();
	String getTabName();
	
	/* Basic JFX Methods*/
	Tab getTabStructure();
	ArrayList<Menu> getMenuBarElement();
	
	/* Basic Lifecycle Methods */
	void onLoad();
	void onStart();
	void onSuspend();
	void onResume();
	void onStop();
	void onUnload();
}

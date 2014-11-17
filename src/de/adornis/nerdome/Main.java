package de.adornis.nerdome;

		import android.app.Activity;
		import android.os.Bundle;
		import android.view.View;
		import android.widget.*;

		import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;

public class Main extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//fill sidebar with sample data
		ListView SidebarItems = (ListView) findViewById(R.id.SidebarItems);
		ArrayList testList = new ArrayList();
		for (int i = 0; i < 10; i++) {
			testList.add("Item" + i);
		}
		ArrayAdapter testItems = new ArrayAdapter(this,R.layout.item, testList);
		SidebarItems.setAdapter(testItems);


		//fill main thing with sample data
		ListView MainItems = (ListView) findViewById(R.id.MainItems);
		ExpandableListAdapter testMainItems = new SimpleExpandableListAdapter();
		MainItems.setAdapter(testItems);
	}
}

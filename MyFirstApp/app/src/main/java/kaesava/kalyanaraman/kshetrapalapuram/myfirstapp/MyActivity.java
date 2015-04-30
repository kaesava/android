package kaesava.kalyanaraman.kshetrapalapuram.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends Activity { //implements ListFragment.OnFragmentInteractionListener {
    public final static String EXTRA_MESSAGE = "kaesava.kalyanaraman.kshetrapalapuram.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = sharedPref.edit();
        //editor.putLong(getString(R.string.last_selected_item), 15);
        //editor.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.action_search:
                //openSearch();
                return true;
            case R.id.action_settings:
                //openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        //SharedPreferences sharedPref = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        //long defaultValue = getResources().getInteger(R.integer.last_selected_item_default);
        //long selectedItem = sharedPref.getLong(getString(R.string.last_selected_item), defaultValue);
        //message = message + " - " + Long.toString(selectedItem);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

//    @Override
//    public void onFragmentInteraction(int id) {
//        EditText editText = (EditText) findViewById(R.id.edit_message);
//
//        editText.setText(((Integer) id).toString());
//    }
}

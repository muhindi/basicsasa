package gekos.org.basicsnow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragOne extends Fragment {

	public FragOne() {
		// Required empty public constructor
	}

	//called for initial creation of the fragment
	//called after onAttach(Context) and before onCreateView(LayoutInflater,ViewGroup,Bundle)
	//initialize essential components here that should be retained when the fragment is paused,stopped
	//then resumed.
	@Override
	public void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
	}

	//called when drawing the UI for the first time, returns a view that is the root of the fragment's
	//layout. Null if the fragment does not provide a UI
	//called after onCreate(Bundle) and before onActivityCreated(Bundle)
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.frag_one, container, false);
	}

	//called when the user is leaving the fragment
	//used to persist any changes
	@Override
	public void onPause() {
		super.onPause();
	}
}

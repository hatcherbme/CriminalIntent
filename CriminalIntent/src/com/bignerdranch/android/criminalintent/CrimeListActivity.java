package com.bignerdranch.android.criminalintent;
import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.CrimeListFragment;


public class CrimeListActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		// TODO Auto-generated method stub
		return new CrimeListFragment();
	}

}

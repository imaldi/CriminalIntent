package com.aim2u.criminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

//7.2 Tweaking template code
public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //7.15 Getting the Fragment Manager
        //The FragmentManager hanles two things: a list of fragments and
        //a back stack of fragment transactions
        FragmentManager fm = getSupportFragmentManager();

        //7.16 Adding a CrimeFragment
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new CrimeFragment();
            //Create a new fragment transaction, include one add
            //operation in it, and then commit it

            //Fragment transactions are used to add,
            //remove, attach, detach, or replace
            //fragments in the fragment list.
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}

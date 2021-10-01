package com.example.groww.ui.addMoney.explore.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.groww.R
import com.example.groww.ui.addMoney.AddMoney
import kotlinx.android.synthetic.main.fragment_explore_abhi.*


class Explore : Fragment(R.layout.fragment_explore_abhi) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addMoneyExplore.setOnClickListener {
            val intent  = Intent(activity, AddMoney::class.java)
            startActivity(intent)
        }

    }

}
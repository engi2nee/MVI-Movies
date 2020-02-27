package com.c_od_e.movie.view.settings


import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import com.c_od_e.movie.R
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment(R.layout.fragment_settings) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
    }

    private fun initView() {

        btnPrivacy.setOnClickListener {
            findNavController().navigate(Uri.parse("mvimovie://agreement"))
        }
        btnAgreement.setOnClickListener {
//            val action = privacyPolicyFragment
//            findNavController().navigate(Uri.parse("www.mvimovie.com/privacy/name"))
        }
    }

}

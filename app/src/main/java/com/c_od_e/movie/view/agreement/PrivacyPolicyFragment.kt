package com.c_od_e.movie.view.agreement

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.c_od_e.movie.R
import kotlinx.android.synthetic.main.fragment_privacy_policy.*

class PrivacyPolicyFragment : Fragment(R.layout.fragment_privacy_policy) {
    private val args: PrivacyPolicyFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txName.text = args.name
    }
}

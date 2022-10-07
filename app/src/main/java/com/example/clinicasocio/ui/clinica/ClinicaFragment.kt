package com.example.clinicasocio.ui.clinica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.clinicasocio.databinding.FragmentClinicaBinding
import com.example.clinicasocio.viewmodel.ClinicaViewModel

class ClinicaFragment : Fragment() {

    private var _binding: FragmentClinicaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val clinicaViewModel =
            ViewModelProvider(this).get(ClinicaViewModel::class.java)

        _binding = FragmentClinicaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
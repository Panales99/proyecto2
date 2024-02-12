package com.example.proyecto_rafael

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class menuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        // Obtener referencia al botón "Salir"
        val btnSalir = view.findViewById<Button>(R.id.btnSalir)

        // Configurar OnClickListener para el botón "Salir"
        btnSalir.setOnClickListener {
            // Navegar de vuelta al fragmento de inicio (LoginFragment)
            findNavController().popBackStack(R.id.loginFragment, false)
        }

        // Obtener referencia al botón "Información Usuario"
        val btnUserInfo = view.findViewById<Button>(R.id.btnUserInfo)

        // Configurar OnClickListener para el botón "Información Usuario"
        btnUserInfo.setOnClickListener {
            // Navegar al fragmento UserInfoFragment
            findNavController().navigate(R.id.userInfoFragment)
        }

        return view
    }
}

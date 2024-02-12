package com.example.proyecto_rafael

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.proyecto_rafael.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogin.setOnClickListener {
            val username = binding.usernameEditText.text.toString()
            if (username.isNotEmpty()) {
                // Navegar al fragmento de menú y pasar el nombre de usuario como argumento
                val actionId = R.id.action_loginFragment_to_menuFragment
                findNavController().navigate(actionId, Bundle().apply {
                    putString("USERNAME", username)
                })
            } else {
                // Mostrar un mensaje de error si el campo de nombre de usuario está vacío
                // Esto es opcional, puedes agregar cualquier manejo de errores que desees
                // Aquí se muestra solo como un ejemplo
                binding.usernameEditText.error = "Por favor ingresa tu nombre de usuario"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

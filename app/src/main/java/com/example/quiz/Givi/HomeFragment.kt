package com.example.quiz.Givi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.quiz.R


class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var navController: NavController
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)








        }
    }



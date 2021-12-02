package com.app.kemanaaja.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.kemanaaja.Borobudur
import com.app.kemanaaja.R
import com.app.kemanaaja.databinding.FragmentHomeBinding
import com.app.kemanaaja.databinding.FragmentUserBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentHomeBinding.inflate(layoutInflater)

        bind.borobudur.setOnClickListener {
            val intent = Intent(requireContext(),Borobudur::class.java)
            startActivity(intent)
        }

        bind.aston.setOnClickListener {
            val intent = Intent(requireContext(),Borobudur::class.java)
            startActivity(intent)
        }

        bind.bajo.setOnClickListener {
            val intent = Intent(requireContext(),Borobudur::class.java)
            startActivity(intent)
        }

        bind.raja.setOnClickListener {
            val intent = Intent(requireContext(),Borobudur::class.java)
            startActivity(intent)
        }
        bind.lombok.setOnClickListener {
            val intent = Intent(requireContext(),Borobudur::class.java)
            startActivity(intent)
        }



        return bind.root
    }


}
package com.hayohtee.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)

        val editText = view.findViewById<EditText>(R.id.message_editText)

        val nextButton = view.findViewById<Button>(R.id.next_button)
        nextButton.setOnClickListener {
            val message: String = editText.text.toString()
            val direction = MessageFragmentDirections
                .actionMessageFragmentToEncryptedFragment(message)

            view.findNavController().navigate(direction)
        }

        return view
    }

}
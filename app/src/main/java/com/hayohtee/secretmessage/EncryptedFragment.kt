package com.hayohtee.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptedFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_encrypted, container, false)

        val message = EncryptedFragmentArgs.fromBundle(requireArguments()).message

        val encryptedTextView = view.findViewById<TextView>(R.id.encrypted_textView)
        encryptedTextView.text = message.reversed()     // encrypt the message by reversing it

        return view
    }
}
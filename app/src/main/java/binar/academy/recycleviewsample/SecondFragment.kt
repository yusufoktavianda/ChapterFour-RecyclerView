package binar.academy.recycleviewsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {
    private val arguments: SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val usernameTextView = view.findViewById<TextView>(R.id.username_view_fragmentsecond)
        val phoneNumberTextView = view.findViewById<TextView>(R.id.phonenuber_view_fragmentsecond)

        usernameTextView.text=arguments.contacts.username
        phoneNumberTextView.text=arguments.contacts.phoneNumber.toString()
    }
}
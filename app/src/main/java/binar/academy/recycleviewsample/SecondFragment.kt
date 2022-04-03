package binar.academy.recycleviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import binar.academy.recycleviewsample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val arguments: SecondFragmentArgs by navArgs()
    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_second, container, false)
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val usernameTextView = view.findViewById<TextView>(R.id.username_view_fragmentsecond)
//        val phoneNumberTextView = view.findViewById<TextView>(R.id.phonenuber_view_fragmentsecond)

        binding.usernameViewFragmentsecond.text=arguments.contacts.username
        binding.phonenuberViewFragmentsecond.text=arguments.contacts.phoneNumber.toString()
    }
}
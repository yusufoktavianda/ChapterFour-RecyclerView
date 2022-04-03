package binar.academy.recycleviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import binar.academy.recycleviewsample.data.User
import binar.academy.recycleviewsample.data.UserAdapter
import binar.academy.recycleviewsample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userList = listOf(
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
            User(
                "Yusuf Oktavianda",
                876262183
            ),
            User(
                "Yusuf lainnya",
                876262183
            ),
            User(
                "Yusuf Yusuf",
                876262183
            ),
        )

        val userAdapter = UserAdapter(userList)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.userRecyclerView.layoutManager = layoutManager
        binding.userRecyclerView.adapter = userAdapter
    }
}
package binar.academy.recycleviewsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import binar.academy.recycleviewsample.data.User
import binar.academy.recycleviewsample.data.UserAdapter

class FirstFragment : Fragment() {
    private lateinit var userRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userRecyclerView = view.findViewById(R.id.user_recycler_view)
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
        userRecyclerView.layoutManager = layoutManager
        userRecyclerView.adapter = userAdapter
    }
}
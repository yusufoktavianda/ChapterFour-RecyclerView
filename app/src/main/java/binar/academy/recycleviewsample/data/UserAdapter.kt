package binar.academy.recycleviewsample.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import binar.academy.recycleviewsample.FirstFragmentDirections
import binar.academy.recycleviewsample.R


class UserAdapter(private val user: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val usernameTextView: TextView = view.findViewById(R.id.username_textview)
        val phoneNumberTextView: TextView = view.findViewById(R.id.phonenumber_textview)
        val detailButton: Button = view.findViewById(R.id.detail_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.usernameTextView.text = user[position].username
        holder.phoneNumberTextView.text = user[position].phoneNumber.toString()
        holder.detailButton.setOnClickListener {
            val contacts = User(
                username = user[position].username,
                phoneNumber = user[position].phoneNumber
            )
            it.findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(contacts)
//                R.id.action_firstFragment_to_secondFragment
            )
        }
    }

    override fun getItemCount(): Int {
//        bisa return dengan integer atau dengan .size agar datanya fleksibel
//        return 10
        return user.size
    }
}
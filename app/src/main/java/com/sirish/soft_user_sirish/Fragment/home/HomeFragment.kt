package com.sirish.soft_user_sirish.Fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sirish.soft_user_sirish.R
import com.sirish.soft_user_sirish.adapter.StudentAdapter

class HomeFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>? = null
    private lateinit var rvdetails : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        rvdetails= root.findViewById(R.id.rvStudentDetails)


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvdetails.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = StudentAdapter(context)
        }
    }
}
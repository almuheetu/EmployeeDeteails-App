package com.example.employeedeteails_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.employeedeteails_app.databinding.FragmentEmployeeListBinding

class EmployeeListFragment : Fragment(), EmployeeAdapter.OnItemClickListener {
    private lateinit var binding: FragmentEmployeeListBinding
    private lateinit var employeeAdapter: EmployeeAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.employeeRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        employeeAdapter = EmployeeAdapter(employeeList, this)
        recyclerView.adapter = employeeAdapter

    }

    override fun onItemClick(employee: Employee) {
        val action =
            EmployeeListFragmentDirections.actionEmployeeListFragment3ToEmployeeDetailsFragment(
                employee
            )
        findNavController().navigate(action)
    }


}
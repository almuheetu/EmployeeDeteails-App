package com.example.employeedeteails_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.employeedeteails_app.databinding.EmployeeListBinding
import java.util.ArrayList

class EmployeeAdapter(
    private val employeeList: ArrayList<Employee>,
    private val listener: OnItemClickListener,


    ) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
    class ViewHolder(var binding: EmployeeListBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = EmployeeListBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val employee = employeeList[position]
        viewHolder.binding.employeeProfileImage.setImageResource(employee.image)
        viewHolder.binding.tvNameId.text = employee.name
        viewHolder.binding.tvTitleId.text = employee.title
        viewHolder.itemView.setOnClickListener {
            listener.onItemClick(employee)
        }


    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

    interface OnItemClickListener {
        fun onItemClick(employee: Employee)
    }
}
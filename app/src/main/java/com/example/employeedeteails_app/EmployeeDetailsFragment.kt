package com.example.employeedeteails_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.employeedeteails_app.databinding.FragmentEmployeeDetailsBinding


class EmployeeDetailsFragment : Fragment() {
    private lateinit var binding: FragmentEmployeeDetailsBinding
    private val args: EmployeeDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val employee = args.data
        binding.employeeProfileImage.setImageResource(employee.image)
        binding.tvEmployeeName.text = employee.name
        binding.tvEmployeeId.text = employee.id
        binding.tvEmployeeTitle.text = employee.title
        binding.tvEmployeeEmail.text = employee.email
        binding.tvEmployeeSalary.text = employee.salary
        binding.tvEmployeeAddress.text = employee.address
        binding.backBtn.setOnClickListener {
            requireActivity().onBackPressed()
        }


    }


}
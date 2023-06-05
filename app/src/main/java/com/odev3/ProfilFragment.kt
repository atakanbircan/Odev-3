package com.odev3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.odev3.adapter.ExperienceCustomAdapter
import com.odev3.adapter.RecyclViewAdapter
import com.odev3.adapter.RecyclerViewHobiesAdapter
import com.odev3.databinding.ActivityMainBinding
import com.odev3.databinding.FragmentProfilBinding
import com.odev3.service.ExperienceService
import com.odev3.service.HobyService

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfilFragment : Fragment() {

    private lateinit var binding: FragmentProfilBinding

    //private lateinit var listView: ListView
    val experienceService=ExperienceService()
    val hobyService=HobyService()
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfilBinding.inflate(inflater,container,false)

        return binding.root

        //val experienceCustomAdapter = ExperienceCustomAdapter(experienceService.experienceAll(),requireContext())
        //binding.experienceListView.adapter= experienceCustomAdapter

        /*val recyclerview = binding.experienceRecyclerView // this creates a vertical layout Manager recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager= LinearLayoutManager(requireContext())

        val adapter = RecyclViewAdapter(mList = experienceService.experienceAll())
        recyclerview.adapter = adapter
        Log.d("test",experienceService.experienceAll().size.toString())
*/


      //  binding.experienceRecyclerView.adapter= recylerAdapter
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = binding.experienceRecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = RecyclViewAdapter(mList = experienceService.experienceAll())
        recyclerView.adapter = adapter

        val recyclerViewHobiesView=binding.hobyRecyclerView
        recyclerViewHobiesView.setHasFixedSize(true)
        recyclerViewHobiesView.layoutManager = LinearLayoutManager(requireContext())
        val adapterHobby=RecyclerViewHobiesAdapter(hobyList =hobyService.hobbies())
        recyclerViewHobiesView.adapter=adapterHobby



    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfilFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfilFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
package com.helo.github

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("heloisa","onattach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("heloisa","oncreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("heloisa","oncreateview")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("heloisa","onviewcreated")
        var palavra: String="View Created"
        var numeroInteiro: Int=0
        var numeroQuebrado: Double=0.0
        var numeroQebrado2: Float=0f
        var boleano: Boolean=true
        var starredContainer= view.findViewById<View>(R.id.starred_container)
        starredContainer.setOnClickListener {
            Log.d("heloisa", "cliquei_starred")
            Toast.makeText(requireContext(), "starred_container", Toast.LENGTH_LONG).show()
        }
        var organationsContainer= view.findViewById<View>(R.id.organizations_container)
        organationsContainer.setOnClickListener {
            Log.d("heloisa", "cliquei_organizations")
            Toast.makeText(requireContext(), "organizations_container", Toast.LENGTH_LONG).show()
        }
        var repositoriesContainer= view.findViewById<View>(R.id.repositories_container)
        repositoriesContainer.setOnClickListener {
            Log.d("heloisa", "cliquei_repositories")
            Toast.makeText(requireContext(), "repositories_container", Toast.LENGTH_LONG).show()
        }
        var discussionsContainer= view.findViewById<View>(R.id.discussions_container)
        discussionsContainer.setOnClickListener {
            Log.d("heloisa","cliquei_discussions")
            Toast.makeText(requireContext(),"discussions_container",Toast.LENGTH_LONG).show()
        }
        var pullrequestContainer= view.findViewById<View>(R.id.pullrequest_container)
        pullrequestContainer.setOnClickListener {
            Log.d("heloisa","cliquei_pullrequest")
            Toast.makeText(requireContext(),"pullrequest_container",Toast.LENGTH_LONG).show()
        }
        var issuesContainer= view.findViewById<View>(R.id.issues_container)
        issuesContainer.setOnClickListener {
            Log.d("heloisa","cliquei_issues")
            Toast.makeText(requireContext(),"issues_container",Toast.LENGTH_LONG).show()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("heloisa","onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("heloisa","onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("heloisa","onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("heloisa","onstop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("heloisa","ondestroyview")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("heloisa","ondestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("heloisa","ondetach")
    }
}
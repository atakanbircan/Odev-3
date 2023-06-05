package com.odev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.odev3.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var anasayfaFragment: Fragment
    lateinit var profilFragment: Fragment
    lateinit var galeriFragment: Fragment
    lateinit var iletisimFragment: Fragment
    lateinit var blogFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        anasayfaFragment= AnasayfaFragment()
        profilFragment=ProfilFragment()
        galeriFragment=GaleriFragment()
        iletisimFragment=IletisimFragment()
        blogFragment = BlogFragment()

        replaceFragment(anasayfaFragment)

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.anasayfa -> replaceFragment(anasayfaFragment)
                R.id.blog -> replaceFragment(blogFragment)
                R.id.profil -> replaceFragment(profilFragment)
                R.id.galeri -> replaceFragment(galeriFragment)
                R.id.iletisim -> replaceFragment(iletisimFragment)

                else ->{


                }
            }
            true
        }

    }

    private fun replaceFragment(fragment:Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction= fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_Layout,fragment)
        fragmentTransaction.commit()
    }
}
package com.odev3

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlogFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var detailWebView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_blog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailWebView=view.findViewById(R.id.detailWebView)
        detailWebView.loadUrl("https://github.com/atakanbircan")



        val data = "Furkan Atakan Bircan Eskişehir Teknik Üniversitesinden yeni mezun Bilgisayar Mühendisiyim.2 yıldır Java ile kodlama yapıyorum,nesne tabanlı programlama,Agile Metodolojiler ve SpringBoot hakkında bilgi sahibiyim.Turkcell Geleceği Yazanlar Kotlin programı ile birlikte daha profesyonel bir Mobile Developer olma yolunda ilerliyorum. \n" +
                "<br>\n" +
                "<table  class=\"table table-hover\" ><thead><tr><th>Dil</th><th>Deneyim</th></tr></thead><tbody><tr><td>Kotlin</td><td>6 Ay</td></tr><tr><td>Java</td><td>2 Yıl</td></tr></tbody></table>"
        var accordion = "<div class=\"accordion\" id=\"accordionExample\"> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\"> Accordion Item #1 </button> </h2> <div id=\"collapseOne\" class=\"accordion-collapse collapse show\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the first item's accordion body.</strong> It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\"> Accordion Item #2 </button> </h2> <div id=\"collapseTwo\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the second item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> <div class=\"accordion-item\"> <h2 class=\"accordion-header\"> <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\"> Accordion Item #3 </button> </h2> <div id=\"collapseThree\" class=\"accordion-collapse collapse\" data-bs-parent=\"#accordionExample\"> <div class=\"accordion-body\"> <strong>This is the third item's accordion body.</strong> It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the <code>.accordion-body</code>, though the transition does limit overflow. </div> </div> </div> </div>"
        val html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\n" +
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "$data" +
                "<div class=\"ratio ratio-16x9\"> <iframe src=\"https://www.youtube.com/embed/1WEAJ-DFkHE?rel=0\" title=\"YouTube video\" allowfullscreen></iframe> </div>"
        "</div>\n" +
                "</body>\n" +
                "</html>"
        detailWebView.settings.javaScriptEnabled = true
        //detailWebView.loadData(html, "text/html", "utf-8")

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlokFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlogFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    class customWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading", "Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("onPageFinished", "Finish")
            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            Log.d("onPageStarted", "Start")
            super.onPageStarted(view, url, favicon)
        }


    }

}
package myapp.com

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import my.contributors_view_app.R
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL

fun getJsonFromURL(url: URL): String {
    var resultJson = ""
    var br = BufferedReader(InputStreamReader( url.openStream() ))

    for(line in br.lines()) resultJson += line

    return resultJson
}

fun main(args:Array<String>) {
    println(getJsonFromURL(URL("https://api.github.com/repositories/90792131/contributors")))
}
package com.example.layoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.layoutpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MovieClickListner {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateMovies()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = CardAdapter(movieList, mainActivity)
        }
    }

    override fun onClick(movie: Movie) {
        Intent(this, DetailActivity:: class.java).also {
            it.putExtra(MOVIE_ID_EXTRA, movie.id)
            startActivity(it)
        }
    }

    private fun populateMovies(){
        val movie1 = Movie(
            R.drawable.ce_poster,
            "Rohit Shetty",
             "Chennai Express",
            "Chennai Express is a 2013 Indian Hindi-language action comedy film[8][3] directed by Rohit Shetty and produced by Ronnie Screwvala, Siddharth Roy Kapur, Gauri Khan and Karim Morani, based on a story by K. Subash, with a screenplay written by Yunus Sajawal and dialogues by Farhad-Sajid. The film stars Shah Rukh Khan as Rahul Mithaiwala, a man who accidentally boards the eponymous train and journeys from Mumbai to Rameswaram with the daughter of a local don, played by Deepika Padukone. Nikitin Dheer and Sathyaraj play supporting roles."
        )
        movieList.add(movie1)

        val movie2 = Movie(
            R.drawable.pathaan_poster,
            "Sid Aanand",
            "Pathaan",
            "RAW Agent codenamed Pathaan takes on a menacing villain who is hell bent on ripping apart India's security apparatus."
        )
        movieList.add(movie2)

        val movie3 = Movie(
            R.drawable.ddlj_poster,
            "Adi Chopra",
            "DDLJ",
            "Dilwale Dulhania Le Jayenge, also known by the initialism DDLJ, is a 1995 Indian Hindi-language musical romance film written and directed by Aditya Chopra in his directorial debut and produced by his father Yash Chopra. Released on 20 October 1995, the film stars Shah Rukh Khan and Kajol. The plot revolves around Raj and Simran, two young non-resident Indians, who fall in love during a vacation through Europe with their friends. Raj tries to win over Simran's family so the couple can marry, but Simran's father has long since promised her hand to his friend's son. The film was shot in India, London, and Switzerland, from September 1994 to August 1995."
        )
        movieList.add(movie3)

        val movie4 = Movie(
            R.drawable.dearzindagi_poster,
            "Gauri Shinde",
            "Dear Zindagi",
            "Dear Zindagi is a 2016 Indian Hindi-language coming-of-age drama film written and directed by Gauri Shinde. It was produced by Gauri Khan, Karan Johar, and Shinde under the banners of Red Chillies Entertainment, Dharma Productions, and Hope Productions respectively. The film stars Alia Bhatt in the lead role along with Shah Rukh Khan. Ira Dubey, Kunal Kapoor, Angad Bedi, Ali Zafar, Yashaswini Dayama and Rohit Suresh Saraf are in supporting roles. The plot centres on a budding cinematographer who is discontented with her life and meets a free-spirited psychologist who helps her to gain a new perspective on her life."
        )
        movieList.add(movie4)

        val movie5 = Movie(
            R.drawable.dilwale_poster,
            "Rohit Shetty",
            "Dilwale",
            "Dilwale is an 2015 Indian Hindi-language action romantic comedy film directed by Rohit Shetty. The film stars Shah Rukh Khan, Kajol, Varun Dhawan and Kriti Sanon.[4][5] Varun Sharma, Vinod Khanna, Johnny Lever, Boman Irani, Kabir Bedi, Pankaj Tripathi, Mukesh Tiwari, Sanjay Mishra and Chetna Pande play supporting roles."
        )
        movieList.add(movie5)

        val movie6 = Movie(
            R.drawable.don2_poster,
            "Farhan Akhtar",
            "Don 2",
            "Don 2: The King Is Back, also known as Don 2, is a 2011 Indian Hindi-language action thriller film written, co-produced and directed by Farhan Akhtar. It is the second installment in the Don series. Jointly produced by Excel Entertainment and Red Chillies Entertainment, the film stars Shah Rukh Khan, Priyanka Chopra, Lara Dutta, Om Puri, Boman Irani and Kunal Kapoor. A sequel to the 2006 film Don (2006), Khan appears as the titular character."
        )
        movieList.add(movie6)

        val movie7 = Movie(
            R.drawable.don_poster,
            "Farhan Akhtar",
            "Don",
            "Don: The Chase Begins Again, better known simply as Don, is a 2006 Indian Hindi-language action thriller film directed by Farhan Akhtar. The film was produced by Ritesh Sidhwani and Akhtar's production company Excel Entertainment. The film stars Shah Rukh Khan and Priyanka Chopra as Don and Roma in lead roles respectively, where Khan plays the titular role.[3][4] Arjun Rampal, Isha Koppikar, Boman Irani, Pavan Malhotra, Rajesh Khattar and Om Puri appears in supporting roles. Kareena Kapoor makes a special appearance. "
        )
        movieList.add(movie7)

        val movie8 = Movie(
            R.drawable.fan_poster,
            "Manish Sharma",
            "FAN",
            "Fan is a 2016 Indian Hindi-language action thriller directed by Maneesh Sharma and co-written by Sharma and Habib Faisal. Produced by Aditya Chopra, the film stars Shah Rukh Khan in a dual role as filmstar Aryan Khanna and his obsessive fan Gaurav Chandna, who looks just like him. Gaurav beats up a rival actor to appease Aryan, but is instead punished by his idol; heartbroken, the fan plans revenge."
        )
        movieList.add(movie8)

        val movie9 = Movie(
            R.drawable.hny_poster,
            "Farah Khan",
            "Happy New Year",
            "Happy New Year (sometimes abbreviated as HNY) is a 2014 Indian action comedy heist film[3] directed by Farah Khan and produced by Gauri Khan under the banner of Red Chillies Entertainment. The film features an ensemble cast of Shah Rukh Khan, Deepika Padukone, Abhishek Bachchan, Sonu Sood, Boman Irani, Vivaan Shah and Jackie Shroff. It was distributed worldwide by Yash Raj Films.[4] In the film, a bunch of losers transform themselves into a team that wins over the hearts of the people in the city and across the world, all as part of their quest to pull off the biggest diamond heist ever seen."
        )
        movieList.add(movie9)

        val movie10 = Movie(
            R.drawable.jawan_poster,
            "ATLEE",
            "Jawan",
            "Jawan is an upcoming Indian Hindi-language action thriller film written and directed by Atlee. It stars Shah Rukh Khan in a dual role with Vijay Sethupathi, Nayanthara, Priyamani, Sanya Malhotra, and Deepika Padukone. The film's music is composed by Anirudh Ravichander."
        )
        movieList.add(movie10)

        movieList.add(movie5)
        movieList.add(movie3)
        movieList.add(movie1)
        movieList.add(movie9)
        movieList.add(movie4)
        movieList.add(movie8)


    }


}
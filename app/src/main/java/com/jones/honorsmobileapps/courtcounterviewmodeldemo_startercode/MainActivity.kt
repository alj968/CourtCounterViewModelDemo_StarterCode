package com.jones.honorsmobileapps.courtcounterviewmodeldemo_startercode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jones.honorsmobileapps.courtcounterviewmodeldemo_startercode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var scoreTeamA = 0
    private var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        updateTeamAScoreView()
        updateTeamBScoreView()

        setupClickListeners()
    }


    fun addPointsForTeamA(ptValue: Int) {
        scoreTeamA += ptValue
        updateTeamAScoreView()
    }


    fun addPointsForTeamB(ptValue: Int) {
        scoreTeamB += ptValue
        updateTeamBScoreView()
    }

    fun resetScore() {
        scoreTeamA = 0
        scoreTeamB = 0
        updateTeamAScoreView()
        updateTeamBScoreView()
    }

    fun updateTeamAScoreView() {
        binding.teamAScore.text = scoreTeamA.toString()

    }

    fun updateTeamBScoreView() {
        binding.teamBScore.text = scoreTeamB.toString()
    }

    private fun setupClickListeners() {
        binding.teamA3.setOnClickListener {
            addPointsForTeamA(3)
        }

        binding.teamB3.setOnClickListener {
            addPointsForTeamB(3)
        }

        binding.teamA2.setOnClickListener {
            addPointsForTeamA(2)
        }

        binding.teamB2.setOnClickListener {
            addPointsForTeamB(2)
        }

        binding.teamAFree.setOnClickListener {
            addPointsForTeamA(1)
        }

        binding.teamBFree.setOnClickListener {
            addPointsForTeamB(1)
        }

        binding.reset.setOnClickListener {
            resetScore()
        }
    }
}
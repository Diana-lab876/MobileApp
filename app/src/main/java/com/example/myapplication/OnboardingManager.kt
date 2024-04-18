package com.example.myapplication
import com.example.myapplication.model.OnboardingItem
import android.content.Context
import java.util.Queue
import java.util.LinkedList



class OnboardingManager(private val context: Context) {
    private val onboardingQueue: Queue<OnboardingItem> = LinkedList()

    init {
        // Инициализация очереди Onboarding элементов
        initializeOnboardingQueue()
    }

    private fun initializeOnboardingQueue() {
        val imageResIds = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)
        val text1 = arrayOf("Confidence in your words", "Take your time to learn", "The lessons you need to learn")
        val text2 = arrayOf("With conversation-based learning, you'll be talking from lesson one", "Develop a habit of learning and make it a part of your daily routine", "Using a variety of learning styles to learn and retain")
        val text3 = arrayOf("Skip onboarding", "Skip onboarding", "Skip onboarding")
        val buttonTexts = arrayOf("Next", "More", "Choose a language")
        val slider = intArrayOf(R.drawable.slider, R.drawable.slider1, R.drawable.slider2)

        for (i in imageResIds.indices) {
            val item = OnboardingItem(imageResIds[i], text1[i], text2[i], text3[i], buttonTexts[i], slider[i])
            onboardingQueue.offer(item)
        }
    }

    fun getNextOnboardingItem(): OnboardingItem? {
        // Извлечение следующего элемента из очереди
        return onboardingQueue.poll()
    }

    fun hasMoreOnboardingItems(): Boolean {
        // Проверка наличия еще элементов в очереди
        return onboardingQueue.isNotEmpty()
    }
}

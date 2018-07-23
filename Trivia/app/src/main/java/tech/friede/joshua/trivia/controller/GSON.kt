package tech.friede.joshua.trivia.controller

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import tech.friede.joshua.trivia.model.*
import tech.friede.joshua.trivia.model.questions.MultipleChoice
import tech.friede.joshua.trivia.model.questions.Question
import tech.friede.joshua.trivia.model.questions.TrueFalse

class GSON {
    companion object {

        private val QUESTION_ADAPTER_FACTORY: RuntimeTypeAdapterFactory<Question> = RuntimeTypeAdapterFactory.of(Question::class.java, "type")
                .registerSubtype(MultipleChoice::class.java)
                .registerSubtype(TrueFalse::class.java)

        private val mapper: Gson = GsonBuilder().registerTypeAdapterFactory(QUESTION_ADAPTER_FACTORY).create()



        fun GsonToQuiz(jsonQuiz: String): Quiz {
            val conversionType = object : TypeToken<Quiz>() {}.type
            return mapper.fromJson(jsonQuiz, conversionType)
        }

        fun QuizToGson(survey: Quiz): String {
            val conversionType = object : TypeToken<Quiz>() {}.type
            return mapper.toJson(survey, conversionType)
        }

        fun GsonToQuizResponse(jsonQuizResponse: String): QuizResponse {
            return mapper.fromJson(jsonQuizResponse, QuizResponse::class.java)
        }

        fun toGson(obj: Any): String {
            return mapper.toJson(obj)
        }


    }

}

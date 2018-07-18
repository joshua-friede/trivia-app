package tech.friede.joshua.trivia.controller

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import tech.friede.joshua.trivia.model.*

class GSON {
    companion object {

        private val answerAdapterFactory: RuntimeTypeAdapterFactory<Answer> = RuntimeTypeAdapterFactory.of(Answer::class.java, "type")
                .registerSubtype(MultipleChoiceAnswer::class.java)
                .registerSubtype(TrueFalseAnswer::class.java)

        private val questionAdapterFactory: RuntimeTypeAdapterFactory<Question> = RuntimeTypeAdapterFactory.of(Question::class.java, "type")
                .registerSubtype(MultipleChoiceQuestion::class.java)
                .registerSubtype(TrueFalseQuestion::class.java)

        private val mapper: Gson = GsonBuilder().registerTypeAdapterFactory(answerAdapterFactory).registerTypeAdapterFactory(questionAdapterFactory).create()



        fun GsonToQuiz(jsonQuiz: String): Quiz {
            val conversionType = object : TypeToken<Quiz>() {}.type
            return mapper.fromJson(jsonQuiz, conversionType)
        }

        fun QuizToGson(survey: Quiz): String {
            val conversionType = object : TypeToken<Quiz>() {}.type
            return mapper.toJson(survey, conversionType)
        }

        fun toGson(obj: Any): String {
            return mapper.toJson(obj)
        }

        fun GsonToString(json: String): String {
            return mapper.fromJson(json, String::class.java)
        }

        fun GsonToMap(json: String): Map<String, String> {
            val conversionType = object : TypeToken<Map<String, String>>() {}.type
            return mapper.fromJson(json, conversionType)
        }

        fun GsonToQuizList(json: String): List<Quiz> {
            val conversionType = object : TypeToken<List<Quiz>>() {}.type
            return mapper.fromJson(json, conversionType)
        }

        fun GsonToBoolean(json: String): Boolean {
            return mapper.fromJson(json, Boolean::class.java)
        }

        fun listOfQuizesToGson(list: List<Quiz>): String {
            val conversionType = object : TypeToken<List<Quiz>>() {}.type
            return mapper.toJson(list, conversionType)
        }

        fun QuizResponsesToGson(responses: HashMap<String, QuizResponse>): String {
            val conversionType = object : TypeToken<HashMap<String, QuizResponse>>() {}.type
            return mapper.toJson(responses, conversionType)
        }

        fun GsonToQuizResponses(responses: String): HashMap<String, QuizResponse> {
            val conversionType = object : TypeToken<HashMap<String, QuizResponse>>() {}.type
            //if (responses.isEmpty()) return hashMapOf()
            return mapper.fromJson(responses, conversionType)
        }

        fun questionsMapToGson(questions: HashMap<Int, Question>): String {
            val conversionType = object : TypeToken<HashMap<Int, Question>>() {}.type

            return mapper.toJson(questions, conversionType)
        }

        fun GsonToQuestionsMap(questions: String): HashMap<Int, Question> {
            val conversionType = object : TypeToken<HashMap<Int, Question>>() {}.type
            //if(questions.isNullOrEmpty()) return hashMapOf()
            return mapper.fromJson(questions, conversionType)
        }

    }

}

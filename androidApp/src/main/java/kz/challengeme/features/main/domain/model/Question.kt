package kz.challengeme.features.main.domain.model

data class Question(
    val question: String,
    val answerVariant: List<AnswerVariant>,
    val description: Description
) {
    val isSingleChoice: Boolean get() = answerVariant.count { it.isRight } == 1
    val isMultipleChoice: Boolean get() = answerVariant.count { it.isRight } > 1

    data class Description(
        val description: String,
        val references: List<String>,
    )
}

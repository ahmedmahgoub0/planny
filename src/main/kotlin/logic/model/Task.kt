package logic.model

data class Task(
    val id: Int? = null,
    val name: String? = null,
    val currentState: State? = null,
    val states: List<State> = emptyList()
)

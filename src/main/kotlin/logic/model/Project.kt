package logic.model

data class Project(
    val id: Int? = null,
    val name: String? = null,
    val currentState: State? = null,
    val tasks: List<Task> = emptyList(),
    val states: List<State> = emptyList()
)

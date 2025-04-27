package logic.model

import java.time.LocalDateTime

data class Audit(
    val id: Int? = null,
    val projectId: Int? = null,
    val taskId: Int? = null,
    val dataAndTime: LocalDateTime? = null,
    val changedBy: String? = null,
    // 
    val details: String? = null
)

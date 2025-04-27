package logic.model

data class User(
    val id: Int? = null,
    val name: String? = null,
    val userName: String? = null,
    val type: UserType = UserType.MATE
)

enum class UserType {
    ADMIN,
    MATE
}

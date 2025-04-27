package data.repositories

import data.DataSource
import logic.repositories.AuthenticationRepository

class AuthenticationRepositoryImpl (
    private val dataSource: DataSource
): AuthenticationRepository {

}
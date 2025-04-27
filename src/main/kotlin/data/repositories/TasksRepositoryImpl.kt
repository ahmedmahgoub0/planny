package data.repositories

import data.DataSource
import logic.repositories.TasksRepository

class TasksRepositoryImpl (
    private val dataSource: DataSource
): TasksRepository {

}
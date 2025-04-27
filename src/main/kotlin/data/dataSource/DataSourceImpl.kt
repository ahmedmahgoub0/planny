package data.dataSource

import data.database.UsersCsvParser
import logic.model.Audit
import logic.model.Project
import logic.model.Task
import logic.model.User

class DataSourceImpl(
    private val usersCsvParser: UsersCsvParser


): DataSource {
    override fun getAllUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override fun getAllProjects(): List<Project> {
        TODO("Not yet implemented")
    }

    override fun getAllTasks(): List<Task> {
        TODO("Not yet implemented")
    }

    override fun getAllAuditRecords(): List<Audit> {
        TODO("Not yet implemented")
    }
}
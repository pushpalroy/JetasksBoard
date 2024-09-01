package com.jetapps.jettaskboard.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.jetapps.jettaskboard.local.entity.BoardEntity
import com.jetapps.jettaskboard.local.entity.ListEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface DashboardDao {

    @Query("SELECT * FROM boardTable")
    fun getAllBoards(): Flow<List<BoardEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBoard(board: BoardEntity)

    @Delete
    fun deleteBoard(board: BoardEntity)

    @Update
    fun markBoardFavourite(board: BoardEntity)

    @Query("SELECT title FROM boardTable")
    fun getBoardNames(): List<String>

    @Query("SELECT * FROM listTable")
    fun getAllLists(): List<ListEntity>

    @Query("SELECT * FROM listTable where boardId = :boardId")
    fun getAllBoardRelatedLists(boardId: Long): List<ListEntity>
}

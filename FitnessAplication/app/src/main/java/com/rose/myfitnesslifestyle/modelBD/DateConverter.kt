package com.rose.myfitnesslifestyle.modelBD

import androidx.room.TypeConverter
import java.util.Date

object DateConverter {

    @TypeConverter
    fun toDate(dateLong: Long?) : Date?{
        return if(dateLong != null){
            Date(dateLong)
        }else null
    }

    @TypeConverter
    fun fromLong(date: Date?) : Long?{
        return date?.time
    }
}
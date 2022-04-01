package binar.academy.recycleviewsample.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User (
    val username:String? = null,
    val phoneNumber:Long? = null
):Parcelable
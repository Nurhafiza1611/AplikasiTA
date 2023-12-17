package com.aplikasita

import android.icu.text.CaseMap.Title
import android.media.Image


data class DataClass( var dataImage: Int, var dataTitle: String)
//    : Parcelable {
//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.readString()!!
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(dataImage)
//        parcel.writeString(dataTitle)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<DataClass> {
//        override fun createFromParcel(parcel: Parcel): DataClass {
//            return DataClass(parcel)
//        }
//
//        override fun newArray(size: Int): Array<DataClass?> {
//            return arrayOfNulls(size)
//        }
//    }
//}

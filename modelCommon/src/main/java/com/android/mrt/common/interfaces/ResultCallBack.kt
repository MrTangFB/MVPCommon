package com.android.mrt.common.interfaces

import com.google.gson.internal.`$Gson$Types`

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Created by Mr.T on 2018/3/17.
 */
abstract class ResultCallBack<T> {

    companion object {
        const val SUCCESS_CODE: Int = 200
        const val FAIL_CODE: Int = 505
        const val SUCCESS_MSG: String = "successful!"
        const val FAIL_MSG: String = "fail!"
    }

    /**
     * 泛型的类型，用于处理基本数据类型以外的数据
     */
    private var mType: Type

    init {
        mType = getSuperclassTypeParameter(javaClass)
    }

    private fun getSuperclassTypeParameter(subclass: Class<*>): Type {
        val superclass = subclass.genericSuperclass
        if (superclass is Class<*>) {
            throw RuntimeException("Missing Type Parameter!")
        }
        val parameterized = superclass as ParameterizedType
        return `$Gson$Types`.canonicalize(parameterized.actualTypeArguments[0])
    }

    fun getType(): Type {
        return mType
    }

    abstract fun onSuccess(data: T, code: Int = SUCCESS_CODE, msg: String = SUCCESS_MSG)

    abstract fun onFail(e: Exception, code: Int = FAIL_CODE, msg: String = FAIL_MSG)
}

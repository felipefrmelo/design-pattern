package mediator

enum class Reply {
    OK {
        override fun reason(reason: String): Reply {
            this.msg = reason
            return this
        }

        override var msg: String = "Ok"

    },
    DENY {
        override var msg: String = ""
        override fun reason(reason: String): Reply {
            this.msg = reason
            return this
        }


    };

    abstract fun reason(reason: String): Reply
    abstract var msg: String

}
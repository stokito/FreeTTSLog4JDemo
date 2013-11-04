class BootStrap {

    def init = { servletContext ->
        log.info('hello')
    }
    def destroy = {
    }
}

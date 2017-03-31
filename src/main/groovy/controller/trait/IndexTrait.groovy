package controller.trait

import grails.web.Action

/**
 * Created by eric on 31/03/17.
 */
trait IndexTrait {

    @Action
    def index(){
        render view:'/index'
    }

}
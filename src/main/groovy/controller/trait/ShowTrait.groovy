package controller.trait

import grails.web.Action

/**
 * Created by eric on 31/03/17.
 */
trait ShowTrait {


    @Action
    def show(Long id){
        render(view:'/edit', model:[id:id])
    }
}

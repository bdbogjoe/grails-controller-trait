package controller.trait


class HomeController implements IndexTrait, ShowTrait{

    def create(Long id){
        render(view:'/edit', model:[id:id])
    }

}

import school as school1

abstract class school {
    val name: String =""
     val  numberOfclasses:Int =0

  fun schoolInfo(){
        println("the name of shool is "+name +"the number of classes is"+ numberOfclasses)
    }

}
open class teacher : school1() {
      val nameOfTeacher:String =""
     val numerOfteacher:Int =0
    fun teacherInfo(){
        schoolInfo()
        println("the name of teacher is "+nameOfTeacher+"the number of teachers is"+ numerOfteacher)
    }



}
class student() : teacher() {
      val nameOfStud:String =""
      val numerOfstudent:Int =0

   fun studentInfo(){
       teacherInfo()
       println("the name of student is "+nameOfStud+"the number of student is"+ numerOfstudent)
   }


}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val student = student()
    student.studentInfo()

    val teacher = teacher()
    teacher.teacherInfo()




}